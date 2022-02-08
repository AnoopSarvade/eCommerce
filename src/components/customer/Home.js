import Products from "./Product";
import Profile from "./Profile";

const Home = () => {
    return(
        <div>
            <h2>Customer Home Page</h2>
            <Profile />
            <Products />
        </div>
    );
}

export default Home;