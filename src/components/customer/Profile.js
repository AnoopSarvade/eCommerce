import { useSelector } from "react-redux";

const Profile = (props) => {
  const userId = useSelector((state) => state.user.userId);
  const username = useSelector((state) => state.user.username);
  const password = useSelector((state) => state.user.password);
  const role = useSelector((state) => state.user.role);
  const phone = useSelector((state) => state.user.phone);
  const address = useSelector((state) => state.user.address);
  
  return (
    <div>
      <div>User Profile</div>
      <table>
        <tr>
          <tb>
            <label>User ID </label>
          </tb>
          <tb>{userId}</tb>
        </tr>
        <tr>
          <tb>
            <label>Username</label>
          </tb>
          <tb>{username}</tb>
        </tr>
        <tr>
          <tb>
            <label>Password</label>
          </tb>
          <tb>{password}</tb>
        </tr>
        <tr>
          <tb>
            <label>Role</label>
          </tb>
          <tb>{role}</tb>
        </tr>
        <tr>
          <tb>
            <label>Phone</label>
          </tb>
          <tb>{phone}</tb>
        </tr>
        <tr>
          <tb>
            <label>Address</label>
          </tb>
          <tb>{address}</tb>
        </tr>
      </table>
    </div>
  );
};

export default Profile;
