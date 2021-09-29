package tn.utss.service;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.utss.model.Category;
import tn.utss.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	
	@Autowired
	SequenceGeneratorService sequenceGeneratorService;

	private static final Logger L = LogManager.getLogger(CategoryServiceImpl.class);

	@Override
	public List<Category> retrieveAllCategories() {
		return categoryRepository.findAll();
	}

	@Override
	public Category retrieveCategory(long idCategory) {
		Category category = categoryRepository.findById(idCategory).get();
		L.info("category returned +++ :" + category);
		return category;
	}

	@Override
	public Category addCategory(Category c) {
		c.setIdCategory(sequenceGeneratorService.generateSequence(Category.SEQUENCE_NAME));
		return categoryRepository.save(c);
	}

	@Override
	public Category updateCategory(Category c) {
		return categoryRepository.save(c);
	}

	@Override
	public void deleteCategory(long idCategory) {
		categoryRepository.deleteById(idCategory);

	}

}
