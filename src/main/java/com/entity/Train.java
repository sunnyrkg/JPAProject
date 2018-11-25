package com.entity;

import java.util.Set;

import javax.persistence.*;
@Entity
@Table(name="TBL_TRAIN")
public class Train {
	@Id
	@GeneratedValue
	private int trainNo;
	private String name;
	private String source;
	private String destination;
	@OneToMany(mappedBy = "train",fetch=FetchType.EAGER)
	private Set<Booking> bookings;
	/**
	 * @return the trainNo
	 */
	public int getTrainNo() {
		return trainNo;
	}
	/**
	 * @param trainNo the trainNo to set
	 */
	public void setTrainNo(int trainNo) {
		this.trainNo = trainNo;
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
	 * @return the source
	 */
	public String getSource() {
		return source;
	}
	/**
	 * @param source the source to set
	 */
	public void setSource(String source) {
		this.source = source;
	}
	/**
	 * @return the destination
	 */
	public String getDestination() {
		return destination;
	}
	/**
	 * @param destination the destination to set
	 */
	public void setDestination(String destination) {
		this.destination = destination;
	}
	/**
	 * @return the bookings
	 */
	public Set<Booking> getBookings() {
		return bookings;
	}
	/**
	 * @param bookings the bookings to set
	 */
	public void setBookings(Set<Booking> bookings) {
		this.bookings = bookings;
	}
	
	
}
