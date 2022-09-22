import { Link, useNavigate } from "react-router-dom";
import {BsPersonCircle} from "react-icons/bs";
import {FaShoppingCart} from "react-icons/fa";
import {ImSearch} from "react-icons/im";
import {HiDotsVertical} from "react-icons/hi";
import {RiHome4Fill} from "react-icons/ri";

function Navbar() {

    const navigate = useNavigate();

    return(
        <>    
            <div className="nav row justify-content-end p-3 sticky-top bg-light">
                <div className="col-4 h3 px-5"><RiHome4Fill
                    onClick={()=> navigate("/")}
                />
                </div>
                <div className="col-8">
                    <div className="row justify-content-end">
                        <div className="col-8">
                            <form className="d-flex">
                                <input className="form-control me-2" type="search" placeholder="Search" aria-label="Search" />
                                <button className="btn btn-outline-dark" type="submit"><ImSearch /></button>
                            </form>
                        </div>
                        <div className="col-4 text-end h4">
                            <div className="mx-3 float-end"><HiDotsVertical/></div>
                            <div className="mx-3 float-end"><FaShoppingCart/></div>
                            <div className="mx-3 float-end"><BsPersonCircle/></div>
                        </div>
                    </div>
                </div>
            </div>
        </>    
    );
}

export default Navbar;