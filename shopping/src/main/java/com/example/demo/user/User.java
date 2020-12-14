package com.example.demo.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.example.demo.Address.Address;
import com.example.demo.Cart.Cart;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	private int userId;

	@Column(name = "USER_NAME")
	private String userName;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "NUMBER")
	private long number;

	@Column(name = "CART_ID")
	private int cartId;

	
	//  @Column(name="ADDRESS_ID") 
	  //private int addressId;
	 

	@OneToOne
	private Address address;
	
	@OneToOne
	//@JoinColumn(name="Usercart")
	private Cart cart;

	public User() {

	}
	
	  public User(int id, String username, String Email, int num, int cartid, int
	  address)
	  { 
		  this.userId=id; 
		  this.userName=username;
		  this.email=Email;
	  this.number=num;
	  this.cartId=cartid; 
	  //this.addressId=address;
	  
	  }
	 

	
	  public int getUserId() 
	  { 
		  return userId;
	  }
	  public void setUserId(int userId)
	  {
	  this.userId = userId;
	  }
	  public String getUserName()
	  { 
		  return userName; 
		  }
	  public void setUserName(String userName) 
	  { this.userName = userName; 
	  } 
	  public String getEmail()
	  { 
		  return email;
	  } 
	  public void setEmail(String email) 
	  {
	  this.email = email; 
	  }
	  public long getNumber() 
	  { return number; 
	  }
	  public void setNumber(long number) 
	  { this.number = number; 
	  }
	  public Cart getCart() {
		return cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public int getCartId() {
	  return cartId; 
	  }
	  public void setCartId(int cartId)
	  { this.cartId = cartId; 
	  }
	  
		/*
		 * public int getAddressId() { return addressId; } public void setAddressId(int
		 * addressId) { this.addressId = addressId;
		 */
	  //}
	  
	  
	  public Address getAddress() { return address; }
	  
	  public void setAddress(Address address) { this.address = address; }
	 

}
