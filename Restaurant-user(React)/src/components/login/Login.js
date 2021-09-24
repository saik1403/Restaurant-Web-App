import React from 'react'
import { Button, Checkbox, Form } from 'semantic-ui-react'
import { useState } from 'react';
import {
    Link
  } from "react-router-dom";
  
const Login = () => {
    const [userI, setUserI] = useState(0);
    const [userN, setUserN] = useState('');
    const [userP, setUserP] = useState('');
    let data = {userId: userI, userName: userN,userPassword: userP};
    console.log(data);
    const postData = () => {
        //const response = 
        fetch("http://localhost:8080/users/login", {
            method: 'POST', // *GET, POST, PUT, DELETE, etc.
            headers: {
                        'Content-Type': 'application/json'
                            // 'Content-Type': 'application/x-www-form-urlencoded',
                        },
                        body: JSON.stringify(data) // body data type must match "Content-Type" header
                        }).then(res => {
                            return res.json();
                          }).then(data => {
                              if(userI===data.userId.toString()&&userN===data.userName && userP===data.userPassword){
                                console.log("ok same");
                                window.location.replace("http://localhost:3000/menu");
                              }
                              else{
                                  alert("Give correct credentials");
                              }
                                 
                          });
    }
    return (<div>
    <h2 className="main-header">Login</h2>
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
        <Button onClick={postData} type='submit'>Login</Button>
        <br/><br/><br/>
        <label className="reg">If don't have account Register Here</label>
    <ul>
        <li>
    <Link class="but" to="/register">Register</Link>
    </li>
    </ul>
    </Form>
   
    </div>);
}

export default Login;