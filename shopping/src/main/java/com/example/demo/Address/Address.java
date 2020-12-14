package com.example.demo.Address;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Address {
	
	@Id
	@Column(name="ADDRESS_ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  addressId;
	
	@Column(name="Name")
	private String name;
	
	@Column(name="Address_Line_1")
	private String addressLine1;
	
	@Column(name="Address_Line_2")
	private String addressLine2;
	
	@Column(name="City")
	private String city;
	
	@Column(name="State")
	private String state;
	
	@Column(name="Postcode")
	private int  postcode;
	
	@Column(name="MobileNo")
	private long mobileNo;


	
	
	
	
	//getter and setter  
	
	
	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	
	
	
	
	

}
