import React from "react";
import ReactDOM from "react-dom/client";
import { BrowserRouter, Route, Routes} from "react-router-dom";
import Layout from "./Components/Layout";
import About from "./Pages/About";
import IndexPage from "./Pages/IndexPage";


const rootElement = document.getElementById("root");
const root = ReactDOM.createRoot(rootElement);

root.render(
    <BrowserRouter>
        <Routes>
            <Route path="/" element={<Layout/>}>
                <Route index element={<IndexPage/>}></Route>
                <Route path="/about" element={<About/>}></Route>
            </Route>
        </Routes>
    </BrowserRouter>
);

