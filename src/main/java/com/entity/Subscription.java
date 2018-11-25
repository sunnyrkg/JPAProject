package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "TBL_SUBSCRIPTION")
public class Subscription {
	@Id
	@GeneratedValue
	private int uid;
	private String subscriptionFor;
	private double monthlyFee;
	/**
	 * @return the uid
	 */
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
	 * @return the subscriptionFor
	 */
	public String getSubscriptionFor() {
		return subscriptionFor;
	}
	/**
	 * @param subscriptionFor the subscriptionFor to set
	 */
	public void setSubscriptionFor(String subscriptionFor) {
		this.subscriptionFor = subscriptionFor;
	}
	/**
	 * @return the monthlyFee
	 */
	public double getMonthlyFee() {
		return monthlyFee;
	}
	/**
	 * @param monthlyFee the monthlyFee to set
	 */
	public void setMonthlyFee(double monthlyFee) {
		this.monthlyFee = monthlyFee;
	}
	
	
}
