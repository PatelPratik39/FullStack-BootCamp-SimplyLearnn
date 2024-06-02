import axios from "axios";
import React, { useState } from "react";

const DeleteProducts = () => {
  const [id, setId] = useState("");
  const deleteDate = (e) => {
    e.preventDefault();
    axios
      .delete("http://localhost:3000/products/" + id)
      .then((result) => {
        console.log(result);
      })
      .catch((error) => console.error(error));
    setId("");
  };
  return (
    <>
      <div>
        <h3>Delete Product</h3>
        <form onSubmit={deleteDate}>
          <label> Id : </label>
          <input
            type="number"
            name="id"
            value={id}
            onChange={(e) => setId(e.target.value)}
          />
          <br />
          <button>Delete Row</button>
        </form>
      </div>
    </>
  );
};

export default DeleteProducts;
