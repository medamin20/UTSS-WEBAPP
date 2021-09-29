package tn.utss.service;

import java.util.List;

import tn.utss.model.Product;

public interface ProductService {

	// ===== CRUD =====//

	List<Product> retrieveAllProducts();

	Product retrieveProduct(long idProduct);

	Product addProduct(Product p,long idStock);

	Product updateProduct(Product p,long idStock);
	
	Product updateOneProduct(Product p,long idStock);

	void deleteProduct(long idProduct);

	// ===== CRUD =====//
}
