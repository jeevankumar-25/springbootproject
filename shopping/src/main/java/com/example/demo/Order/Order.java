package com.example.demo.Order;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.example.demo.Cart.Cart;
import com.example.demo.CartItem.CartItem;

@Entity
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "OrderID")
	private int orderID;
	
	
	@Column(name = "Total")
	private long total;
	  
	
	
	@ManyToOne(targetEntity = Cart.class,cascade = CascadeType.ALL)
	@JoinColumn(name="cart_ID")
	private Cart cart;
	
	@OneToOne
	@JoinColumn(name="cartItems")
	private CartItem cartItem;

	public int getOrderID() {
		return orderID;
	}

	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public CartItem getCartItem() {
		return cartItem;
	}

	public void setCartItem(CartItem cartItem) {
		this.cartItem = cartItem;
	}

	
}
 