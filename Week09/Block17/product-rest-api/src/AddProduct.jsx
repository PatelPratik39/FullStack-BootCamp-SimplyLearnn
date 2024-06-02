import React, { useState } from "react";
import Products from "./Products";
import axios from "axios";

const AddProduct = () => {
  const [id, setId] = useState("");
  const [name, setName] = useState("");
  const [message, setMessage] = useState("");
  const [price, setPrice] = useState("");

  const storeProduct = (e) => {
    e.preventDefault();
    let product = { id: id, name: name, price: price };
    // console.log(products);
    if (id.length === 0 || name.length === 0 || price.length === 0) {
      setMessage("Please add fields");
    } else {
      axios
        .post("http://localhost:3000/products", product)
        .then((result) => console.log(result.data))
        .catch((error) => {
          console.error(error);
          setMessage("")
        });
    }
    reset();
  };
  const reset = (e) => {
    setId("");
    setName("");
    setPrice("");
    setMessage("");
  };

  return (
    <div>
      <span style={{ color: "red" }}>{message}</span>
      <h1>Add Product</h1>
      <form onSubmit={storeProduct}>
        <label>Product Id :</label>
        <input
          type="number"
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
        <button type="submit" value="Add Product">
          Add Products
        </button>
        
        <button type="reset" value="reset" onClick={reset} >Reset</button>
      </form>
    </div>
  );
};

export default AddProduct;
