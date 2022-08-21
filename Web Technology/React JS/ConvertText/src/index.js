import React from "react";
import ReactDOM from "react-dom/client";

import Navbar from './Components/Navbar';
import TextForm from './Components/TextForm'

const rootElement = document.getElementById("root");
const root = ReactDOM.createRoot(rootElement);

root.render(
    <>
        <Navbar/>
        <TextForm/>
    </>
);