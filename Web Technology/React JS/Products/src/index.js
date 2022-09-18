import React from "react";
import ReactDOM from "react-dom/client";
import Navbar from "./Components/Navbar";
import "./index.css";
import IndexPage from "./Pages/IndexPage";


const rootElement = document.getElementById("root");
const root = ReactDOM.createRoot(rootElement);

root.render(<>
    <Navbar/>
    <IndexPage />
    </>
);