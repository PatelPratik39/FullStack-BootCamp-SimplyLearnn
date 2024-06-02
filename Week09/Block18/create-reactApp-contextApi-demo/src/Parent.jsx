import React, { useState } from "react";
import Child1 from "./Child1";
import Child3 from "./Child3";
import Child2 from "./Child2";
import MyContext from "./Context";

const Parent = () => {
  const [name, setName] = useState("Pratik");
  const [city, setCity] = useState("Chicago");
  return (
    <>
      <div>
        <MyContext.Provider value={{ name, city }}>
          <h4>Parent Component</h4>
          <p> My Parent Name is: {name}</p>
          <Child1 />
          <Child2 />
          <Child3 />
        </MyContext.Provider>
      </div>
    </>
  );
};

export default Parent;
