import React from "react";
import { Card } from "react-bootstrap";
import '../App.css';

const Movie = ({ movie }) => {
  return (
    <Card className="mb-3" style={{ width: "18rem" }}>
      <Card.Img variant="top" src={movie.poster} alt={movie.title} />
      <Card.Body>
        <Card.Title>{movie.title}</Card.Title>
        <Card.Text>{movie.description}</Card.Text>
      </Card.Body>
    </Card>
  );
};

export default Movie;
