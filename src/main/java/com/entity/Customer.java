package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.json.simple.JSONObject;
@Entity
@Table(name = "CUSTOMER")
public class Customer {
	
	@Id@GeneratedValue@Column(name = "CUST_ID")private int uid;
	@Column(name = "CUST_NAME")private String name;
	@Column(name = "CUST_EMAIL")private String email;
	@Column(name = "CUST_CITY")private String city;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "uid")
	private Address address;
	/**
	 * @return the uid
	 */
	public Customer()
	{
		
	}
	
	
	public Customer(int uid, String name, String email, String city, Address address) {
		super();
		this.uid = uid;
		this.name = name;
		this.email = email;
		this.city = city;
		this.address = address;
	}

	
	public Customer(String name, String email, String city, Address address) {
		super();
		this.name = name;
		this.email = email;
		this.city = city;
		this.address = address;
	}


	public int getUid() {
		return uid;
	}
	/**
	 * @param uid the uid to set
	 */
	public void setUid(int uid) {
		this.uid = uid;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		JSONObject jsonobject = new JSONObject();
		jsonobject.put("name", this.getName());
		jsonobject.put("city",this.getCity());
		jsonobject.put("email", this.getEmail());
		return "Customer ["+jsonobject.toJSONString()+"]";
	}
	
	
}
