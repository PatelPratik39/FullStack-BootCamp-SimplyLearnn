import React, { useState } from "react";
import { useSelector } from "react-redux";

const FirstComponent = () => {
//   const [name, setName] = useState("Pratik");
  const fName = useSelector((state) => state.fName);

  return (
    <>
      <div>
        <h3>First Component</h3>
        <p>
          {" "}
          Name in First Component as local Variable : <b>{name}</b>
        </p>
        <p>
          {" "}
          Name in First Component as local Variable : <b>{fName}</b>
        </p>
      </div>
    </>
  );
};

export default FirstComponent;
