import axios from "axios";
import React, { useState } from "react";

const UpdateProduct = () => {
  const [id, setId] = useState("");
  const [name, setName] = useState("");
  const [message, setMessage] = useState("");
  const [price, setPrice] = useState("");

  const updateProduct = (e) => {
    e.preventDefault();
    let product = { id: id, name: name, price: price };
    if (id.length === 0 || name.length === 0 || price.length === 0) {
      setMessage("Please fill out all fields");
    } else {
      axios
        .put("http://localhost:3000/products/" + id, product)
        .then((result) => {
          console.log(result.data);
          setMessage("Product updated successfully");
          reset();
        })
        .catch((error) => {
          console.error(error);
          setMessage("Error updating product");
        });
    }
  };

  const reset = () => {
    setId("");
    setName("");
    setPrice("");
    setMessage("");
  };

  return (
    <div>
      <span style={{ color: "red" }}>{message}</span>
      <h1>Update Product</h1>
      <form onSubmit={updateProduct}>
        <label>Product ID :</label>
        <input
          type="text"
          name="id"
          value={id}
          onChange={(e) => setId(e.target.value)}
        />
        <br />
        <label>Product Name :</label>
        <input
          type="text"
          name="name"
          value={name}
          onChange={(e) => setName(e.target.value)}
        />
        <br />
        <label>Product Price :</label>
        <input
          type="number"
          name="price"
          value={price}
          onChange={(e) => setPrice(e.target.value)}
        />
        <br />
        <button type="submit">Update Product</button>
        <button type="button" onClick={reset}>
          Reset
        </button>
      </form>
    </div>
  );
};

export default UpdateProduct;
