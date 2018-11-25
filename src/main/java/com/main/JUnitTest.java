package com.main;
import org.junit.*;

import com.dao.AccountDAO;
import com.dao.GenericDAO;
import com.entity.Account;
import com.service.AccountService;

public class JUnitTest {
	@Test
	public void testOpenAccount()
	{
		AccountService accountservice = new AccountService();
		Account account = new Account();
		account.setAccountHolderName("Rishi Gupta");
		accountservice.openAccount(account);
	}
	@Test
	public void testDeposit()
	{
		AccountService accountService = new AccountService();
		accountService.deposit(2, 7000);
		accountService.deposit(3, 7000);
		accountService.deposit(4, 7000);
	}
	@Test
	public void testWithdraw()
	{
		AccountService accountService = new AccountService();
		accountService.withdraw(1, 2000);
		accountService.withdraw(2, 1000);
		accountService.withdraw(3, 1000);
		accountService.withdraw(4, 1000);
	}
	@Test
	public void testTransfer()
	{
		AccountService accountService = new AccountService();
		accountService.transfer(1, 2, 1000);
	}
	@Test
	public void testGetTransaction()
	{
		AccountDAO accountdao = new AccountDAO();
		accountdao.fetchById(2).getTrans_uid().forEach((transaction)->{
			System.out.println(transaction);
		});
	}
	@Test
	public void testGetBalance()
	{
		AccountDAO accountdao = new AccountDAO();
		System.out.println(accountdao.fetchBalance(2));
	}
	@Test
	public void testMinistatement()
	{
		AccountDAO accountdao = new AccountDAO();
		accountdao.getMiniStatement(1).forEach((transaction)->{
			System.out.println(transaction);
		});
	}
	@Test
	public void testListAccount()
	{
		AccountDAO accountDAO = new AccountDAO();
		accountDAO.fetchAcountsByTransaction(1000).forEach((account)->{
			System.out.println(account);
		});
	}
	@Test
	public void testFetchMaxAmountAccount()
	{
		AccountDAO accountDAO = new AccountDAO();
		accountDAO.fetchAccountWithHighestAmount().forEach((account)->{
			System.out.println(account);
		});
	}
}
