const express = require("express");
const router = express.Router();
const bcrypt = require("bcryptjs");
const jwt = require("jsonwebtoken");
const User = require("../Model/User");

// @Route - @POST /api/auth/register
// @Desc - Register a user
// @access public

router.post("/register", async (req, res) => {
  try {
    const { username, email, password } = req.body;

    let user = await User.findOne({ email });
    if (user) {
      return res.status(400).json({ message: "User already exists" });
    }
    user = new User({ username, email, password });

    const salt = await bcrypt.genSalt(10);
    user.password = await bcrypt.hash(password, salt);

    await user.save();

    res.status(201).json({
      message: "User registered successfully",
      user: {
        id: user.id,
        username: user.username,
        email: user.email
      }
    });
  } catch (error) {
    console.error("Error registering user:", error);
    res.status(500).send("Server Error");
  }
});

// @Route - @POST /api/auth/login
// @Desc - Register a user
// @access public
router.post("/login", async (req, res) => {
  try {
    const { email, password } = req.body;

    let user = await User.findOne({ email });
    if (!user) {
      return res.status(400).json({ message: `${email} - User Not Found!!` });
    }

    const match = await bcrypt.compare(password, user.password);
    if (!match) {
      return res.status(400).json({ message: " Wrong Password!!!" });
    }

    const payload = {
      user: {
        id: user.id
      }
    };
    jwt.sign(
      payload,
      process.env.JWT_SECRET,
      { expiresIn: "1h" },
      (error, token) => {
        if (error) throw error;
        res
          .status(200)
          .json({
            token,
            user: { id: user.id, username: user.username, email: user.email }
          });
      }
    );
  } catch (error) {
    console.error("Error Login user:", error);
    res.status(500).send("Server Error");
  }
});

module.exports = router;
