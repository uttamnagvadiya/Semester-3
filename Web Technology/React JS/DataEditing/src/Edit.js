import { useState } from "react";
import "./index.css";

let position = -1;
function Edit() {
  const [text, setText] = useState([
    {
      userName: "Uttam",
      password: "Uttam@123",
      mobileNo: "1234567890"
    }
  ]);

  const [data, setData] = useState({});

  let formatedText = text.map((t, index) => {
    return (
      <tr>
        <td>{t.userName}</td>
        <td>{t.password}</td>
        <td>{t.mobileNo}</td>
        <td>
          <button
            type="button"
            className="btn btn-outline-primary fw-bold"
            onClick={() => {
              position = index;
              setData({
                ...data,
                userName: text[index].userName,
                password: text[index].password,
                mobileNo: text[index].mobileNo
              });
            }}
          >
            Edit
          </button>
        </td>
        <td>
          <button
            type="button"
            className="btn btn-outline-danger fw-bold"
            onClick={() => {
              text.splice(index, 1);
              setText([...text]);
            }}
          >
            Delete
          </button>
        </td>
      </tr>
    );
  });

  return (
    <>
      <div className="container-fluid">
        <div className="row justify-content-center p-4">
          <div className="col m-2 p-5 border border-dark">
            <form>
              <div className="my-5 row">
                <label
                  htmlFor="inputUserName"
                  className="col-xs-4 col-form-label fs-4 h1"
                >
                  UserName :{" "}
                </label>
                <div className="col-xs-8">
                  <input
                    type="text"
                    className="form-control border border-dark"
                    id="inputName"
                    onChange={(event) => {
                      setData({ ...data, userName: event.target.value });
                    }}
                    value={data.userName}
                    placeholder="UserName"
                  />
                </div>
              </div>
              <div className="my-5 row">
                <label
                  htmlFor="inputPassword"
                  className="col-xs-4 col-form-label fs-4 h1"
                >
                  Password :{" "}
                </label>
                <div className="col-xs-8">
                  <input
                    type="password"
                    className="form-control border border-dark"
                    id="inputPassword"
                    onChange={(event) => {
                      setData({ ...data, password: event.target.value });
                    }}
                    value={data.password}
                    placeholder="Password"
                  />
                </div>
              </div>
              <div className="my-5 row">
                <label
                  htmlFor="inputName"
                  className="col-xs-4 col-form-label fs-4 h1"
                >
                  Mobile No :{" "}
                </label>
                <div className="col-xs-8">
                  <input
                    type="number"
                    className="form-control border border-dark"
                    id="inputMobileNo"
                    onChange={(event) => {
                      setData({ ...data, mobileNo: event.target.value });
                    }}
                    value={data.mobileNo}
                    placeholder="contact number"
                    pattern="[0-9]{10}"
                  />
                </div>
              </div>

              <div className="mb-3 row">
                <div className="offset-sm-3  col-sm-8">
                  <button
                    type="button"
                    className="btn btn-success fs-5"
                    onClick={(e) => {
                      if (position > -1) {
                        text[position] = data;
                        position = -1;
                      } else {
                        setText([...text, data]);
                      }
                      setData({
                        ...data,
                        userName: "",
                        password: "",
                        mobileNo: ""
                      });
                      e.preventDefault();
                    }}
                  >
                    Submit
                  </button>
                </div>
              </div>
            </form>
          </div>
          <div className="col border border-dark m-2">
            <table className="table table-success text-center">
              <thead>
                <tr>
                  <th scope="col">UserName</th>
                  <th scope="col">Password</th>
                  <th scope="col">Mobile No</th>
                  <th scope="col">Edit</th>
                  <th scope="col">Delete</th>
                </tr>
              </thead>
              <tbody>{formatedText}</tbody>
            </table>
          </div>
        </div>
      </div>
    </>
  );
}

export default Edit ;