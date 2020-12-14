package com.example.demo.Product;

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
public class ProductController {
	
	@Autowired
	private ProductService productservice;

	@GetMapping(path="/products")
	public List<Product> getAllProduct()
	{
		return productservice.getAllProducts();
	}
	
	@GetMapping(path="/product/{id}")
	public Optional<Product> getProductById(@PathVariable int id)
	{
		return productservice.getProductById(id);
	}
	
	@PutMapping(path="/product")
	public Product updateProduct(@RequestBody Product product)
	{
		return productservice.updateProduct(product);
	}
	
	@PostMapping(path="/product")
	public Product saveProduct(@RequestBody  Product product)
	{
	     return productservice.saveProduct(product)	;
	}
	
	@DeleteMapping(path="/product/{id}")
	public void  deletProduct(@PathVariable  int id)
	{
		productservice.deleteProductById(id);
	}
	
}
