import React, { useContext } from 'react';
import { ListGroup, Badge } from "react-bootstrap";
import { LoginContext } from '../contexts/LoginContext';
import { Link } from 'react-router-dom';


function ProductDetailsComponent(props) {

    // const { cart, setCart, setProductdetails } = useContext(LoginContext);
    const { productdetails, setProductdetails } = useContext(LoginContext);

    // var needsDefaultImage = props.product.imageUrl!==null?false:true;
    // var needsDefaultDescription = props.product.description!==""?false:true;
    return (
        <div className="card" style={{ width: "18 rem" }}>
            <img src={props.product.imgNuoroda} className="card-img-top" alt="item"></img>
            <div className="card-body ">
                <h5 className="card-title">{props.product.pavadinimas}</h5>
                <p className="card-text">{props.product.aprasymas}</p>
                <p className="card-text">Turimos vakcinos:</p>
                <ListGroup as="ol" >
                    {
                        productdetails.vakcinos.map(element => {
                            // this.state.products.map((item, index) => {
                            return (
                                <ListGroup.Item key={element.pavadinimas}
                                    as="li"
                                    className="d-flex justify-content-between align-items-start"
                                >
                                    <div className="ms-2 me-auto">
                                        <div className="fw-bold">{element.pavadinimas}</div>
                                    </div>
                                    <Badge variant="primary" pill>
                                        {element.kiekis}
                                    </Badge>
                                </ListGroup.Item>

                            )
                        })
                    }
                    <ListGroup.Item key="bendras"
                                    as="li"
                                    className="d-flex justify-content-between align-items-start"
                                >
                                    <div className="ms-2 me-auto">
                                        <div className="fw-bold">Bendras vakcinų kiekis:</div>
                                    </div>
                                    <Badge variant="primary" pill>
                                    {productdetails.vakcinos.map(e => e.kiekis).reduce((a, b) => a + b, 0)}
                                    </Badge>
                                </ListGroup.Item>

                </ListGroup>

                <Link to={`/registracija`} >
                    <button className="btn btn-primary" onClick={() => setProductdetails(props.product)} >Registruoti pacientą</button>
                </Link>
                <Link to={`/${props.id}`} >
                    <button className="btn btn-primary" onClick={() => setProductdetails(props.product)}>Daugiau</button>
                </Link>
            </div>
        </div>
    )
}
export default ProductDetailsComponent;

