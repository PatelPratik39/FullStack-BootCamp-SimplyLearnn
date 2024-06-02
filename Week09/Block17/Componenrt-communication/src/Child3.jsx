import React, { useState } from "react";

const Child3 = ({ pName }) => {
  const [childName, setChildName] = useState("Mowglee");
  return (
    <>
      <div style={{ background: "white" }}>
        <h2>Child 3 Component</h2>
        <p>
          My Parent name is : <b>{pName}</b>
        </p>
        <p>
          My Name is : <b>{childName}</b>
        </p>
      </div>
    </>
  );
};

export default Child3;
