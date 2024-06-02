import AddProduct from "./AddProduct";
import "./App.css";
import DeleteProducts from "./DeleteProducts";
import Products from "./Products";
import UpdateProduct from "./UpdateProduct";

function App() {
  return (
    <>
      <AddProduct />
      <DeleteProducts />
      <UpdateProduct />
      <Products />
    </>
  );
}

export default App;
