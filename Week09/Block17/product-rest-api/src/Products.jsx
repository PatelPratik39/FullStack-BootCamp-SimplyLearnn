import React from "react";
import { useState } from "react";
import axios from "axios";

const Products = () => {
  const [products, setProducts] = useState([{}]);

  let loadProducts = (e) => {
    axios
      .get("http://localhost:3000/products")
      .then((result) => {
        // console.log(result.data);
        const sortedProducts = result.data.sort((a, b) => a.id - b.id);
        setProducts(sortedProducts);
      })
      .catch((error) => {
        console.error(error);
      });
  };

  return (
    <>
      <h1>All Products</h1>
      <button type="button" value="Load Product" onClick={loadProducts}>
        Load Data
      </button>
      <br />
      <table>
        <thead border="2">
          <tr>
            <td>Id</td>
            <td>Name</td>
            <td>Price</td>
          </tr>
        </thead>
        <tbody>
          {products.map((product, id) => (
            <tr key={id}>
              <td>{product.id}</td>
              <td>{product.name}</td>
              <td>{product.price}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </>
  );
};

export default Products;
