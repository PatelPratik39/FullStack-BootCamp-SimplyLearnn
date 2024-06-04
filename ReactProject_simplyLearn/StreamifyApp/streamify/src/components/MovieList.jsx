import React, { useState, useEffect } from "react";
import { getAllMovies } from "../api/api";
import Movie from "./Movie";
import { Container, Row, Col } from "react-bootstrap";

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
      <Container>
        <Row>
          {movies.map((movie) => (
            <Col key={movie._id} sm={12} md={6} lg={4} xl={3}>
              <Movie movie={movie} />
            </Col>
          ))}
        </Row>
      </Container>
    </>
  );
};

export default MovieList;
