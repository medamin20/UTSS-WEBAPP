package tn.utss.service;

import java.util.List;

import tn.utss.model.Category;

public interface CategoryService {

	// ===== CRUD =====//

	List<Category> retrieveAllCategories();

	Category retrieveCategory(long idCategory);

	Category addCategory(Category c);

	Category updateCategory(Category c);

	void deleteCategory(long idCategory);

	// ===== CRUD =====//

}
