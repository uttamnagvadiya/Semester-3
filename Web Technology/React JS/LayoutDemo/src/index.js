import React from "react";
import ReactDOM from "react-dom/client";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import About from "./Pages/About";
import Contact from "./Pages/Contact";
import Experience from "./Pages/Exp10+Faculties";
import FacultyDetails from "./Pages/FacultyDetails";
import Home from "./Pages/Home";
import Layout from "./Layout";

const rootElement = document.getElementById("root");
const root = ReactDOM.createRoot(rootElement);

root.render(
  <BrowserRouter>
    <Routes>
      <Route path="/" element={<Layout />}>
        <Route index element={<Home />}></Route>
        <Route path="/about" element={<About />}></Route>
        <Route path="/contact" element={<Contact />}></Route>
        <Route path="/exp10+faculties" element={<Experience />}></Route>
        <Route path="/facultiesDetails" element={<FacultyDetails />}></Route>
      </Route>
    </Routes>
  </BrowserRouter>
);
