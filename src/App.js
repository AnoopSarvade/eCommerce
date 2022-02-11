import { Route } from "react-router-dom";
import { Switch, Redirect } from "react-router";
import AdminHome from "./components/admin/AdminHome";
import Home from "./components/customer/Home";
import Profile from "./components/customer/Profile";
import Login from "./components/login/Login";
import SignUp from "./components/login/SignUp";

function App() {
  return (
    <div>
      <Switch>
        <Route exact path="/login">
          <Login />
        </Route>
        <Route exact path="/home">
          <Home />
        </Route>
        <Route exact path="/admin-home">
          <AdminHome />
        </Route>
        <Route exact path="/profile">
          <Profile />
        </Route>
        <Route exact path="/signUp">
          <SignUp />
        </Route>
        <Route path="/">
          <Redirect to="/login" />
        </Route>
      </Switch>
    </div>
  );
}

export default App;
