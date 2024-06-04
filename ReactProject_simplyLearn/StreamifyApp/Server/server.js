const express = require("express");
const dotenv = require("dotenv");
const cors = require("cors");
const DB_Connection = require("./Database/db");
const movieRouter = require("./Controller/MoviesController");
const authRouter = require("./Controller/authController");

// Load environment variables from .env file
dotenv.config();

const app = express();
const PORT = process.env.PORT || 6000;

// Middleware
app.use(cors());
app.use(express.json());

// Logger middleware to log requests
app.use((req, res, next) => {
  console.log(`${req.method} ${req.url}`);
  next();
});

// Connect to the database
DB_Connection();

// Define routes
app.use("/api/movies", movieRouter);
app.use("/api/auth", authRouter);

app.listen(PORT, () => {
  console.log(`StreamiFy App is listening on PORT: ${PORT}`);
});
