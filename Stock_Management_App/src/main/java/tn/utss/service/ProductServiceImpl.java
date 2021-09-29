package tn.utss.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.BulkOperations;
import org.springframework.data.mongodb.core.BulkOperations.BulkMode;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.WriteResultChecking;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators.IndexOfArray;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import com.mongodb.bulk.BulkWriteResult;
import com.mongodb.client.result.UpdateResult;

import tn.utss.model.Product;
import tn.utss.model.Stock;
import tn.utss.repository.ProductRepository;
import tn.utss.repository.StockRepository;

@Service
public class ProductServiceImpl implements ProductService {

	
	 @Autowired
	    MongoTemplate mongoTemplate;
	
	@Autowired
	ProductRepository productRepository;
	
	@Autowired
	StockService stockService;


	@Autowired
	StockRepository stockRepository;
	
 

	
	@Autowired
	SequenceGeneratorService sequenceGeneratorService;

	private static final Logger L = LogManager.getLogger(ProductServiceImpl.class);

	@Override
	public List<Product> retrieveAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product retrieveProduct(long idProduct) {
		Product Product = productRepository.findById(idProduct).get();
		L.info("Product returned +++ :" + Product);
		return Product;
	}

	@Override
	public Product addProduct(Product p,long idStock) {
		p.setIdProduct(sequenceGeneratorService.generateSequence(Product.SEQUENCE_NAME));
		Stock Stk=stockRepository.findById(idStock).get();
		Stk.getStockProducts().add(p);
		stockRepository.save(Stk);
		return productRepository.save(p);
	}

	@Override
	public Product updateProduct(Product p,long idStock) {
		
		Stock stk=stockRepository.findById(idStock).get();
		
		 List<Product> StockProds =stk.getStockProducts();
		 for (Product p1 : StockProds) {
			    if (p.getBarcode()==(p1.getBarcode())){
			         long id= p.getIdProduct();
			    
		 Product existingProduct=productRepository.findById(id).get();
		existingProduct.setQuantityProduct(p.getQuantityProduct());
		
		
		productRepository.save(existingProduct);
		stockService.updateStock(id,stk );

			    }
			}
		 return(p);
	}

	@Override
	public void deleteProduct(long idProduct) {
		productRepository.deleteById(idProduct);

	}

	@Override
	public Product updateOneProduct(Product p, long idStock) {
		Stock stk=stockRepository.findById(idStock).get();
		 List<Product> StockProducts =stk.getStockProducts();
		 
		 for (Product p1 : StockProducts) {
			 if (p1.getBarcode().toString().equals(p.getBarcode().toString())){	 
				 System.out.println("LE PRODUITS EST  "+p1.toString()); 
				 int k =StockProducts.indexOf(p1);
				 System.out.println("k est "+ k);
				 StockProducts.get(k).setQuantityProduct(p.getQuantityProduct()); 
				 System.out.println(p1.getQuantityProduct());
				 productRepository.save(StockProducts.get(k));
		         stockService.updateStock(idStock, stk);
			 }
		 }
	
		return p;
	}

}



//for (Product p1 : StockProducts) {
//	 if (p.getBarcode().equals(p1.getBarcode())){
//
//        long id= p1.getIdProduct();
//        
//        	BulkOperations bo=MT.bulkOps(BulkMode.UNORDERED, Product.class);
//        	
//        	Query query=new Query().addCriteria(new Criteria("idProduct").is(id));
//        	Update update=new Update().set("ProductQuantity", p.getQuantityProduct());
//        	bo.updateOne(query, update);
//        	
//        	BulkWriteResult results=bo.execute();
//        	
//        	stockRepository.save(stockRepository.findById(idStock).get());		 
//	 }}




//query.addCriteria(Criteria.where("idProduct").is(id));
//
//
//Product existingProduct=MT.findOne(query, Product.class);
//existingProduct.setTitleProduct(p.getTitleProduct());
//existingProduct.setQuantityProduct(p.getQuantityProduct());
//MT.save(existingProduct);