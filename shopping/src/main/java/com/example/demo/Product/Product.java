package com.example.demo.Product;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.example.demo.CartProd.CartPro;
import com.example.demo.Category.Category;

/**
 * @author TOSHIBA
 *
 */
@Entity
public class Product {
	@Id
	@Column(name = "Product_Id")
	private int productId;

	@Column(name = "Product_Code")
	private String productCode;

	@Column(name = "Brand")
	private String brand;

	@Column(name = "Product_Name")
	private String productName;

	@Column(name = "Unit_Price")
	private int unitPrice;

	@Column(name = "Description")
	private String description;
  
	@Column(name = "Quantity")
	private int quantity;

	@ManyToOne(targetEntity =Category.class ,cascade = CascadeType.ALL )
	@JoinColumn(name="categoryID" )
	private Category category;
	
	@ManyToOne(targetEntity =CartPro.class,cascade =CascadeType.ALL )
	@JoinColumn(name="CartProId")
	private CartPro cartPro;
	

	// Getters and setters 
	

	

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productCode, String brand, String productName, int unitPrice,
			String description, int quantity, Category catagory) {
		this.productId = productId;
		this.productCode = productCode;
		this.brand = brand;
		this.productName = productName;
		this.unitPrice = unitPrice;
		this.description = description;
		this.quantity = quantity;
		
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductCode() {
		return productCode;
	}

	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) { 
		this.brand = brand;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {  
		this.unitPrice = unitPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public CartPro getCartPro() {
		return cartPro;
	}

	public void setCartPro(CartPro cartPro) {
		this.cartPro = cartPro;
	}
	
	


}
