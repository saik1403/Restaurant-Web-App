import React from 'react';
import { Table } from 'semantic-ui-react'
import { useState,useEffect } from 'react';
import Nav from '../Navigationbar/Nav';
import {
    Link
  } from "react-router-dom";
export default function Menu() {
    const [APIData, setAPIData] = useState([]);
    let url = 'http://localhost:8080/users/getbill';
    useEffect(() => {
        fetch(url)
        .then(res => {
          return res.json();
        })
        .then(data => {
          console.log(data);
          setAPIData(data);
        
        })
        .catch(err => {
        })
    }, [url])
    return (
        <div>
            <Nav />
            <br/><br/><br/><br/><br/>

    <Link class="but" to="/menu">Menu</Link>
            <h2 className="main-header">Bill</h2>
            <Table singleLine>
                <Table.Header>
                    <Table.Row>
                        <Table.HeaderCell>Bill id</Table.HeaderCell>
                        <Table.HeaderCell>Bill Date</Table.HeaderCell>
                        <Table.HeaderCell>Total Bill Price</Table.HeaderCell>
                        <Table.HeaderCell>User Id</Table.HeaderCell>
                        <Table.HeaderCell>User Name</Table.HeaderCell>
                    </Table.Row>
                </Table.Header>
                <Table.Body>
                {APIData.map((data) => {
                        return (
                <Table.Row>
                 <Table.Cell>{data.billid}</Table.Cell>
                <Table.Cell>{data.billdate}</Table.Cell>
                <Table.Cell>{data.totalprice}</Table.Cell>
                <Table.Cell>{data.userid}</Table.Cell>
                <Table.Cell>{data.username}</Table.Cell>
                </Table.Row>
                )})}
                </Table.Body>
            </Table>
        </div>
    )
}