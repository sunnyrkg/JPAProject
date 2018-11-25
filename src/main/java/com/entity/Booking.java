package com.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name="TBL_BOOKING")
public class Booking {
	@Id
	@GeneratedValue
	private int pnr;
	private Date bookingDate;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="trainNo")
	private Train train;
	@OneToMany(cascade=CascadeType.ALL,mappedBy="booking",fetch=FetchType.EAGER)
	private Set<Passenger> passengers;
	/**
	 * @return the pnr
	 */
	public int getPnr() {
		return pnr;
	}
	/**
	 * @param pnr the pnr to set
	 */
	public void setPnr(int pnr) {
		this.pnr = pnr;
	}
	/**
	 * @return the bookingDate
	 */
	public Date getBookingDate() {
		return bookingDate;
	}
	/**
	 * @param bookingDate the bookingDate to set
	 */
	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}
	/**
	 * @return the train
	 */
	public Train getTrain() {
		return train;
	}
	/**
	 * @param train the train to set
	 */
	public void setTrain(Train train) {
		this.train = train;
	}
	/**
	 * @return the passengers
	 */
	public Set<Passenger> getPassengers() {
		return passengers;
	}
	/**
	 * @param passengers the passengers to set
	 */
	public void setPassengers(Set<Passenger> passengers) {
		this.passengers = passengers;
	}
	
	
}
