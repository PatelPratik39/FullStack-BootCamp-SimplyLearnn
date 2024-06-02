import React from "react";
import { useSelector } from "react-redux";

const ThirdComponent = () => {
  const fName = useSelector((state) => state.fName);
  const lName = useSelector((state) => state.lName);
  const address = useSelector((state) => state.address);
  return (
    <>
      <div>
        <h3>Third Component</h3>
        <p>
          {" "}
          {fName} {lName}, You are located in {address}
        </p>
      </div>
    </>
  );
};

export default ThirdComponent;
