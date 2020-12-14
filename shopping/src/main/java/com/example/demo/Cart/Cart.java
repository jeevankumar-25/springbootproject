package com.example.demo.Cart;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.example.demo.Order.Order;
import com.example.demo.Product.Product;
import com.example.demo.user.User;

@Entity
public class Cart {
	
	
	@Id
	@Column(name="cart_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cartId;
	

	
	@Column(name="Total")
	int total;
	
     
	
	@OneToOne(mappedBy = "cart")
	private User user;
	
	@OneToMany(mappedBy = "cart")
	private List<Order> orderList;

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}
	

	
}
