package com.entity;
import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Embeddable
public class MemberSubscriptionLinkSerial implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public MemberSubscriptionLinkSerial(Member member, Subscription subscription) {
		super();
		this.member = member;
		this.subscription = subscription;
	}
	public MemberSubscriptionLinkSerial() {
		super();
		// TODO Auto-generated constructor stub
	}
	@ManyToOne
	@JoinColumn(name="member_id")
	private Member member;
	@ManyToOne
	@JoinColumn(name="subscription_id")
	private Subscription subscription;
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
	
	
}
