import React, { useContext } from 'react'
import MyContext from './Context'

const Child5 = () => {
  let data = useContext(MyContext)
  return (
    <>
      <div>
        Child 5 component
        <p>
          {" "}
          I am a Child 5 component = {data.name} {data.city}
        </p>
      </div>
    </>
  );
}

export default Child5