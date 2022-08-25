import { Outlet } from "react-router-dom";
import Footer from "./Components/Footer";
import Navbar from "./Components/Navbar";
function Layout() {
  return (
    <div className="container-fluid">
      <Navbar />
      <Outlet />
      <Footer />
    </div>
  );
}

export default Layout;