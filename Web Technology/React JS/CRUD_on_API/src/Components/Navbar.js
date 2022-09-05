import { Link } from "react-router-dom";

function Navbar() {
    return (
        <nav className="navbar navbar-expand-lg navbar-light bg-light sticky-top">

            <nav className="navbar navbar-light px-3">
                <div className="container-fluid">
                    <a className="navbar-brand" href="#">
                        <img
                            src="https://darshan.ac.in/Content/media/DU_Logo.svg"
                            alt=""
                            width="80%"
                            height="70vh"
                            className="d-inline-block align-text-top"
                        />
                    </a>
                </div>
            </nav>

            <button
            className="navbar-toggler ms-auto"
            style={{ border: "2px solid grey" }}
            type="button"
            data-bs-toggle="collapse"
            data-bs-target="#navbarNavAltMarkup"
            aria-controls="navbarNavAltMarkup"
            aria-expanded="false"
            aria-label="Toggle navigation"
            >
                <span className="navbar-toggler-icon"></span>
            </button>

            <div className="collapse navbar-collapse" id="navbarNavAltMarkup">
                <div className="navbar-nav ms-auto fs-5 p-1">
                    <Link to="/faculties" className="nav-link active me-4">
                        Faculty
                        <hr className="dropdown-divider" />
                    </Link>
                    <Link to="/addFaculty" className="nav-link active me-4">
                        Add Faculty
                        <hr className="dropdown-divider" />
                    </Link>
                </div>
            </div>
        </nav>
    )
}

export default Navbar;