package com.example.demo.Category;

import java.util.List;
import java.util.Optional;

public interface CategoryService {
	
	public List<Category> getAllCategory();
	
	public Optional<Category> getCategory(int id);
	
	public Category saveCategory(Category category);
	
	public Category updateCategory(Category category);
	
	public  void deleteCategory(int id);

}
