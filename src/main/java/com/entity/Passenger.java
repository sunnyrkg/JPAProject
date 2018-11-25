package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="TBL_PASSENGER")
public class Passenger {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int age;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="pnr")
	private Booking booking;
	/**
	 * @return the id
	 */
	
	public int getId() {
		return id;
	}
	public Passenger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Passenger(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
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
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the booking
	 */
	public Booking getBooking() {
		return booking;
	}
	/**
	 * @param booking the booking to set
	 */
	public void setBooking(Booking booking) {
		this.booking = booking;
	}
	
	
}
