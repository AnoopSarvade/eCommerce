import obj from "./SignUp.module.css";
import { useState } from "react";
import Button from "../UI/Button";
import {useHistory} from "react-router-dom";

function SignUp() {
  let history = useHistory();
  const [enteredUsername, setEnteredUsername] = useState("");
  const [enteredPassword, setEnteredPassword] = useState("");
  const [enteredRole, setEnteredRole] = useState("");
  const [enteredPhone, setEnteredPhone] = useState("");
  const [enteredAddress, setEnteredAddress] = useState("");
  const [error, setError] = useState();

  const usernameChangeHandler = event => {
    setEnteredUsername(event.target.value);
  };

  const passwordChangeHandler = event => {
    setEnteredPassword(event.target.value);
  };

  const roleChangeHandler = event => {
    setEnteredRole(event.target.value);
  };

  const phoneChangeHandler = event => {
    setEnteredPhone(event.target.value);
  };
  const addressChangeHandler = event => {
    setEnteredAddress(event.target.value);
  };

  function resetHandler() {
    setEnteredUsername("");
    setEnteredPassword("");
    setEnteredRole("");
    setEnteredPhone("");
    setEnteredAddress("");
  }

  // const resetHandler = () =>{

  // };

  function backToLoginHandler() {
    history.push("/login");
  };

  async function onSubmitHandler(event) {
    event.preventDefault();
    if (
      enteredUsername.trim().length === 0 ||
      enteredPassword.trim().length === 0 ||
      enteredRole.trim().length === 0 ||
      enteredPhone.trim().length === 0 ||
      enteredAddress.trim().length === 0
    ) {
      setError("fields should not be empty");
      return;
    }
    const requestData = {
      mode: "cors",
      headers: {
        "Access-Control-Allow-Origin": "*"
      },
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify({
        userName: enteredUsername,
        password: enteredPassword,
        role: enteredRole,
        phone: enteredPhone,
        address: enteredAddress
      })
    };

    try {
      const response = await fetch(
        "http://localhost:8080/eCommerce/user",
        requestData
      );

      const data = await response.json();
      console.log(data);
      setEnteredUsername("");
      setEnteredPassword("");
      setEnteredRole("");
      setEnteredPhone("");
      setEnteredAddress("");
    } catch (error) {}
  }

  return (
    <div className={obj.input}>
      <form onSubmit={onSubmitHandler}>
        <label>Username</label>
        <input
          type="text"
          value={enteredUsername}
          onChange={usernameChangeHandler}
        />
        <br></br>

        <label>Password</label>
        <input
          type="password"
          value={enteredPassword}
          onChange={passwordChangeHandler}
        />
        <br></br>

        <label>Role</label>
        <input type="text" value={enteredRole} onChange={roleChangeHandler} />
        <br></br>

        <label>Phone</label>
        <input type="text" value={enteredPhone} onChange={phoneChangeHandler} />
        <br></br>

        <label>Address</label>
        <input
          type="text"
          value={enteredAddress}
          onChange={addressChangeHandler}
        />
        <br></br>

        <Button type="submit">Sign UP</Button>
        <Button onClick={resetHandler}>Reset</Button>
        <Button onClick={backToLoginHandler}>Back To Login</Button>
      </form>
      {error && <p style={{ color: "red" }}>{error}</p>}
    </div>
  );
}

export default SignUp;


