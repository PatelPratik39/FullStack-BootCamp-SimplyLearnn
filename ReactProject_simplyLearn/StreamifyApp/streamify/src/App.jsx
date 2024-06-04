import "./App.css";
import MovieList from "./components/MovieList";
import { BrowserRouter, Routes, Route } from "react-router-dom";
import Navbar from "./components/Navbar";

function App() {
  return (
    <>
      <Navbar />
      {/* <h1>Streamify App</h1> */}
      <BrowserRouter>
        <Routes>
          <Route path="/" element={<MovieList />} />
        </Routes>
      </BrowserRouter>
    </>
  );
}

export default App;
