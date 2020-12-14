package com.example.demo.Product;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImp implements ProductService {
	
	@Autowired
	private ProductRepository productrepo;
	
	public List<Product> getAllProducts()
	{
		return productrepo.findAll();
	}
	
	
	public Optional<Product> getProductById(int id)
	{
		return productrepo.findById(id);
	}
	
	public Product saveProduct(Product product)
	{
		return productrepo.save(product);
	}
	
	public void deleteProductById(int id)
	{ 
		productrepo.deleteById(id);
	}
	
	
	//updating product
	public Product updateProduct(Product product)
	{
		Product pro=productrepo.findById(product.getProductId()).get();
		
		if(product.getProductCode()!=null)
		{
			pro.setProductCode(product.getProductCode());
		}
		
		if(product.getBrand()!=null)
		{
			pro.setBrand(product.getBrand());
		}
		
		if(product.getProductName()!=null)
		{
			pro.setProductName(product.getProductName());
		}
		
		if(product.getUnitPrice()!=0)
		{
			pro.setUnitPrice(product.getUnitPrice());
		}
		
		if(product.getDescription()!=null)
		{
			pro.setDescription(product.getDescription());
		}
		
		if(product.getQuantity()!=0)
		{
			pro.setQuantity(product.getQuantity());
		}
		
		
		return  productrepo.save(pro);
		
		
		
		
	}

}
