import React, { useContext } from "react";
import MyContext from "./Context";

const Child8 = () => {
  let data = useContext(MyContext);
  return (
    <>
      <div>
        <h4>Child8 Component</h4>
        <p>Name is child8 is {data.name} { data.city}</p>
      </div>
    </>
  );
};

export default Child8;
