import { useEffect, useState } from "react";
import "bootstrap/dist/css/bootstrap.min.css";
import "./App.css";
import MovieList from "./components/MovieList";
import MovieListHeading from "./components/MovieListHeading";
import SearchBox from "./components/SearchBox";
import AddFavorites from "./components/AddFavorites";
import RemoveFavourite from "./components/RemoveFavourite";

function App() {
  const [movies, setMovies] = useState([]);
  const [searchValue, setSearchValue] = useState("");
  const [favorites, setFavorites] = useState([]);

  const getMovieRequest = async (searchValue) => {
    const url = `http://www.omdbapi.com/?s=${searchValue}&apikey=777276aa`;
    const response = await fetch(url);
    const responseJson = await response.json();
    // console.log(responseJson);
    if (responseJson.Search) {
      setMovies(responseJson.Search);
    }
  };
  useEffect(() => {
    getMovieRequest(searchValue);
  }, [searchValue]);

  useEffect(()=>{
    const movieFavourites = JSON.parse(localStorage.getItem("favourite-movie"));
    setFavorites(movieFavourites);
  },[])

const saveLocalStorage = (item) => {
  localStorage.setItem('favourite-movie', JSON.stringify(item))
}

  const addFavouriteMovie = (movie) => {
    const newFavourite = [...favorites, movie];
    setFavorites(newFavourite);
    saveLocalStorage(newFavourite)
  };

  const removeFavouriteMovie = (movie) => {
    const newFavourite = favorites.filter(
      (favorites) => favorites.imdbID !== movie.imdbID
    );
    setFavorites(newFavourite);
    saveLocalStorage(newFavourite)
  };

  return (
    <>
      <h1 style={{ textAlign: "center" }}>Movies App</h1>
      <div className="container-fluid">
        <div className="row d-flex align-items-center mt-4 mb-4">
          <MovieListHeading heading="Movies" />
          <SearchBox
            searchValue={searchValue}
            setSearchValue={setSearchValue}
          />
        </div>
        <div className="row">
          <MovieList
            movies={movies}
            handleFavoritesClick={addFavouriteMovie}
            favouriteComponent={AddFavorites}
          />
        </div>
        <div className="row d-flex align-items-center mt-4 mb-4">
          <MovieListHeading heading="Favourites" />
        </div>
        <div className="row">
          <MovieList
            movies={favorites}
            handleFavoritesClick={removeFavouriteMovie}
            favouriteComponent={RemoveFavourite}
          />
        </div>
      </div>
    </>
  );
}

export default App;
