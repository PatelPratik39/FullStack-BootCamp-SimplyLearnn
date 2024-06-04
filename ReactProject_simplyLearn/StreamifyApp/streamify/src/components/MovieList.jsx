import React, { useState, useEffect } from "react";
import { getAllMovies } from "../api/api";
import Movie from "./Movie";

const MovieList = () => {
  const [movies, setMovies] = useState([]);

  useEffect(() => {
    const fetchMovies = async () => {
      try {
        const allMovies = await getAllMovies();
        console.log(allMovies.data);
        setMovies(allMovies.data);
      } catch (error) {
        console.error("Error fetching movies:", error);
      }
    };

    fetchMovies();
  }, []);

  return (
    <>
      <div>
        {movies.length > 0 ? (
          movies.map((movie) => <Movie movie={movie}/>)
        ) : (
          <li> No Movies are Found</li>
        )}
      </div>
    </>
  );
};

export default MovieList;
