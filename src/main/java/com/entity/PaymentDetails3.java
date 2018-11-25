package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table
@Inheritance(strategy=InheritanceType.JOINED)
public abstract class PaymentDetails3 {
	@Id
	@GeneratedValue
	private int uid;
	private String nameOfThePerson;
	private double amount;
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
	 * @return the nameOfThePerson
	 */
	public String getNameOfThePerson() {
		return nameOfThePerson;
	}
	/**
	 * @param nameOfThePerson the nameOfThePerson to set
	 */
	public void setNameOfThePerson(String nameOfThePerson) {
		this.nameOfThePerson = nameOfThePerson;
	}
	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
	
	
}
