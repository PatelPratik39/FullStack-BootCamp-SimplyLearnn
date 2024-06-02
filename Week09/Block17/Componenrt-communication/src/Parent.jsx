import React, { useState } from "react";

import Child1 from "./Child1";
import Child2 from "./Child2";
import Child3 from "./Child3";

const Parent = () => {
  const [parentName, setParentName] = useState("Pratik");
  const [recievedChild3, setRecievedChild3] = useState("");
  const [recieved1Child, setRecieved1Child] = useState("");
  const [recievedChild2, setRecievedChild2] = useState("");

  const child1Data = (data) => {
    console.log(data);
    setRecieved1Child(data);
  }
    const child2Data = (data) => {
      console.log(data);
      setRecievedChild2(data)
    };
    const child3Data = (data) => {
      console.log(data);
      setRecievedChild3(data);
    };
  return (
    <>
      <div style={{ background: "lightgray" }}>
        <h1> Parent Component</h1>
        <p>
          Parent Name is parent Component is <b>{parentName}</b>
        </p>
        <p>
          Child1 name in parent component is <b>{recieved1Child}</b>
        </p>
        <p>
          Child2 name in parent component is <b>{recievedChild2}</b>
        </p>
        <Child1 pName={parentName} handleCallback={child1Data} />
        <hr />
        <Child3 pName={parentName} handleName={child3Data} />
        <hr />
        <Child2 pName={parentName} handleName={child2Data} />
      </div>
    </>
  );
};

export default Parent;
