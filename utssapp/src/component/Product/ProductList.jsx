


import React, { Component } from 'react';
import ProductService from '../../services/ProductService';
import './productlist.css'

export default class ProductList extends Component {
  constructor(props) {
    super(props);
    this.state = {
      products: [],
    };
    this.addProduct = this.addProduct.bind(this);
    this.deleteProduct = this.deleteProduct.bind(this);

  }

  componentDidMount() {
    ProductService.getAllProducts().then((response) => {
      this.setState({ products: response.data });
      console.log('stocks', this.state.products);
    });
  }

  addProduct() {
    this.props.history.push('/add-products');
  }







  deleteProduct(idOfproduct) {
    ProductService.deleteProductkById(idOfproduct).then((res) => {
      this.setState({
        products: this.state.products.filter(
          (product) => product.idProduct !== idOfproduct
        ),
      });
    });
  }


  render() {
    return (
      
        <div class="container rounded mt-5 bg-white p-md-5">
        <div class="h2 font-weight-bold">Products List</div>
        <div class="table-responsive">
            <table class="table">
                <thead>
                    <tr>
                        <th scope="col">idProduct</th>
                        <th scope="col">titleProduct</th>
                        <th scope="col">descriptionProduct</th>
                        <th scope="col">priceProduct</th>
                        <th scope="col">barcode</th>
                        <th scope="col">ProductWeight</th>
                        <th scope="col">Actions</th>
                    </tr>
                </thead>
                <tbody>
                {this.state.products.map((product) => (
                    <tr class="bg-blue"  key={product.idProduct}>
                        <td>{product.idProduct}</td>
                        <td class="pt-2"> <img src="https://www.pngitem.com/pimgs/m/325-3256236_products-icon-vector-product-icon-png-transparent-png.png" class="rounded-circle" alt=""/>
                          
                            <div class="pl-lg-5 pl-md-3 pl-1 name">{product.titleProduct}</div>
                        </td>
                        <td class="pt-3 mt-1">{product.descriptionProduct}</td>
                        <td class="pt-3">{product.priceProduct}</td>
                        <td class="pt-3">{product.barcode}</td>
                        <td class="pt-3">{product.weightProduct}</td>



                        <td class="pt-3"><span class="fa fa-ellipsis-v btn"></span>
                        
                        <button
                    className="btn btn-danger"
                    onClick={() => this.deleteProduct(product.idProduct)}
                  >
                    Delete
                  </button>
                        </td>


                        
                    </tr>
                    
                   
                     ))}
                </tbody>
            </table>
        </div>
    </div>
      
    );
  }
}
