import axios from "axios";

const URL = "http://localhost:6060/api/movies";

export const getAllMovies = async () => {
  try {
    const response = await axios.get(URL);
    return response.data;
  } catch (error) {
    console.error("Error fetching movies:", error);
    throw error;
  }
};
