import React, { useState } from "react";
import { useHistory } from "react-router";
import Button from "../UI/Button";

import { userActions } from "../store/store";
import classes from "./Login.module.css";
import {useDispatch} from "react-redux";
import SignUp from "./SignUp";

const Login = () => {
  let dispatch = useDispatch();
  let history = useHistory();

  const [enteredUsername, setEnteredUsername] = useState("");
  const [enteredPassword, setEnteredPassword] = useState("");
  const [error, setError] = useState();
  
  const usernameChangeHandler = event => {
    setEnteredUsername(event.target.value);
  };

  const passwordChangeHandler = event => {
    setEnteredPassword(event.target.value);
  };

  async function onLoginHandler(event) {
    event.preventDefault();
    if (
      enteredUsername.trim().length === 0 ||
      enteredPassword.trim().length === 0
    ) {
      setError("Username/Password should not be empty");
      return;
    }
    const requestData = {
      mode: "cors",
      headers: {
        "Access-Control-Allow-Origin": "*"
      },
      method: "GET",
      headers: { "Content-Type": "application/json" }
    };

    try {
      const response = await fetch(
        "http://localhost:8080/eCommerce/login?username=" +
          `${enteredUsername}` +
          "&password=" +
          `${enteredPassword}`,
        requestData
      );
      const data = await response.json();

      dispatch(
        userActions.setuserdetails({
          userId: data["userId"],
          role: data["role"],
          username: data["userName"],
          password: data["password"],
          phone: data["phone"],
          address: data["address"]
        })
      );

      if (data["role"] === "customer") {
        history.push("/home");
      } else {
        history.push("/admin-home");
      }
    } catch (error) {setError("Invalid UserName or Password")}
  }

  return (
    <div className={classes.input}>
      <form onSubmit={onLoginHandler}>
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

        <Button type="submit">Sign UP</Button>
        <Button type="submit">Sign IN</Button>
      </form>
    {error && <p style={{color: "red"}}>{error}</p>}
    <SignUp></SignUp>
    </div>
  );
};

export default Login;
