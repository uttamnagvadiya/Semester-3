import { useEffect, useState } from "react";
import "../index.css";

function IndexPage() {

    useEffect(()=>{
        fetch('https://630c3f0f53a833c534263375.mockapi.io/Category')
        .then(res => res.json())
        .then(res => setData(res));
    }, []);

    const [data, setData] = useState([]);

    const formatedProduct = data.map((pro)=>{
        return(
            <div className="card category-card col-sm-4 mx-2 my-5 shadow" style={{width: "12rem"}}>
                    <img src={pro.image} className="card-img-top" alt="..."/>
                <div className="card-body text-center">
                    <button type="button" className="btn btn-outline-dark w-100 fw-bolder"><em>{pro.name}</em></button>
                </div>
            </div>
        );
    });


    return(
        <>
            <div className="container-fluid">
                <div className="row justify-content-center">
                    <div className="col-9 m-4">
                        <div
                            id="carouselExampleIndicators"
                            className="carousel slide"
                            data-bs-ride="true"
                        >
                            <div className="carousel-indicators">
                                <button
                                    type="button"
                                    data-bs-target="#carouselExampleIndicators"
                                    data-bs-slide-to="0"
                                    className="active"
                                    aria-current="true"
                                    aria-label="Slide 1"
                                ></button>
                                <button
                                    type="button"
                                    data-bs-target="#carouselExampleIndicators"
                                    data-bs-slide-to="1"
                                    aria-label="Slide 2"
                                ></button>
                                <button
                                    type="button"
                                    data-bs-target="#carouselExampleIndicators"
                                    data-bs-slide-to="2"
                                    aria-label="Slide 3"
                                ></button>
                                <button
                                    type="button"
                                    data-bs-target="#carouselExampleIndicators"
                                    data-bs-slide-to="3"
                                    aria-label="Slide 4"
                                ></button>
                                <button
                                    type="button"
                                    data-bs-target="#carouselExampleIndicators"
                                    data-bs-slide-to="4"
                                    aria-label="Slide 5"
                                ></button>
                                <button
                                    type="button"
                                    data-bs-target="#carouselExampleIndicators"
                                    data-bs-slide-to="5"
                                    aria-label="Slide 6  "
                                ></button>
                            </div>
                            <div className="carousel-inner">
                                <div className="carousel-item active">
                                    <img
                                        src="https://i.pinimg.com/originals/58/54/b0/5854b0a344a0df1054d4959a96bc740c.jpg"
                                        className="d-block w-100"
                                        alt="..."
                                    />
                                </div>
                                <div className="carousel-item">
                                    <img
                                        src="https://bestmediainfo.com/uploads/2022/09/1663039674.Alia-Bhatt.jpg"
                                        className="d-block w-100"
                                        alt="..."
                                    />
                                </div>
                                <div className="carousel-item">
                                    <img
                                        src="https://wallpaperaccess.com/full/672207.jpg"
                                        className="d-block w-100"
                                        alt="..."
                                    />
                                </div>
                                <div className="carousel-item">
                                    <img
                                        src="https://i.pinimg.com/originals/ef/04/49/ef044969b6f886b7f9545ac53893f005.jpg"
                                        className="d-block w-100"
                                        alt="..."
                                    />
                                </div>
                                <div className="carousel-item">
                                    <img
                                        src="https://wallpapercave.com/wp/H1q0n7h.jpg"
                                        className="d-block w-100"
                                        alt="..."
                                    />
                                </div>
                                <div className="carousel-item">
                                    <img
                                        src="https://media.gq-magazine.co.uk/photos/603f78b46ea5d542cb3f0e9f/master/pass/TVS-UNDER-%C2%A3500-header.jpg"
                                        className="d-block w-100"
                                        alt="..."
                                    />
                                </div>
                            </div>
                            <button
                                className="carousel-control-prev"
                                type="button"
                                data-bs-target="#carouselExampleIndicators"
                                data-bs-slide="prev"
                            >
                                <span
                                    className="carousel-control-prev-icon"
                                    aria-hidden="true"
                                ></span>
                                <span className="visually-hidden">Previous</span>
                            </button>
                            <button
                                className="carousel-control-next"
                                type="button"
                                data-bs-target="#carouselExampleIndicators"
                                data-bs-slide="next"
                            >
                                <span
                                    className="carousel-control-next-icon"
                                    aria-hidden="true"
                                ></span>
                                <span className="visually-hidden">Next</span>
                            </button>
                        </div>
                    </div>
                </div>
            </div>

            <div className="category container my-5">
                <div className="row justify-content-center">
                    {formatedProduct}
                </div>
            </div>
        </>
    );
}

export default IndexPage;