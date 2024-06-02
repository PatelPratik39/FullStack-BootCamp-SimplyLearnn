import { useEffect, useState } from "react";
import React from "react";

const Sample = () => {
  const [a, setA] = useState();
  const [b, setB] = useState();

  let fun1 = (e) => {
    console.log("Fun1 user define Method");
  };

  let changeValue = (e) => {
    setA(1);
    setB(2)
  };
  useEffect(() => {
    console.log("this useEffect Hook trigger");
  }, [a, b]);
  return (
    <>
      <div>
        <h2>Sample Component</h2>
        <p>
          {" "}
          Value of a is {a} and b is {b}
        </p>
        <button onClick={changeValue}>Click Me!</button>
      </div>
    </>
  );
};

export default Sample;
