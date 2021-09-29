package tn.utss.service;

import java.util.List;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.utss.model.Category;
import tn.utss.model.SubCategory;
import tn.utss.repository.CategoryRepository;
import tn.utss.repository.SubCategoryRepository;

@Service
public class SubCategoryServiceImpl implements SubCategoryService {

	@Autowired
	SubCategoryRepository subCategoryRepository;
	
	@Autowired
	CategoryRepository CategoryRepository;
	
	@Autowired
	SequenceGeneratorService sequenceGeneratorService;

	private static final Logger L = LogManager.getLogger(SubCategoryServiceImpl.class);

	@Override
	public List<SubCategory> retrieveAllSubCategories() {
		return subCategoryRepository.findAll();
	}

	@Override
	public SubCategory retrieveSubCategory(long idSubCategory) {
		SubCategory subCategory = subCategoryRepository.findById(idSubCategory).get();
		L.info("SubCategory returned +++ :" + subCategory);
		return subCategory;
	}

	@Override
	public SubCategory addSubCategory(SubCategory sc,long idCategory) {
		sc.setIdSubCategory(sequenceGeneratorService.generateSequence(SubCategory.SEQUENCE_NAME));
		Category cat=CategoryRepository.findById(idCategory).get();
		sc.setCategory(cat);
		return subCategoryRepository.save(sc);
	}

	@Override
	public SubCategory updateSubCategory(SubCategory c) {
		return subCategoryRepository.save(c);
	}

	@Override
	public void deleteSubCategory(long idSubCategory) {
		subCategoryRepository.deleteById(idSubCategory);

	}
}
