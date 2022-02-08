import ProductList from "./ProductList";
import {useState,useEffect} from "react";

const Products = () => {
  const [products, setProducts] = useState([]);

  const requestData = {
    mode: "cors",
    headers: {
      "Access-Control-Allow-Origin": "*",
      "Content-Type": "application/json",
    },
    method: "GET",
  };

  let productsFetched = [];

  async function fetchProducts() {
    const response = await fetch("http://localhost:8080/eCommerce/products", requestData);
    const data = await response.json();

    productsFetched = data.map((productData) => {
      return {
        id: productData.id,
        name: productData.name,
        price: productData.price,
        quantity: productData.quantity,
        description: productData.description,
        
      };
    });

    setProducts(productsFetched);
  }

  useEffect(() => {
    fetchProducts();
    return;
  }, []);

  return (
    <div>
      <div>Products</div>
      <table>
        <tr>
          <th>ID</th>
          <th>Name</th>
          <th>Price</th>
          <th>Quantity</th>
          <th>Description</th>
          <th>Action</th>
        </tr>
        {products.map((product) => (
          <ProductList
            key={product.id}
            id={product.id}
            name={product.name}
            price={product.price}
            quantity={product.quantity}
            description={product.description}
          />
        ))}
      </table>
    </div>
  );
};

export default Products;
