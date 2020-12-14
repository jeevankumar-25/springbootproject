package com.example.demo.Category;

import java.util.ArrayList;    
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.example.demo.Product.Product;

@Entity
public class Category {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="categoryId")
	private int cateoryId; 
	
	@Column(name="Category_Name")
	private String name;        
		
	
	  @OneToMany(mappedBy = "category")
	  private List <Product> productsList;
	 
	
 
	
	  
	//getter and setter 

	public Category() {
	
		// TODO Auto-generated constructor stub
	}

	public Category(int cateoryId, String name, List<Product> productsList) {
	
	this.cateoryId = cateoryId;
	this.name = name;
	//this.productsList = productsList;
   }
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getCateoryId() {
		return cateoryId;
	}

	public void setCateoryId(int cateoryId) {
		this.cateoryId = cateoryId;
	}

	public List<Product> getProductsList() {
		return productsList;
	}

	public void setProductsList(List<Product> productsList) {
		this.productsList = productsList;
	}

	
	
	/*
	 * public List<Product> getProductsList() { return productsList; }
	 * 
	 * public void setProductsList(List<Product> productsList) { this.productsList =
	 * productsList; }
	 */
	 
	
	
}
