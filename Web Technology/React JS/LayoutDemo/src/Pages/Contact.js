function Contact() {
    return (
      <div className="row justify-content-center m-3">
        <form
          className="col-md-10 p-5"
          style={{ border: "5px solid orange", borderRadius: "20px" }}
        >
          <div className="mb-3">
            <label for="exampleDropdownFormEmail2" className="form-label">
              Email Address :{" "}
            </label>
            <input
              type="email"
              className="form-control w-75"
              id="exampleDropdownFormEmail2"
              placeholder="xyz@darshan.ac.in"
            />
          </div>
          <div className="mb-3">
            <label for="exampleDropdownFormPassword2" className="form-label">
              Password :{" "}
            </label>
            <input
              type="password"
              className="form-control w-75"
              id="exampleDropdownFormPassword2"
              placeholder="Password"
            />
          </div>
          <div className="mb-3">
            <label for="exampleDropdownFormMessage" className="form-label">
              Message :{" "}
            </label>
            <textarea
              className="form-control w-75"
              id="exampleDropdownFormEmail2"
              placeholder="Enter the Message"
              rows="4"
            />
          </div>
          <div className="mb-3 py-3">
            <div className="form-check">
              <input
                type="checkbox"
                className="form-check-input"
                id="dropdownCheck2"
              />
              <label className="form-check-label" for="dropdownCheck2">
                Remember me
              </label>
            </div>
          </div>
          <button type="button" className="btn btn-warning">
            {" "}
            SEND MESSAGE{" "}
          </button>
        </form>
      </div>
    );
  }
  
  export default Contact;
  