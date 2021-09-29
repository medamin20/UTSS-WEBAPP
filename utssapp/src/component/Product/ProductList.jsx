// import React, { Component } from 'react';
// import ProductService from '../../services/ProductService';
// import './productlist.css'

// export default class ProductList extends Component {
//   constructor(props) {
//     super(props);
//     this.state = {
//       products: [],
//     };
//     this.addProduct = this.addProduct.bind(this);
//   }

//   componentDidMount() {
//     ProductService.getAllProducts().then((response) => {
//       this.setState({ products: response.data });
//       console.log('stocks', this.state.products);
//     });
//   }

//   addProduct() {
//     this.props.history.push('/add-products');
//   }

//   render() {
//     return (
//       <div className="prodli">
//         <div>
//           <h1 className="text-center"> LIST OF PRODUCTS</h1>

//           <div className="row">
//             <button className="btn btn-primary" onClick={this.addProduct}>
//               Add A New Product
//             </button>
//           </div>
//           <table className="table table-striped">
//             <thead>
//               <tr>
//                 <th>idProduct</th>
//                 <th>titleProduct</th>
//                 <th>descriptionProduct</th>
//                 <th>priceProduct</th>
//                 <th>barcodeProduct</th>
//                 <th>ProductWeight</th>
//                 <th>Actions</th>
//               </tr>
//             </thead>
//             <tbody>
//               {this.state.products.map((product) => (
//                 <tr key={product.idProduct}>
//                   <td>{product.idProduct}</td>
//                   <td>{product.titleProduct}</td>
//                   <td>{product.descriptionProduct}</td>
//                   <td>{product.priceProduct}</td>
//                   <td>{product.barcode}</td>
//                   <td>{product.weightProduct}</td>

//                   <td>
//                     {/* <button className="btn btn-danger" onClick={()=>this.deleteStock(stock.idStock)} >Delete</button>
//                                     <button className="btn btn-info"   onClick={()=>this.updateStock(stock.idStock)} >Update</button>
//                                     <button className="btn btn-success"onClick={()=>this.viewStock(stock.idStock)} >Show Details</button> */}
//                   </td>
//                 </tr>
//               ))}
//             </tbody>
//           </table>
//         </div>
//       </div>
//     );
//   }
// }


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
                    <tr class="bg-blue">
                        <td>{product.idProduct}</td>
                        <td class="pt-2"> <img src="https://www.pngitem.com/pimgs/m/325-3256236_products-icon-vector-product-icon-png-transparent-png.png" class="rounded-circle" alt=""/>
                          
                            <div class="pl-lg-5 pl-md-3 pl-1 name">{product.titleProduct}</div>
                        </td>
                        <td class="pt-3 mt-1">{product.descriptionProduct}</td>
                        <td class="pt-3">{product.priceProduct}</td>
                        <td class="pt-3">{product.barcode}</td>
                        <td class="pt-3">{product.weightProduct}</td>



                        <td class="pt-3"><span class="fa fa-ellipsis-v btn"></span></td>
                    </tr>
                   
                     ))}
                </tbody>
            </table>
        </div>
    </div>
      
    );
  }
}