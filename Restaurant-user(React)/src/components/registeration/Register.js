
import React from 'react';
import { Button, Checkbox, Form } from 'semantic-ui-react';
import { useState } from 'react';
import {
    Link
  } from "react-router-dom";
const Register = () => {
    const [userI, setUserI] = useState(0);
    const [userN, setUserN] = useState('');
    const [userP, setUserP] = useState('');
    let data = {userId: userI, userName: userN,userPassword: userP};
    console.log(data);
    const postData = () => {
        //const response = 
        fetch("http://localhost:8080/users/register", {
            method: 'POST', // *GET, POST, PUT, DELETE, etc.
            headers: {
                        'Content-Type': 'application/json'
                            // 'Content-Type': 'application/x-www-form-urlencoded',
                        },
                        body: JSON.stringify(data) // body data type must match "Content-Type" header
                        });
        alert("User created Scuccessfully");
    }
    return (<div>
    <h2 className="main-header">Register</h2>
    <Form className="login-form">
        <Form.Field>
            <label>User Id</label>
            <input placeholder='User Id' onChange={(e) => setUserI(e.target.value)} />
        </Form.Field>
        <Form.Field>
            <label>User Name</label>
            <input placeholder='User Name' onChange={(e) => setUserN(e.target.value)}/>
        </Form.Field>
        <Form.Field>
            <label>Password</label>
            <input placeholder='Password' onChange={(e) => setUserP(e.target.value)} />
        </Form.Field>
        <Form.Field>
            <Checkbox label='Rember Password' />
        </Form.Field>
        <Button onClick={postData} type='submit'>Creat Account</Button>
    </Form>
    <br/><br/><br/>
        <label className="reg">Login here</label>
    <Link class="but" to="/login">Login</Link>
    </div>);
}
export default Register;