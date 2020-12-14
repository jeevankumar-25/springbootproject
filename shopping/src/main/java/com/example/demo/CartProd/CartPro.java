package com.example.demo.CartProd;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import com.example.demo.CartItem.CartItem;
import com.example.demo.Product.Product;
@Entity	
public class CartPro {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="CartProId")
	private int cartProId;
	
	@OneToMany(mappedBy = "cartPro")
	private List<CartItem> cartItem=new ArrayList<>();
	
	@OneToMany(mappedBy = "cartPro")
	private List<Product> product=new ArrayList<>();

	public int getCartProId() {
		return cartProId;
	}

	public void setCartProId(int cartProId) {
		this.cartProId = cartProId;
	}

	public List<CartItem> getCartItem() {
		return cartItem;
	}

	public void setCartItem(List<CartItem> cartItem) {
		this.cartItem = cartItem;
	}

	public List<Product> getProduct() {
		return product;
	}

	public void setProduct(List<Product> product) {
		this.product = product;
	}
	
	

}
