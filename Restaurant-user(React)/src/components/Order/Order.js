
import React from 'react';
import { Button, Form } from 'semantic-ui-react';
import { useState } from 'react';
import Menu from '../Menu/Menu';
import {
    Link
  } from "react-router-dom";
const Order = () => {
    const [userI, setUserI] = useState(0);
    const [userN, setUserN] = useState(0);
    let data1 = {itemid: userI, quantity: userN};
    let data = [data1]
    console.log(data);
    const postData = () => {
        //const response = 
        fetch("http://localhost:8080/users/order", {
            method: 'POST', // *GET, POST, PUT, DELETE, etc.
            headers: {
                        'Content-Type': 'application/json'
                            // 'Content-Type': 'application/x-www-form-urlencoded',
                        },
                        body: JSON.stringify(data) // body data type must match "Content-Type" header
                        });
            alert("Added to cart")
    }
    return (
    <div>
        <Menu />
    <h2 className="main-header">Order Items</h2>
    <Form className="login-form">
        <Form.Field>
            <label>Item Id</label>
            <input placeholder='Enter Item Id' onChange={(e) => setUserI(e.target.value)} />
        </Form.Field>
        <Form.Field>
            <label>Item Quantity</label>
            <input placeholder='Enter Qauntity' onChange={(e) => setUserN(e.target.value)}/>
        </Form.Field>
        <Button onClick={postData} type='submit'>Add to cart</Button>
        <br/><br/>
        <Link class="but" to="/bill">Generate Bill</Link>
    </Form> 
    </div>);
}

export default Order;