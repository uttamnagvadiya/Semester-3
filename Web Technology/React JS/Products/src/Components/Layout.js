import { Outlet } from "react-router-dom";
import IndexPage from "../Pages/IndexPage";
import Footer from "./Footer";
import Navbar from "./Navbar";

function Layout() {
    return(
        <>
            <Navbar />
            <Outlet />
            <Footer />
        </>
    );
}

export default Layout;