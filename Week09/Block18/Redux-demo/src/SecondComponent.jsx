import React from "react";
import { useSelector } from "react-redux";

const SecondComponent = () => {
  const lName = useSelector((state) => state.lName);
  const fName = useSelector((state) => state.fName);
  return (
    <>
      <div>
        <h3>Second Component</h3>
        <p>
          {" "}
          Name in First Component as local Variable :{" "}
          <b>
            {fName} {lName}
          </b>
        </p>
      </div>
    </>
  );
};

export default SecondComponent;
