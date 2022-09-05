import React from "react";
import ReactDOM from "react-dom/client";
import {BrowserRouter, Route, Routes, } from "react-router-dom"
import Layout from "./Components/Layout";
import About from "./Pages/About";
import AddFaculty from "./Pages/AddFaculty";
import Faculty from "./Pages/Faculty";
import FacultyDetail from "./Pages/FacultyDetail";

const rootElement = document.getElementById("root");
const root = ReactDOM.createRoot(rootElement);

root.render(
    <BrowserRouter>
        <Routes>
            <Route path="/" element={<Layout />}>
                <Route index path="/faculties" element={<Faculty />}></Route>
                <Route path="/faculty/:id" element={<FacultyDetail />}></Route>
                <Route path="/addFaculty" element={<AddFaculty />}></Route>
                <Route path="/faculty/edit/:id" element={<AddFaculty />}></Route>
            </Route>
        </Routes>
    </BrowserRouter>
  );