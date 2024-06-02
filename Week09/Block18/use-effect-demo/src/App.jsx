import { useState } from 'react'

import './App.css'
import Sample from './Sample.jsx'

function App() {
  const [count, setCount] = useState(0)

  return (
    <>
      <div>
        <h1>
         <h2> React + Vite App</h2>
        </h1>
        <Sample />
      </div>
    </>
  );
}

export default App
