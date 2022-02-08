import obj from "./SignUp.module.css";
import { useState } from "react";
import Button from "../UI/Button";


function SignUp() {
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

  return (
    <div className ={obj.input}>
      <form >
        <label>Username</label>
        <input
          type="text"
          value={enteredUsername}
          onChange={usernameChangeHandler}
        />
        <br></br>

        <label>Password</label>
        <input
          type="text"
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
        <Button type="submit">Reset</Button>
        <Button type="submit">Back</Button>
      </form>
    </div>
  );
}

export default SignUp;
