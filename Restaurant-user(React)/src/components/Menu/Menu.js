import React from 'react';
import { Table } from 'semantic-ui-react'
import { useState,useEffect } from 'react';
import Nav from '../Navigationbar/Nav';
 
export default function Menu() {
    const [APIData, setAPIData] = useState([]);
    let url = 'http://localhost:8080/menu';
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
            <Nav/>
            <h2 className="main-header">Menu</h2>
            <Table singleLine>
                <Table.Header>
                    <Table.Row>
                        <Table.HeaderCell>Item id</Table.HeaderCell>
                        <Table.HeaderCell>Item Name</Table.HeaderCell>
                        <Table.HeaderCell>Item Price</Table.HeaderCell>
                    </Table.Row>
                </Table.Header>
                <Table.Body>
                {APIData.map((data) => {
                        return (
                <Table.Row>
                 <Table.Cell>{data.itemId}</Table.Cell>
                <Table.Cell>{data.itemName}</Table.Cell>
                <Table.Cell>{data.itemPrice}</Table.Cell>
                </Table.Row>
                )})}
                </Table.Body>
            </Table>
        </div>
    )
}