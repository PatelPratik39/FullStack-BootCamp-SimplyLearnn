import { configureStore } from "@reduxjs/toolkit";

const store = configureStore({
  reducer: {
    movies: movieReducer,
    auth: authReducer
  }
});

export default store;
