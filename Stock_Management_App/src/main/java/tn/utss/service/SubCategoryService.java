package tn.utss.service;

import java.util.List;

import tn.utss.model.SubCategory;

public interface SubCategoryService {

	// ===== CRUD =====//

	List<SubCategory> retrieveAllSubCategories();

	SubCategory retrieveSubCategory(long idSubCategory);

	SubCategory addSubCategory(SubCategory sc,long idCategory);

	SubCategory updateSubCategory(SubCategory sc);

	void deleteSubCategory(long idSubCategory);

	// ===== CRUD =====//
}
