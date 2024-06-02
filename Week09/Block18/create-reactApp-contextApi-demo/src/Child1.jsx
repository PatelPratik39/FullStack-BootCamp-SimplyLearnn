import React, { useContext } from "react";
import MyContext from "./Context";
import Child4 from "./Child4";

const Child1 = () => {
  const data = useContext(MyContext);
  console.log(data);
  return (
    <>
      <div>
        <p>Name in Child1 component is : {data.name} - {data.city}</p>
        <Child4 />
      </div>
    </>
  );
};

export default Child1;
