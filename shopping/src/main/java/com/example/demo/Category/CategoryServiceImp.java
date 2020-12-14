package com.example.demo.Category;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryServiceImp implements CategoryService {
	
	@Autowired
	private CategoryRepository catRep;
	
	
	public List<Category> getAllCategory(){
		
		return catRep.findAll();
	}
	
	public Optional<Category> getCategory(int id)
	{
		return catRep.findById(id);
	}
	
	public Category saveCategory(Category category)
	{
	    return catRep.save(category);	
	}
	
	public Category updateCategory(Category category )
	{
		Category ca=catRep.findById(category.getCateoryId()).get();
		
		if(category.getCateoryId()!=0)
		{ 
			ca.setCateoryId(category.getCateoryId()); 
		}
		
		if(category.getName()!=null)
		{
			ca.setName(category.getName());
		}
		
		return catRep.save(ca);
				
	}
	
		
	public  void deleteCategory(int id)
	{
		catRep.deleteById(id);
	}
	

}
