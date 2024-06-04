const mongoose = require("mongoose");

const userSchema = new mongoose.Schema(
  {
    username: {
      type: String,
      required: true,
      trim: true,
      unique: true
    },
    email: {
      type: String,
      required: true,
      trim: true,
      unique: true,
      match: [/^\S+@\S+\.\S+$/, "Please use a valid email address."]
    },
    password: {
      type: String,
      required: true,
      minlength: 6
    },
    createdAt: {
      type: Date,
      default: Date.now
    }
  },
  (timeStamp = true)
);
module.exports = mongoose.model("User", userSchema);
