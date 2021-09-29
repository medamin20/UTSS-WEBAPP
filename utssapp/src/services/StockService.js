//import http from "../http-common";
import axios from "axios";

const STOCK_REST_API_URL='http://localhost:6038/utss/tn/AllStocks';
const Product_ADD_API_URL='http://localhost:6038/utss/tn/addStock';
const Product_UPA_API_URL='http://localhost:6038/utss/tn/updateStock';
const Product_GetbyId_API_URL='http://localhost:6038/utss/tn/OneStock';






class StockService{


getStocks(){

  
  return axios.get(STOCK_REST_API_URL);
}


addStock(Stocks){
  return axios.post(Product_ADD_API_URL,Stocks)
}


modifProducts(product,idProduct){
  return axios.put(Product_UPA_API_URL + '/' + idProduct,product);
}


getprodById(idStock){
  return axios.get(Product_GetbyId_API_URL + '/' + idStock);
}


}


export default new StockService();