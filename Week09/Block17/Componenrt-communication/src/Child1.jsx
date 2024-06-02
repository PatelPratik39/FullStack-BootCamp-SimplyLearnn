import React, { useState } from "react";

const Child1 = (props) => {
    const [child1Name, setChild1Name] = useState("Bagheera");
  return (
    <>
      <div style={{ background: "orange" }}>
        <h2>Child 1 Component</h2>
        <p>
          My Parent name is : <b>{props.pName}</b>
        </p>
        <p>{props.handleCallback(child1Name)}</p>
      </div>
    </>
  );
};

export default Child1;
