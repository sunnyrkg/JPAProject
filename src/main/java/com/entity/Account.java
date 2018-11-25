package com.entity;

import java.util.Set;

import javax.persistence.*;

import org.json.simple.JSONObject;

@Entity
@Table(name="TBL_ACCOUNT")
public class Account {
	@Id @GeneratedValue private int accNo;
	private String accountHolderName;
	@Column(columnDefinition = "int default 0") private double balance ;
	@OneToMany(mappedBy = "account",fetch = FetchType.EAGER)
	private Set<Transaction> trans_uid;
	/**
	 * @return the uid
	 */
	public Account(String accountHolderName) {
		super();
		this.accountHolderName = accountHolderName;
	}
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the accNo
	 */
	public int getAccNo() {
		return accNo;
	}


	/**
	 * @param accNo the accNo to set
	 */
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}


	/**
	 * @return the accountHolderName
	 */
	public String getAccountHolderName() {
		return accountHolderName;
	}
	/**
	 * @param accountHolderName the accountHolderName to set
	 */
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}


	/**
	 * @return the trans_uid
	 */
	public Set<Transaction> getTrans_uid() {
		return trans_uid;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return accountHolderName;
		
	}
	
	
	
}
