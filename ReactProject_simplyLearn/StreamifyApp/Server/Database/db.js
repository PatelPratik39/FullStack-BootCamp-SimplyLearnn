const mongoose = require("mongoose");
const dotenv = require("dotenv").config();

const ConnectionDB = async () => {
  try {
    const connection = await mongoose.connect(process.env.MONGODB_URI);
    console.log(`MongoDB Connected Successfully!!`);
  } catch (error) {
    console.error(`Error: ${error.message}`);
    process.exit(1);
  }
};

module.exports = ConnectionDB;
