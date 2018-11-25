package com.service;

import java.util.Date;

import com.dao.GenericDAO;
import com.entity.Account;
import com.entity.Transaction;

public class AccountService {
	public void openAccount(Account account)
	{
		GenericDAO<Account> account_dao = new GenericDAO<>(Account.class);
		account_dao.insert(account);
	}
	public void withdraw(int accno,double amount)
	{
		GenericDAO<Account> account_dao = new GenericDAO<>(Account.class);
		Account account = account_dao.fetchById(accno);
		Transaction trans = new Transaction();
		trans.setAccount(account);
		trans.setAmount(amount);
		trans.setDate(new Date());
		trans.setDescription("Witdraw Amount");
		trans.setTransactionTypeNumber(Transaction.WITHDRAW);
		GenericDAO<Transaction> transaction_dao = new GenericDAO<>(Transaction.class);
		transaction_dao.insert(trans);
		account.setBalance(account.getBalance()-amount);
		account_dao.update(account);
		
	}
	public void deposit(int accno,double amount)
	{
		GenericDAO<Account> account_dao = new GenericDAO<>(Account.class);
		Account account = account_dao.fetchById(accno);
		Transaction trans = new Transaction();
		trans.setAccount(account);
		trans.setAmount(amount);
		trans.setDate(new Date());
		trans.setDescription("Deposit Amount");
		trans.setTransactionTypeNumber(Transaction.DEPOSIT);
		GenericDAO<Transaction> transaction_dao = new GenericDAO<>(Transaction.class);
		transaction_dao.insert(trans);
		account.setBalance(account.getBalance()+amount);
		account_dao.update(account);
	}
	public void transfer(int sourceAccountNo,int targetAccountNo,double amount)
	{
		withdraw(sourceAccountNo, amount);
		deposit(targetAccountNo, amount);
	}
}
