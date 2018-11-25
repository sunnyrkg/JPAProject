package com.entity;

import java.util.Date;

import javax.persistence.*;
@Entity
@Table
public class MemberSubscriptionLink2 {
	@Id
	@GeneratedValue
	private int uid;
	@ManyToOne
	@JoinColumn(name="member_id")
	private Member member;
	@ManyToOne
	@JoinColumn(name="subscription_id")
	private Subscription subscription;
	private Date dateOfSubscription;
	private int duration;
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
	 * @return the member
	 */
	public Member getMember() {
		return member;
	}
	/**
	 * @param member the member to set
	 */
	public void setMember(Member member) {
		this.member = member;
	}
	/**
	 * @return the subscription
	 */
	public Subscription getSubscription() {
		return subscription;
	}
	/**
	 * @param subscription the subscription to set
	 */
	public void setSubscription(Subscription subscription) {
		this.subscription = subscription;
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
