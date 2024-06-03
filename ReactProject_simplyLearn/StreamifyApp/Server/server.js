const express = require("express");
const app = express();
const dotenv = require("dotenv").config();
const cors = require("cors");

PORT = process.env.PORT || 6000;

app.use(cors());
app.use('/', (req, res) => {
    res.send('Hello Server')
})

app.listen(PORT, () => {
  console.log(`StreamiFy App is listening on PORT : ${PORT}`);
});
