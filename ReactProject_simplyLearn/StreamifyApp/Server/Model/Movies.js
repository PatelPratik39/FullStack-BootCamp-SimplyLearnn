/*
To Create a Schema
 - first i need to import Mongoose for schema
 - i need to createimport { type } from '../../../movieApp_SimplyLearn/node_modules/react-router-dom/dist/dom.d';
 a schemaimport { Timestamp } from '../node_modules/bson/src/timestamp';

 - provide fields , validations
*/

const mongoose = require("mongoose");

const movieSchema = new mongoose.Schema(
  {
    title: {
      type: String,
      required: true,
      trim: true
    },
    year: {
      type: Number,
      required: true
    },
    genre: {
      type: String,
      required: true,
      trim: true
    },
    rating: {
      type: Number,
      required: true,
      min: 0,
      max: 10
    },
    director: {
      type: String,
      required: true,
      trim: true
    },
    actors: {
      type: [String],
      required: true
    },
    plot: {
      type: String,
      required: true,
      trim: true
    },
    poster: {
      type: String,
      required: true,
      trim: true
    }
  },
  (timeStamp = true)
);

module.exports = mongoose.model("Movie", movieSchema);
