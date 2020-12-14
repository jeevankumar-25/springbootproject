package com.example.demo.Category;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoryController {
	
@Autowired	
private CategoryService catSer;
	

@GetMapping(path="/categorys")
public List<Category> getCategory()
{
	return catSer.getAllCategory();
}


@GetMapping(path="/category/{id}")
public Optional<Category> getCategoryById(@PathVariable int id)
{
	return catSer.getCategory(id);
}

@PutMapping(path="/category")
public Category updateCategory(@RequestBody Category category)
{
	return catSer.updateCategory(category);
}

@PostMapping(path="/category")
public Category saveCategory(@RequestBody Category category)
{
	return catSer.saveCategory(category);
}

@DeleteMapping(path="/category/{id}")
public void deleteCategory(@PathVariable int id)
{
    catSer.deleteCategory(id);
}


}
