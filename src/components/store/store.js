import { createSlice } from "@reduxjs/toolkit";
import { configureStore } from "@reduxjs/toolkit";

const initialUserState = {
  userId: 0,
  role: null,
  username: null,
  password: null,
  phone: null,
  address: null,
};

const userSlice = createSlice({
  name: "user",
  initialState: initialUserState,
  reducers: {
    setuserdetails(state, action) {
      state.userId = action.payload.userId;
      state.role = action.payload.role;
      state.username = action.payload.username;
      state.password = action.payload.password;
      state.address = action.payload.address;
    },
  },
});

const store = configureStore({
  reducer: { user: userSlice.reducer },
});

export const userActions = userSlice.actions;
export default store;
