package com.example.demo.CartItem;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.example.demo.CartProd.CartPro;
import com.example.demo.Order.Order;
@Entity
public class CartItem {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="CartItemId")
	private int cartItemId;
	
	@OneToOne(mappedBy = "cartItem")
	private Order order;

	@ManyToOne(targetEntity = CartPro.class,cascade = CascadeType.ALL)
	@JoinColumn(name="cartproId")
	private CartPro cartPro;

	public int getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(int cartItemId) {
		this.cartItemId = cartItemId;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	
	public CartPro getCartPro() {
		return cartPro;
	}

	public void setCartPro(CartPro cartPro) {
		this.cartPro = cartPro;
	}
	
	
}
