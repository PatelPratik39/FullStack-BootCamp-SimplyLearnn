const express = require("express");
const router = express.Router();
const Movie = require("../Model/Movies");
const authMiddleware = require("../Middleware/authMiddleware");

// @Route - POST /api/movies
// @Desc - Add a Movie
// @access PROTECTED
router.post("/", authMiddleware, async (req, res) => {
  try {
    if (Array.isArray(req.body)) {
      const movies = await Movie.insertMany(req.body);
      res.status(201).json({
        status: "success",
        message: "Movies added successfully!",
        data: movies
      });
    } else {
      const newMovie = new Movie(req.body);
      const movie = await newMovie.save();
      res.status(201).json({
        status: "success",
        message: "Movie added successfully!",
        data: movie
      });
    }
  } catch (err) {
    console.error("Error saving movie:", err);
    res.status(500).json({
      status: "error",
      message: "Server Error"
    });
  }
});

// @Route - GET /api/movies
// @Desc - Get All Movies
// @access public
router.get("/", async (req, res) => {
  try {
    const movies = await Movie.find();
    res.status(200).json({
      status: "success",
      message: "Movies fetched successfully!",
      data: movies
    });
  } catch (error) {
    console.error("Error fetching movies:", error);
    res.status(500).json({
      status: "error",
      message: "Server Error"
    });
  }
});

// @Route - GET /api/movies/:id
// @DESC - Get single movie by Id
// @access - PROTECTED
router.get("/:id", authMiddleware, async (req, res) => {
  try {
    const singleMovie = await Movie.findById(req.params.id);
    if (!singleMovie) {
      return res
        .status(404)
        .json({ message: `${req.params.id} - Movie Not Found!! 🤷🏻‍♂️` });
    }
    return res.status(200).json({
      message: "Movie fetched successfully!",
      data: singleMovie
    });
  } catch (error) {
    console.error("Error fetching movies:", error);
    res.status(500).send("Server Error");
  }
});

// @Route - PUT /api/movies/:id
// @DESC - update single movie by Id
// @access - PROTECTED
router.put("/:id", authMiddleware, async (req, res) => {
  try {
    const movieId = req.params.id;
    const updatedMovie = await Movie.findByIdAndUpdate(movieId, req.body, {
      new: true,
      runValidators: true
    });
    if (!updatedMovie) {
      return res
        .status(404)
        .json({ message: `${movieId} - Movie Not Found!! 🤷🏻‍♂️` });
    }
    res.status(200).json({
      status: "success",
      message: "Movie updated successfully!",
      data: updatedMovie
    });
  } catch (error) {
    console.error("Error fetching movies:", error);
    res.status(500).send("Server Error");
  }
});

// @Route - DELETE api/movie/:id
// @DESC - DELETE Movie by ID
// @access - PROTECTED
router.delete("/:id", authMiddleware, async (req, res) => {
  try {
    const movieId = req.params.id;
    const deletedMovie = await Movie.findByIdAndDelete(movieId);
    if (!deletedMovie) {
      return res.status(404).json({
        status: "error",
        message: `${movieId} - Movie Not Found!! 🤷🏻‍♂️`
      });
    }
    res.status(200).json({
      status: "success",
      message: "Movie deleted successfully!",
      data: deletedMovie
    });
  } catch (error) {
    console.error("Error fetching movies:", error);
    res.status(500).send("Server Error");
  }
});

module.exports = router;
