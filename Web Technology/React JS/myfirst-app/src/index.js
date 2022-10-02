import React, { useEffect, useState } from "react";
import ReactDOM from "react-dom/client";
import { useNavigate, useParams } from "react-router-dom";

const rootElement = document.getElementById("root");
const root = ReactDOM.createRoot(rootElement);


function Demo(){
    const params = useParams();
    const [data, setData] = useState([]);
    useEffect(()=>{
        fetch('http://127.0.0.1:45054')
        .then(res=>res.json())
        .then(res=>setData(res));
    }, [])

    const formatedData = data.map((d)=>{
        return(
            <table className="table table-primary table-striped table-hover text-center table-bordered table-sm table-responsive-sm">
                <tbody>
                    <tr>
                        <td className="h3">{d.RollNo} </td>
                        <td className="h3">{d.Name}</td>
                        <td><button type="button" className="btn btn-primary">Edit</button></td>
                        <td><button className="btn btn-outline-danger fw-bold" type="button"
                                    onClick={()=>{
                                        fetch("http://127.0.0.1:45054/" + params.RollNo,
                                        {
                                            method : "DELETE"
                                        })
                                        // .then(() => navigate("/faculties"))
                                    }}
                                >Delete</button></td>
                    </tr>
                </tbody>
            </table>
        );
    });

    return(
        <div className="p-5">
            {formatedData}
        </div>
    );
}

function Add(){
    const params = useParams();
    const [faculty, setFaculty] = useState();
    useEffect(()=>{
            fetch("http://127.0.0.1:45054/" + params.RollNo,
            {
                method : "GET"
            }
            )
            .then(res => res.json())
            .then(res => setFaculty(res));
        },[]);
    
    return(<>
        <input type="text" placeholder="Rno"
        onChange={(e)=>{
            setFaculty({...faculty, RollNo: e.target.value});
        }}/>
        <input type="text" placeholder="name"
        onChange={(e)=>{
            setFaculty({...faculty, Name: e.target.value});
        }}/>
        <button type="button" className="btn btn-primary"
            onClick={()=>{
                fetch("http://127.0.0.1:45054",
                                {
                                    method : "POST",
                                    body : JSON.stringify(faculty),
                                    headers : {
                                        "Content-Type" : "application/json"
                                    }
                                }, [])
                                // .then(()=>{
                                //     navigate('/');
                                // });
            }}
        >submit</button>
    </>);
}

root.render(<>
    <Demo/>
    <Add/>
</>);