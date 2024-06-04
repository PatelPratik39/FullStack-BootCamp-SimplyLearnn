import React from "react";

const Movie = ({ movie }) => {
  return (
    <div className="col-md-4">
      <div className="card mb-4 shadow-sm">
        <img src={movie.poster} alt={movie.title} className="card-img-top" />
        <div className="card-body">
          <h5 className="card-title">{movie.title}</h5>
          <p className="card-text">Genre: {movie.genre}</p>
          <p className="card-text">Rating: {movie.rating}</p>
          <p className="card-text">Year: {movie.year}</p>
        </div>
        <div className="card-footer">
          <small className="text-muted">Directed by {movie.director}</small>
        </div>
      </div>
    </div>
  );
};

export default Movie;
