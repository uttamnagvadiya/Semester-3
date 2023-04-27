import { useEffect, useState } from "react";
import { useNavigate, useParams } from "react-router-dom"
import { TbPhone } from "react-icons/tb";
import { IoLocationSharp } from "react-icons/io5";
import { GrMail } from "react-icons/gr";
import '../index.css';

function FacultyDetail() {

    let params = useParams();
    const navigate = useNavigate();
    const [data, setData] = useState({});

    useEffect(()=>{
        fetch("https://630c3f0f53a833c534263375.mockapi.io/FacultyProject/" + params.id)
        .then(res => res.json())
        .then(res => setData(res))
    })




    return (
        <div className="row justify-content-center border border-success p-2 ">
            <div className="col-3 border border-danger px-auto">
                <div className="card border-primary shadow" style={{width: "22rem"}}>
                    <img src={data.FacultyImage} className="card-img-top" alt="..."/>
                    <div className="card-body">
                        <div className="text-center">
                            <h5 className="card-title fw-bold h4">{data.FacultyName}</h5>
                            <p className="card-text text-danger fw-bold">{data.FacultyDesignation}</p>
                            <hr className="dropdown-divider"></hr>
                            <span class="d-block text-secondary">
                                    {data.FacultyQualification}
                            </span>
                            <hr className="dropdown-divider"></hr> 
                        </div>
                        <div className="px-3">
                            <table className="text-center" cellPadding={15}>
                                <tr>
                                    <td className="">
                                        <span className="fw-bold">Experience</span> <br/> <span className="exp p-1 text-primary rounded">{data.FacultyExperience}</span>
                                    </td>
                                    <td>
                                        <span className="fw-bold p-2">Working Since</span> <br/> <span className="text-secondary fw-bold p-1">{data.FacultyWorkingSince}</span>
                                    </td>
                                </tr>
                            </table>
                        </div>
                        <div><span className="fs-4 mx-3 p-2"><TbPhone /></span>+91 - {data.FacultyMobileNumber}</div>
                        <div><span className="fs-4 mx-4"><GrMail /></span>{data.FacultyEmail}</div>
                        <div className="mx-3 p-2"><span className="fs-4 me-4"><IoLocationSharp /></span> {data.FacultySeating}</div>
                    </div>
                </div>
            </div>
            <div className="col-8 border border-danger p-5">
                <h1 className="text-danger p-2"><em>Profile</em></h1>
                <hr className="dropdown-divider"></hr>

                <div className="container-sm p-3">
                    <p>
                        <em>Darshan University (DU), is a prominent organization offering a broad slate of academic programs and professional courses for undergraduate, graduate and postgraduate programs in Engineering, Science & Technology. 
                        The University is located in peaceful and sylvan surroundings with distinctive collegiate structure, about 19 km from Rajkot, Gujarat, India. It was established as an Engineering Institute in the year 2009, by Shree G. N. Patel Education & Charitable Trust with the objective to impart quality education and training in various fields of Engineering and Technology. 
                        It has now been transformed to the DARSHAN UNIVERSITY through an Act by the Government of Gujarat under Gujarat State Private Universities (Amendment) Act, 2021 (Act no. 15).</em>
                    </p>
                    <p>
                        <em>From its inception, the organization has grown steadily and created a unique identity in the field of Engineering & Technology by implementing skill and training-based foundation for education. 
                        The academic environment at the campus creates an ambience to promote creativity and exploration of technical skills. Darshan University is committed to the generation of knowledge, innovations and its contribution towards the development of the Nation.</em>
                    </p>
                </div>

                <table cellPadding={15}>
                    <tr>
                        <td className="fw-bold fs-5">Area of Specialization</td>
                    </tr>
                    <tr>
                        <td className="fw-bold fs-5">Subjects Taught</td>
                    </tr>
                    <tr>
                        <td className="">
                            <button type="button" className="btn btn-outline-secondary fw-bold"
                                onClick={()=>{
                                    navigate("/faculties");
                                }}
                            >Back</button>
                        </td>
                        <td>
                            <div className="py-3 d-md-block">
                                <button className="btn btn-outline-primary fw-bold mx-2" type="button" 
                                    onClick={() => {
                                        navigate("/faculty/edit/" + params.id);
                                    }}
                                >Edit</button>
                                <button className="btn btn-outline-danger fw-bold" type="button"
                                    onClick={()=>{
                                        fetch("https://630c3f0f53a833c534263375.mockapi.io/FacultyProject/" + params.id,
                                        {
                                            method : "DELETE"
                                        })
                                        .then(() => navigate("/faculties"))
                                    }}
                                >Delete</button>
                            </div>
                        </td>
                    </tr>
                </table>
            </div>
        </div>
    );
}

export default FacultyDetail;


