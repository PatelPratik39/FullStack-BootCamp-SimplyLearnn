import "./App.css";
import FirstComponent from "./FirstComponent";
import IncrementComponent from "./IncrementComponent";
import SecondComponent from "./SecondComponent";
import ThirdComponent from "./ThirdComponent";

function App() {
  return (
    <>
      <h1>Redux + React Demo</h1>
      <div>
        <FirstComponent />
        <hr />
        <SecondComponent />
        <hr />
        <ThirdComponent />
        <hr/>
        <IncrementComponent />
      </div>
    </>
  );
}

export default App;
