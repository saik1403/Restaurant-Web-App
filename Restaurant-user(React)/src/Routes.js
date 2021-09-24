import React, { Component } from "react";
import { Router, Switch, Route } from "react-router-dom";
import history from './history';
import Login from "./components/login/Login";
import Register from "./components/registeration/Register";
import Demo from "./components/democomponent/Demo";
export default class Routes extends Component {
    render() {
        return (
            <Router history={history}>
                <Switch>
                    <Route path="/login" component={Login} />
                    <Route path="/register" component={Register} />
                    <Route path="/demo" component={Demo}/>
                </Switch>
            </Router>
        )
    }
}