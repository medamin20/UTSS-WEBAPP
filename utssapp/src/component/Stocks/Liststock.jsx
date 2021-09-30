

import React, { Component } from 'react'
import StockService from '../../services/StockService';
import "./liststock.css"

export default class Liststock extends Component {
    constructor(props){
        super(props)
        this.state={
            Stocks:[],
            stockProducts: [],
            
        }


        
        this.deleteStock = this.deleteStock.bind(this);

    }
    

    componentDidMount(){
        StockService.getStocks().then((response)=>{this.setState({Stocks:response.data })});
    }






    
    deleteStock(idOfStock) {
        StockService.deleteStockById(idOfStock).then((res) => {
          this.setState({
            stocks: this.state.Stocks.filter(
              (stock) => stock.idStock !== idOfStock
              
              
              
            ),
            
          });
          window.location.reload(false);

        });
      }


    render() {
        return (

            <div class="container-fluid mt-50">
           
            <div class="row">
                
            {
                    this.state.Stocks.map(
                            stock=>
                <div class="col-md-4">
                    <div class="product-card mb-30">
                        <div key={stock.idstock} />
                        <div class="product-badge bg-success border-default text-body"> {stock.nameStock} </div><a class="product-thumb" href="#" data-abc="true"><img src="https://th.bing.com/th/id/R.c35b1afc3ad2a393621a6634bc76b5db?rik=JUxcsIWn5TOXpQ&riu=http%3a%2f%2fwww.trophydash.com%2ficons%2fpackage.png&ehk=lXdFbawcybc2n%2b81bLKltvT58USYc%2bKOZStpVyJygq8%3d&risl=&pid=ImgRaw&r=0" alt="Product"/></a>
                        <div>
                            <div class="product-category"><a href="#" data-abc="true">{stock.nameStock}</a></div>
                        </div>
                        <button className="btn btn-danger" onClick={() => this.deleteStock(stock.idStock) && this.refresh()
                    }>
                    Delete
                  </button>


                  
                    </div>
                    
                    <table className="table bg-white rounded border">
                  <thead>
                    <th>Title </th>
                    <th>Quantity </th>
                    <th>Barcode</th>
                  </thead>

                  {stock.stockProducts?.map((item) => {
                    return (
                      <tr key={item.idProduct}>
                        <td>{item.titleProduct}</td>
                        <td>{item.quantityProduct}</td>
                        <td>{item.barcode}</td>
                      </tr>
                    );
                  })}
                </table>
                
               
                
                
                </div>




                    )

                    
    }
            </div>

            
        </div>

        )
    }
}




