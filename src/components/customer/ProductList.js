import Button from "../UI/Button";

const ProductList = (props) => {
    return(
        <tr key={props.key}>
            <td>{props.id}</td>
            <td>{props.name}</td>
            <td>{props.price}</td>
            <td>{props.quantity}</td>
            <td>{props.description}</td>
            <td><Button>Order</Button></td>
        </tr>
    );
}

export default ProductList;