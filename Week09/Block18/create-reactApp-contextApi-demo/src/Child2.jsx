import React, { useContext } from 'react'
import Child6 from './Child6'
import MyContext from './Context';

const Child2 = () => {
  const data = useContext(MyContext)
  return (
    <>
      <div>
        Child2 Component = {data.name} {data.city} <Child6 />
      </div>
    </>
  );
}

export default Child2