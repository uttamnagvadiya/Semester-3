import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom";

function AddFaculty() {
    const params = useParams();
    const navigate = useNavigate();
    const initialState = {
        FacultyName: "",
        FacultyDesignation: "",
        FacultyQualification: "",
        FacultyExperience: "",
        FacultyWorkingSince: "",
        FacultyMobileNumber: "",
        FacultyEmail: "",
        FacultySeating: "",
        FacultyAreaSpecialization: "",
        FacultySubjectsTaught: "",
        FacultyImage: ""
    }
    const [faculty, setFaculty] = useState(initialState);

    useEffect(() => {
        if (params.id != null) {
            fetch("https://630c3f0f53a833c534263375.mockapi.io/FacultyProject/" + params.id,
                {
                    method: "GET"
                }
            )
                .then(res => res.json())
                .then(res => setFaculty(res));
        }
        else {
            setFaculty(initialState);
        }
    }, [params]);

    return (
        <div className="container-sm add border border-primary rounded p-5">
            <form>
                <div className="mb-4">
                    <label className="form-label h5">Faculty Name : </label>
                    <input type="text" className="form-control"
                        value={faculty.FacultyName}
                        onChange={(e) => {
                            setFaculty({ ...faculty, FacultyName: e.target.value });
                        }}
                    />
                </div>
                <div className="mb-4">
                    <label className="form-label h5"> Designation : </label>
                    <input type="text" className="form-control"
                        value={faculty.FacultyDesignation}
                        onChange={(e) => {
                            setFaculty({ ...faculty, FacultyDesignation: e.target.value });
                        }}
                    />
                </div>
                <div className="mb-4">
                    <label className="form-label h5"> Qualification : </label>
                    <input type="text" className="form-control"
                        value={faculty.FacultyQualification}
                        onChange={(e) => {
                            setFaculty({ ...faculty, FacultyQualification: e.target.value });
                        }}
                    />
                </div>
                <div className="row justify-content-center mb-4">
                    <div className="col-6">
                        <label className="form-label h5"> Experience : </label>
                        <input type="text" className="form-control"
                            value={faculty.FacultyExperience}
                            onChange={(e) => {
                                setFaculty({ ...faculty, FacultyExperience: e.target.value });
                            }}
                        />
                    </div>
                    <div className="col-6">
                        <label className="form-label h5"> Working Since : </label>
                        <input type="text" className="form-control"
                            value={faculty.FacultyWorkingSince}
                            onChange={(e) => {
                                setFaculty({ ...faculty, FacultyWorkingSince: e.target.value });
                            }}
                        />
                    </div>
                </div>
                <div className="mb-4">
                    <label className="form-label h5"> Email Address : </label>
                    <input type="email" className="form-control"
                        value={faculty.FacultyEmail}
                        onChange={(e) => {
                            setFaculty({ ...faculty, FacultyEmail: e.target.value });
                        }}
                    />
                </div>
                <div className="row justify-content-center mb-4">
                    <div className="col-6">
                        <label className="form-label h5"> Mobile Number : </label>
                        <input type="number" className="form-control"
                            value={faculty.FacultyMobileNumber}
                            onChange={(e) => {
                                setFaculty({ ...faculty, FacultyMobileNumber: e.target.value });
                            }}
                        />
                    </div>
                    <div className="col-6">
                        <label className="form-label h5"> Seating : </label>
                        <input type="text" className="form-control"
                            value={faculty.FacultySeating}
                            onChange={(e) => {
                                setFaculty({ ...faculty, FacultySeating: e.target.value });
                            }}
                        />
                    </div>
                </div>
                <div className="mb-4">
                    <label className="form-label h5">Area of Specialization : </label>
                    <input type="text" className="form-control"
                        value={faculty.FacultyAreaSpecialization}
                        onChange={(e) => {
                            setFaculty({ ...faculty, FacultyAreaSpecialization: e.target.value });
                        }}
                    />
                </div>
                <div className="mb-4">
                    <label className="form-label h5">Subjects Taughts : </label>
                    <input type="text" className="form-control"
                        value={faculty.FacultySubjectsTaught}
                        onChange={(e) => {
                            setFaculty({ ...faculty, FacultySubjectsTaught: e.target.value });
                        }}
                    />
                </div>
                <div className="mb-4">
                    <label className="form-label h5">Image URL : </label>
                    <input type="text" className="form-control"
                        value={faculty.FacultyImage}
                        onChange={(e) => {
                            setFaculty({ ...faculty, FacultyImage: e.target.value });
                        }}
                    />
                </div>
                <div className="my-5 text-center">
                    <input type="button" value="Submit" className="btn btn-primary fw-bold"
                        onClick={() => {
                            if (params.id > 0) {
                                fetch("https://630c3f0f53a833c534263375.mockapi.io/FacultyProject/" + params.id,
                                    {
                                        method: "PUT",
                                        body: JSON.stringify(faculty),
                                        headers: {
                                            "Content-Type": "application/json"
                                        }
                                    })
                                    .then(() => {
                                        navigate('/faculties');
                                    });
                            }
                            else {
                                fetch("https://630c3f0f53a833c534263375.mockapi.io/FacultyProject",
                                    {
                                        method: "POST",
                                        body: JSON.stringify(faculty),
                                        headers: {
                                            "Content-Type": "application/json"
                                        }
                                    })
                                    .then(() => {
                                        navigate('/faculties');
                                    });
                            }
                        }}
                    />
                </div>
            </form>
        </div>
    );
}

export default AddFaculty;