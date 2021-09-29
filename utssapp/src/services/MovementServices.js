import axios from "axios";
const Movement_Rest_Api= 'http://localhost:6038/utss/tn/AllMovements';
const Add_Movement_Rest_Api= 'http://localhost:6038/utss/tn/addMovement';
// const Get_One_Stock_By_Id='http://localhost:6038/utss/tn/OneStock';
// const Update_Stock='http://localhost:6038/utss/tn/updateStock';
// const Delete_Stock= 'http://localhost:6038/utss/tn/deleteStock';

class MovementServices{

    getAllMovement(){
      return  axios.get(Movement_Rest_Api);
    }

    addMovement(Movement){
      return axios.post(Add_Movement_Rest_Api, Movement);
    }

    // getStockById(stockId){
    //   return axios.get(Get_One_Stock_By_Id+'/'+stockId);
    // }

    // updateStocK(stock,StockId){
    //   return axios.put(Update_Stock+'/'+stock,StockId);
    // }

    // deleteStockById(stockId){
    //   return axios.delete(Delete_Stock+'/'+stockId);
    // }

}

export default new MovementServices();