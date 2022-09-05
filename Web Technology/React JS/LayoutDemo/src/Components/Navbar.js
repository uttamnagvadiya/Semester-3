import { Link } from "react-router-dom";

function Navbar() {
  return (
    <>
      <nav className="navbar navbar-expand-lg navbar-light">
        <nav className="navbar navbar-light">
          <div className="container-fluid">
            <a className="navbar-brand" href="#">
              <img
                src="https://darshan.ac.in/Content/media/DU_Logo.svg"
                alt=""
                width="75%"
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
          <div className="navbar-nav ms-auto fs-5 p-2">
            <Link to="/" className="nav-link active me-4">
              Home
              <hr className="dropdown-divider" />
            </Link>
            <Link to="/about" className="nav-link text-dark me-4">
              About
              <hr className="dropdown-divider" />
            </Link>
            <Link to="/contact" className="nav-link text-dark me-4">
              Contact Us
              <hr className="dropdown-divider" />
            </Link>
            <Link to="/exp10+faculties" className="nav-link text-dark me-4">
              Exp 10+ Faculties
              <hr className="dropdown-divider" />
            </Link>
            <Link to="/facultiesdetails" className="nav-link text-dark -4">
              Fauclty Details
              <hr className="dropdown-divider" />
            </Link>
          </div>
        </div>
      </nav>
    </>
  );
}

export default Navbar;
