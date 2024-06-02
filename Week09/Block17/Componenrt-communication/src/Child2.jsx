import React, { useState } from "react";

const Child2 = (props) => {
  const [child2Name, setChild2Name] = useState("Baloo");
  return (
    <>
      <div style={{ background: "green" }}>
        <h2>Child 2 Component</h2>
        <p>
          My Parent name is : <b>{props.pName}</b>
        </p>
        <p>
          Child2 name in child2 component is <b>{child2Name}</b>
        </p>
        <p>{props.handleName(child2Name)}</p>
      </div>
    </>
  );
};

export default Child2;
