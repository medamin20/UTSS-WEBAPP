

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


import React, { Component } from 'react'
import StockService from '../../services/StockService';
import './ajouterstock.css'

export default class ajouterStock extends Component {
    constructor(props){
        super(props)
        this.state={
            nameStock :'',
            nameStockError:''
            
        }

        
        this.changenameStocktHandler = this.changenameStockHandler.bind(this);

        
    }


    validate = ()=>{
        let nameStockError="";
        if (!this.state.nameStock || this.state.nameStock > 3){
            nameStockError="name can not be empty ";
        }
        if (nameStockError) {
            this.setState({ nameStockError});
            return false;
        }
        return true;
        
    }

    saveStock =(e)=>{
        e.preventDefault();
        let Stocks ={nameStock:this.state.nameStock};
        const isValid = this.validate();
        if (isValid){
            console.log(this.state);
            StockService.addStock(Stocks).then(res =>{
                this.props.history.push('/addStock');
            });

        
    }
        console.log('Stocks=>'+ JSON.stringify(Stocks));
        
        this.setState({
            nameStock :''
        })
    }


    changenameStockHandler=(event)=>{
        this.setState({nameStock:event.target.value});}

        







    

    render(){  
        return (
            

              
            <div class="container-fluid px-4 px-md-4 py-5 mx-auto">
    <div class="row d-flex justify-content-between align">
        
      
        <div class="card border-0 rounded-0 mb-5">
            <h1 class="mb-2">Ajouter stock</h1> <small>Type de stock</small>

           


            <div class="row px-3 mt-4 mb-3">
                <div class="custom-control custom-radio custom-control-inline"> <input id="customRadioInline1" type="radio" name="customRadioInline1" checked class="custom-control-input"/> <label for="customRadioInline1" class="custom-control-label text-sm">Refigirator</label> </div>
                <div class="custom-control custom-radio custom-control-inline"> <input id="customRadioInline2" type="radio" name="customRadioInline1" class="custom-control-input"/> <label for="customRadioInline2" class="custom-control-label text-sm">Normal_Stock</label> </div>
            </div> 
            <form>
            <div className="form-group">

            <label class="font-weight-bold mb-0">nom</label>
             <input type="text" name="name" class="mb-4" placeholder="name stock" className="form-control" value={this.state.nameStock} onChange={this.changenameStockHandler}/> 
             </div>

             <div style={{fontSize:10, color:"red"}}>
                 {this.state.nameStockError}
             </div>

           

                <div className="form-group">

            <div class="custom-control custom-checkbox custom-control-inline mt-4"> <input id="chk1" type="checkbox" name="chk" class="custom-control-input" checked/> <label for="chk1" class="custom-control-label text-sm">I agree with Terms of Service, Terms of Payments and Privacy Policy.</label> </div>
            </div>
            <div class="row px-3 mt-5"> <button type="submit" class="btn btn-yellow px-3 mr-3" onClick={this.saveStock}>Ajouter!</button> <img class="icon mr-2 mt-4" src="https://climateoptimist.org/wp-content/themes/climate.2017/img/furniture/sitelogo__icon.png"/>  </div>
            </form>
        </div>
    </div>
</div>
            

         
        )
        }
    }






