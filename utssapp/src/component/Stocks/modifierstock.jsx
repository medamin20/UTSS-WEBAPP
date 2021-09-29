// import React, { Component } from 'react'
// import ProductService from '../../services/StockService';
// import './modifierstock.css'

// export default class modifierstock extends Component {
//     constructor(props){
//         super(props)
//         this.state={
//             idProduct: this.props.match.params.idProduct,
//             titleProduct :'',
//             descriptionProduct:'',
//             quantityProduct:'',
//             weightProduct:''
//         }

        
//         this.changetitleproductHandler = this.changetitleproductHandler.bind(this);
//         this.changeDescriptionHandler = this.changeDescriptionHandler.bind(this);
//         this.changequantityHandler=this.changequantityHandler.bind(this);
//         this.changepoidHandler=this.changepoidHandler.bind(this);
//         this.upProduct = this.upProduct.bind(this);
//     }




    
// componentDidMount(){
//     ProductService.getprodById(this.state.idProduct).then((res)=>{
//         let product= res.data;
//         this.setState({titleProduct:product.titleProduct,
//             descriptionProduct:product.descriptionProduct,
//             quantityProduct:product.quantityProduct,
//             weightProduct:product.quantityProduct


        
        
        
        
//         });
//     });

// }



//     upProduct =(e)=>{
//         e.preventDefault();
//         let product ={titleProduct:this.state.titleProduct,descriptionProduct:this.state.descriptionProduct, quantityProduct:this.state.quantityProduct,weightProduct:this.state.weightProduct};
//         console.log('product=>'+ JSON.stringify(product));
//         console.log('idProduct=>'+ JSON.stringify(this.state.idProduct));

        
//         ProductService.modifProducts(product,this.state.idProduct).then(res =>{
//             this.props.history.push('/modifierprod ');
//         });
//     }


//     changetitleproductHandler=(event)=>{
//         this.setState({titleProduct:event.target.value});}

//         changeDescriptionHandler=(event)=>{
//             this.setState({descriptionProduct:event.target.value});}

//     changequantityHandler=(event)=>{
//         this.setState({quantityProduct:event.target.value})
//     }

//     changepoidHandler=(event)=>{
//         this.setState({weightProduct:event.target.value})
//     }

    

//     render(){  
//         return (
            

              
//             <div class="container-fluid px-4 px-md-4 py-5 mx-auto">
//     <div class="row d-flex justify-content-between align">
        
      
//         <div class="card border-0 rounded-0 mb-5">
//             <h1 class="mb-2">Ajouter produit</h1> <small>Type de stock</small>

           


//             <div class="row px-3 mt-4 mb-3">
//                 <div class="custom-control custom-radio custom-control-inline"> <input id="customRadioInline1" type="radio" name="customRadioInline1" checked class="custom-control-input"/> <label for="customRadioInline1" class="custom-control-label text-sm">Refigirator</label> </div>
//                 <div class="custom-control custom-radio custom-control-inline"> <input id="customRadioInline2" type="radio" name="customRadioInline1" class="custom-control-input"/> <label for="customRadioInline2" class="custom-control-label text-sm">Normal_Stock</label> </div>
//             </div> 
//             <form>
//             <div className="form-group">

//             <label class="font-weight-bold mb-0">nom</label>
//              <input type="text" name="name" class="mb-4" placeholder="name product" className="form-control" value={this.state.titleProduct} onChange={this.changetitleproductHandler}/> 
//              </div>


//              <div className="form-group">

//              <label class="font-weight-bold mb-0">Description</label> 
//              <input type="text" name="description" class="mb-4" placeholder="Description" className="form-control" value={this.state.descriptionProduct} onChange={this.changeDescriptionHandler}/>
            
//             </div>

//             <div className="form-group">

//               <label class="font-weight-bold mb-0">Quantite</label>
//               <input type="text" name="quantity" class="mb-4" placeholder="quantity" className="form-control" value={this.state.quantityProduct} onChange={this.changequantityHandler}/>

//                 </div>

//                 <div className="form-group">

//                <label class="font-weight-bold mb-0">poid</label>
//                 <input type="text" name="name" class="mb-4" placeholder="John Harry" className="form-control" value={this.state.weightProduct} onChange={this.changepoidHandler}/>
//             <div class="custom-control custom-checkbox custom-control-inline mt-4"> <input id="chk1" type="checkbox" name="chk" class="custom-control-input" checked/> <label for="chk1" class="custom-control-label text-sm">I agree with Terms of Service, Terms of Payments and Privacy Policy.</label> </div>
//             </div>
//             <div class="row px-3 mt-5"> <button type="submit" class="btn btn-yellow px-3 mr-3" onClick={this.upProduct}>Ajouter!</button> <img class="icon mr-2 mt-4" src="https://climateoptimist.org/wp-content/themes/climate.2017/img/furniture/sitelogo__icon.png"/>  </div>
//             </form>
//         </div>
//     </div>
// </div>
            

         
//         )
//         }
//     }
import React, { Component } from 'react'

export default class modifierstock extends Component {
    render() {
        return (
            <div>
                
            </div>
        )
    }
}
