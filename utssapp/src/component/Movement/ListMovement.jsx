import { red } from '@material-ui/core/colors';
import React, { Component } from 'react';
import MovementServices from '../../services/MovementServices';

class ListMovement extends Component {
  constructor(props) {
    super(props);
    this.state = {
      movements: [],
      movProducts: [],
    };
    this.addMovement = this.addMovement?.bind(this);
  }

  componentDidMount() {
    MovementServices.getAllMovement().then((response) => {
      this.setState({ movements: response.data });
      console.log('Movements', this.state.movements);
    });
  }
  addMovement() {
    this.props.history.push('/add-movement');
  }

  //    addStock(){
  //       this.props.history.push('/add-stock');
  //    }

  //    updateStock(idStock){
  //    this.props.history.push(`/update-stock/${idStock}`);
  //    }

  //    deleteStock(idOfStock){
  //    StockServices.deleteStockById(idOfStock).then(res =>{
  //        this.setState({stocks :this.state.stocks.filter(stock => stock.idStock !==idOfStock)})
  //    });
  //    }

  //    viewStock(idOfTheStock){
  //    this.props.history.push(`/view-stock/${idOfTheStock}`)
  //    }

  render() {
    return (
      <div>
        <h1 className="text-center">Liste des Mouvements</h1>

        <table className="table table-striped">
          <thead>
            <tr>
              <th>IdMovement</th>
              <th>Order Date</th>
              <th>Movement Type</th>
              <th>Movement Products</th>
              <th>Actions</th>
            </tr>
          </thead>
          <tbody>
            {this.state.movements.map((movement) => (
              <tr key={movement.idMovement}>
                <td>{movement.idMovement}</td>
                <td>{movement.orderDate}</td>
                <td style={{ backgroundColor: '#ADD8E6' }}>
                  {movement.movType}
                </td>
                <table className="table table-success table-striped" cellpadding = "5" cellspacing = "7" cellpadding = "7" cellspacing = "5">
                  <thead>
                    <th>Id Product</th>
                    <th>Title Product</th>
                    <th>Quantity Product</th>
                    <th>Barcode Product</th>
                  </thead>
                  {movement.movProducts?.map((item) => {
                    return (
                      <tr key={item.idProduct}>
                        <td>{item.idProduct}</td>
                        <td>{item.titleProduct}</td>
                        <td>{item.quantityProduct}</td>
                        <td>{item.barcode}</td>
                      </tr>
                    );
                  })}
                </table>
                <td>
                  <button className="btn btn-danger"> Archive</button>
                </td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    );
  }
}

export default ListMovement;
