import { useEffect, useState } from "react";

function FetchingAPI(){
    const[data, setData] = useState([]);
    useEffect(()=>{
        fetch("https://630c3f0f53a833c534263375.mockapi.io/FacultyProject")
        .then(res => 
            res.json())
        .then(res => {
            setData(res);
            console.log(data);
        })
    });

    const formatedFaculty = data.map((f)=>{
        return(
            <div className="card col-md-3 m-2" style={{width: "18rem"}}>
                <img src={f.FacultyImage} className="card-img-top" alt="..."/>
                <div className="card-body">
                    <h5 className="card-title">{f.FacultyName}</h5>
                    <p className="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                    <a href="#" className="btn btn-primary">Go somewhere</a>
                </div>
            </div>
        );
    });

    return(<div className="row">
        {formatedFaculty}
    </div>);
}

export default FetchingAPI;