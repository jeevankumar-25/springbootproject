package com.example.demo.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
	public List<Product> getAllProducts();
	public Optional<Product> getProductById(int id);
	public Product saveProduct(Product product);
	public void deleteProductById(int id);
	public Product updateProduct(Product product);

}
