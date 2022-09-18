function IndexPage() {
    return(
        <div className="container-fluid">
            <div className="row justify-content-center">
                <div className="col-9 m-4">
                    <div
                        id="carouselExampleIndicators"
                        class="carousel slide"
                        data-bs-ride="true"
                    >
                        <div class="carousel-indicators">
                            <button
                                type="button"
                                data-bs-target="#carouselExampleIndicators"
                                data-bs-slide-to="0"
                                class="active"
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
                        <div class="carousel-inner">
                            <div class="carousel-item active">
                                <img
                                    src="https://i.pinimg.com/originals/58/54/b0/5854b0a344a0df1054d4959a96bc740c.jpg"
                                    class="d-block w-100"
                                    alt="..."
                                />
                            </div>
                            <div class="carousel-item">
                                <img
                                    src="https://bestmediainfo.com/uploads/2022/09/1663039674.Alia-Bhatt.jpg"
                                    class="d-block w-100"
                                    alt="..."
                                />
                            </div>
                            <div class="carousel-item">
                                <img
                                    src="https://wallpaperaccess.com/full/672207.jpg"
                                    class="d-block w-100"
                                    alt="..."
                                />
                            </div>
                            <div class="carousel-item">
                                <img
                                    src="https://i.pinimg.com/originals/ef/04/49/ef044969b6f886b7f9545ac53893f005.jpg"
                                    class="d-block w-100"
                                    alt="..."
                                />
                            </div>
                            <div class="carousel-item">
                                <img
                                    src="https://wallpapercave.com/wp/H1q0n7h.jpg"
                                    class="d-block w-100"
                                    alt="..."
                                />
                            </div>
                            <div class="carousel-item">
                                <img
                                    src="https://media.gq-magazine.co.uk/photos/603f78b46ea5d542cb3f0e9f/master/pass/TVS-UNDER-%C2%A3500-header.jpg"
                                    class="d-block w-100"
                                    alt="..."
                                />
                            </div>
                        </div>
                        <button
                            class="carousel-control-prev"
                            type="button"
                            data-bs-target="#carouselExampleIndicators"
                            data-bs-slide="prev"
                        >
                            <span
                                class="carousel-control-prev-icon"
                                aria-hidden="true"
                            ></span>
                            <span class="visually-hidden">Previous</span>
                        </button>
                        <button
                            class="carousel-control-next"
                            type="button"
                            data-bs-target="#carouselExampleIndicators"
                            data-bs-slide="next"
                        >
                            <span
                                class="carousel-control-next-icon"
                                aria-hidden="true"
                            ></span>
                            <span class="visually-hidden">Next</span>
                        </button>
                    </div>
                </div>
            </div>
        </div>
    );
}

export default IndexPage;