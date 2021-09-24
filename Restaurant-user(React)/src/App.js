import './App.css';
import Login from './components/login/Login';
import { BrowserRouter as Router, Route, Switch } from 'react-router-dom';
import Register from './components/registeration/Register';
import Menu from './components/Menu/Menu';
import Order from './components/Order/Order';
import Bill from './components/Billgeneration/Bill';
function App() {
  return (
    <Router>
    <div className="main">
    <Switch>
              <Route exact path='/' component={Login}></Route>
              <Route exact path='/login' component={Login}></Route>
              <Route exact path='/register' component={Register}></Route>
              <Route exact path='/menu' component={Menu}></Route>
              <Route exact path='/order' component={Order}></Route>
              <Route exact path='/bill' component={Bill}></Route>
              <Route exact path='/logout' component={Bill}></Route>
            </Switch>
    </div>
    </Router>
  );
}
export default App;
