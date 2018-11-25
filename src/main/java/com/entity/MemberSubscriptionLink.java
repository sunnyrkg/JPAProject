package com.entity;

import java.util.Date;

import javax.persistence.*;
@Entity
@Table
public class MemberSubscriptionLink {
	
	@EmbeddedId
	private MemberSubscriptionLinkSerial id;
	private Date dateOfSubscription;
	private int duration;
	/**
	 * @return the id
	 */
	public MemberSubscriptionLinkSerial getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(MemberSubscriptionLinkSerial id) {
		this.id = id;
	}
	/**
	 * @return the dateOfSubscription
	 */
	public Date getDateOfSubscription() {
		return dateOfSubscription;
	}
	/**
	 * @param dateOfSubscription the dateOfSubscription to set
	 */
	public void setDateOfSubscription(Date dateOfSubscription) {
		this.dateOfSubscription = dateOfSubscription;
	}
	/**
	 * @return the duration
	 */
	public int getDuration() {
		return duration;
	}
	/**
	 * @param duration the duration to set
	 */
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
	
}
