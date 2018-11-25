package com.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name="TBL_TRANSLOG")
public class Transaction {
	public static final short TRANSFER  = 1;
	public static final short WITHDRAW = 2;
	public static final short DEPOSIT = 3;
	@Id
	@GeneratedValue
	private int uid;
	private double amount;
	private short transactionTypeNumber;
	private String description;
	private Date date;
	@ManyToOne
	@JoinColumn(name="accno")
	private Account account;
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
	/**
	 * @return the transactionTypeNumber
	 */
	public short getTransactionTypeNumber() {
		return transactionTypeNumber;
	}
	/**
	 * @param transactionTypeNumber the transactionTypeNumber to set
	 */
	public void setTransactionTypeNumber(short transactionTypeNumber) {
		this.transactionTypeNumber = transactionTypeNumber;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the date
	 */
	public Date getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	public void setDate(Date date) {
		this.date = date;
	}
	/**
	 * @return the account
	 */
	public Account getAccount() {
		return account;
	}
	/**
	 * @param account the account to set
	 */
	public void setAccount(Account account) {
		this.account = account;
	}
	public String getTransactionType()
	{
		switch(this.getTransactionTypeNumber()){
		case Transaction.DEPOSIT:return "Deposit";
		case Transaction.TRANSFER:return "Transfer";
		case Transaction.WITHDRAW:return "Withdraw";
		default: return "Unspecified";}
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Transaction [uid=" + uid + ", amount=" + amount + ", transactionTypeNumber=" + transactionTypeNumber
				+ ", description=" + description + ", date=" + date + "]";
	}
	
	
}
