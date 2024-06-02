import React from "react";
import { useDispatch, useSelector } from "react-redux";

const IncrementComponent = () => {
  let n = useSelector((state) => state.counter);

  let dispatch = useDispatch();

  let increment = (e) => {
    // dispatch({ type: "INCREMENT" }); //only passing Action , NOT payload
    dispatch({ type: "INCREMENT", payload: 11 }); //only passing Action and payload
  };

  let decrement = (e) => {
    dispatch({ type: "DECREMENT" }); //only passing Action , NOT payload
  };

  return (
    <>
      <div>
        <h3>Increament Component</h3>
        <p>
          Counter Value : <b>{n}</b>
        </p>
        <button onClick={increment}>Increament</button>
        <button onClick={decrement}>Decrement</button>
      </div>
    </>
  );
};

export default IncrementComponent;
