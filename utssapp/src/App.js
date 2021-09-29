
//////////////////////////Home page/////////////////////////////////



import "./App.css"

import{
  BrowserRouter as Router,
  Switch,
  Route,
  Link
} from "react-router-dom"

import Topbar from "./component/topbar/Topbar";
import Home from "./pages/home/Home";
import Sidebar from "./component/sidebar/Sidebar";
import Gesproducts from "./pages/Gesproducts/Gesproducts";
import ajouterStock from "./component/Stocks/ajouterStock";
import addProduct from "./component/Product/addProduct";
import ProductList from "./component/Product/ProductList";




function App() {
  return (
    <Router>
     <Topbar/>
     <div className="container">
       <Sidebar/>

            <Switch>
                <Route exact path="/"><Home/>  </Route>

                <Route exact path="/gesprodd" component={Gesproducts} />
                 <Route exact path="/addstock" component={ajouterStock} />
                 <Route exact path="/addprod" component={addProduct} />
                 <Route exact path="/listprod" component={ProductList} />

                 


            </Switch>


      


     </div>
    </Router>
  );
}

export default App;
