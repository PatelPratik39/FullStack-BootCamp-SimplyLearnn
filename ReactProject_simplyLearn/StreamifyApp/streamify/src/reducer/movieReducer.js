import { createSlice } from "@reduxjs/toolkit";

// set Initial states first
const initialState = {
  movies: [],
  loading: false,
  error: null
};

// createSlice
const movieSlice = createSlice({
  name: "movies",
  initialState,
  reducers: {
    fetchMoviesRequest(state) {
      state.loading = true;
      state.error = null;
    },
    fetchMovieSuccess(state, action) {
      state.loading = false;
      state.movies = action.payload;
    },
    fetchMovieFailure(state, action) {
      state.loading = false;
      state.error = action.payload;
    }
  }
});

export const { fetchMoviesRequest, fetchMovieSuccess, fetchMovieFailure } =
  movieSlice.actions;

export default movieSlice.reducer;
