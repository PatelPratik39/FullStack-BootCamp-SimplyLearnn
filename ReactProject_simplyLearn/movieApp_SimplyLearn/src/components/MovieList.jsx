import React from "react";
// import AddFavorites from "./AddFavorites";

const MovieList = (props) => {
    const FavouriteComponent = props.favouriteComponent;
  return (
    <>
      {props.movies.map((movie, index) => (
        <div
          key={index}
          className="col-md-3 col-sm-6 d-flex justify-content-center image-container"
        >
          <div className="movie-card p-3 m-3">
            <h3>{props.Title}</h3>
            <img src={movie.Poster} alt="Movie" className="img-fluid" />
            <div
              className="overlay d-flex align-items-center justify-center"
              onClick={() => props.handleFavoritesClick(movie)}
            >
              <FavouriteComponent />
            </div>
          </div>
        </div>
      ))}
    </>
  );
};

export default MovieList;
