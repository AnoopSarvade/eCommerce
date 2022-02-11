import Products from "./Product";
import Profile from "./Profile";
import {useHistory} from "react-router-dom";
import Button from "../UI/Button";

function backtoProfileHandler(){
   history.push("/profile");
};

const Home = () => {
    return(
        <div>
            <h2>Customer Home Page</h2>
            
            <Button onclick = {backtoProfileHandler} > Back to Profile Page</Button>
           
            <Products />
        </div>
    );
}

export default Home;