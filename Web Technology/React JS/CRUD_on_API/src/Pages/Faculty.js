import { useEffect, useState } from "react";
import { Link } from "react-router-dom";

function Faculty() {

    const [data, setData] = useState([]);

    useEffect(()=>{
        fetch("https://630c3f0f53a833c534263375.mockapi.io/FacultyProject")
        .then(res => res.json())
        .then(res => {
            setData(res); 
            console.log(res);
        })
    });

    let formatedFaculty = data.map((f)=>{
        return(
            <tr>
                <td>{f.FacultyName}</td>
                <td>{f.FacultyDesignation}</td>
                <td>
                    <Link to={"../faculty/"+f.id}>
                        <button type="button" className="btn btn-outline-dark">View</button>
                    </Link>
                </td>
            </tr>
        );
    })

    return (
        <div className="container-sm">
            <table className="table table-primary table-hover">
                <thead>
                    <tr>
                        <th scope="col">Faculty Name</th>
                        <th scope="col">Post</th>
                        <th scope="col">View Profile</th>
                    </tr>
                </thead>
                <tbody>
                    {formatedFaculty}
                </tbody>
            </table>
        </div>
    );
}

export default Faculty;