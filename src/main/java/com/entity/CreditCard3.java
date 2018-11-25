package com.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
@Entity
@Table
@PrimaryKeyJoinColumn(name = "payment_id",referencedColumnName="uid")
public class CreditCard3 extends PaymentDetails3{
	/**
	 * @return the cardNumber
	 */
	public long getCardNumber() {
		return cardNumber;
	}
	/**
	 * @param cardNumber the cardNumber to set
	 */
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	/**
	 * @return the expiryDate
	 */
	public Date getExpiryDate() {
		return expiryDate;
	}
	/**
	 * @param expiryDate the expiryDate to set
	 */
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	/**
	 * @return the cvv
	 */
	public short getCvv() {
		return cvv;
	}
	/**
	 * @param cvv the cvv to set
	 */
	public void setCvv(short cvv) {
		this.cvv = cvv;
	}
	/**
	 * @return the cardType
	 */
	public short getCardType() {
		return cardType;
	}
	/**
	 * @param cardType the cardType to set
	 */
	public void setCardType(short cardType) {
		this.cardType = cardType;
	}
	private long cardNumber;
	private Date expiryDate;
	private short cvv;
	private short cardType;
	
	
}
