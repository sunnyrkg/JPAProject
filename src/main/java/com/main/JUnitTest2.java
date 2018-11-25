package com.main;

import java.util.*;

import org.junit.*;

import com.dao.BookingDAO;
import com.dao.GenericDAO;
import com.entity.BankAccount;
import com.entity.BankAccount2;
import com.entity.BankAccount3;
import com.entity.Booking;
import com.entity.CreditCard;
import com.entity.CreditCard2;
import com.entity.CreditCard3;
import com.entity.Member;
import com.entity.MemberSubscriptionLink;
import com.entity.MemberSubscriptionLinkSerial;
import com.entity.Passenger;
import com.entity.Subscription;
import com.entity.Train;

public class JUnitTest2 {
	@Test
	public void testBooking()
	{
		List<Passenger> passenger = new LinkedList<>();
		passenger.add(new Passenger("Akshay Phate", 22));
		passenger.add(new Passenger("Risabh Gupta",23));
		passenger.add(new Passenger("Sudhir Phate", 22));
		passenger.add(new Passenger("Anjana Gupta",23));
		passenger.add(new Passenger("Akshay Kumar", 20));
		passenger.add(new Passenger("Mirza Sharmad",20));
		
		Set<Passenger> passengers = new HashSet<>(passenger);
		Train train = new Train();
		train.setName("Borivali Express");
		train.setDestination("Kanpur");
		train.setSource("Bombay");
		
		Booking booking = new Booking();
		booking.setBookingDate(new Date());
		booking.setPassengers(passengers);
		booking.setTrain(train);
		
		for(Passenger passenger2 : passenger)
		{
			passenger2.setBooking(booking);
		}
		
		BookingDAO bookingDAO = new BookingDAO();
		bookingDAO.insert(booking);
	}
	@Test
	public void testFetch()
	{
		BookingDAO bookingDAO = new BookingDAO();
		bookingDAO.fetchById(1).getPassengers().forEach((pass)->{
			System.out.println(pass.getName());
		});
	}
	@Test
	public void testMemberSubscription()
	{
		Member member = new Member();
		member.setName("Akshay Phate");
		member.setEmail("sunnyrkg1@gmail.com");
		Member member2 = new Member();
		member2.setName("Amar Pawar");
		member2.setEmail("amar196@gmail.com");
		Member member3 = new Member();
		member3.setName("Pranali Narkar");
		member3.setEmail("pranali@yahoo.com");
		Subscription subscription = new Subscription();
		subscription.setMonthlyFee(2000);
		subscription.setSubscriptionFor("DVD");
		Subscription subscription2 = new Subscription();
		subscription2.setMonthlyFee(1000);
		subscription2.setSubscriptionFor("News Letters");
		GenericDAO<Member> daoObject = new GenericDAO<>(Member.class);
		daoObject.insert(member);
		daoObject.insert(member2);
		daoObject.insert(member3);
		GenericDAO<Subscription> SubscriptiondaoObject = new GenericDAO<>(Subscription.class);
		SubscriptiondaoObject.insert(subscription);
		SubscriptiondaoObject.insert(subscription2);
		GenericDAO<MemberSubscriptionLink> linkDao = new GenericDAO<>(MemberSubscriptionLink.class);
		MemberSubscriptionLink msl = new MemberSubscriptionLink();
		MemberSubscriptionLink msl2 = new MemberSubscriptionLink();
		MemberSubscriptionLink msl3 = new MemberSubscriptionLink();
		msl.setId(new MemberSubscriptionLinkSerial(daoObject.fetchById(1), SubscriptiondaoObject.fetchById(2)));
		msl.setDateOfSubscription(new Date());
		msl.setDuration(2);
		msl2.setId(new MemberSubscriptionLinkSerial(daoObject.fetchById(2), SubscriptiondaoObject.fetchById(1)));
		msl2.setDateOfSubscription(new Date());
		msl2.setDuration(2);
		msl3.setId(new MemberSubscriptionLinkSerial(daoObject.fetchById(3), SubscriptiondaoObject.fetchById(2)));
		msl3.setDateOfSubscription(new Date());
		msl3.setDuration(2);
		linkDao.insert(msl);
		linkDao.insert(msl2);
		linkDao.insert(msl3);
		
		
	}
	@Test
	public void testInheritance()
	{
		CreditCard cc = new CreditCard();
		cc.setNameOfThePerson("Risabh Gupta");
		cc.setAmount(1000);
		cc.setCardNumber(17311010054008L);
		cc.setCvv(Short.parseShort("745"));
		cc.setCardType(Short.parseShort("1"));
		cc.setExpiryDate(new Date());
		GenericDAO<CreditCard> creditCardDAO = new GenericDAO<>(CreditCard.class);
		creditCardDAO.insert(cc);
		
	}
	@Test
	public void testInheritanceAlter()
	{
		BankAccount ba = new BankAccount();
		ba.setAccountNumber(173110100054008L);
		ba.setAmount(50000);
		ba.setBankName("Andhra Bank");
		ba.setNameOfThePerson("Saurav Kumar Saraf");
		GenericDAO<BankAccount> genericBankDAO = new GenericDAO<>(BankAccount.class);
		genericBankDAO.insert(ba);
	}
	@Test
	public void testInheritance2()
	{
		CreditCard2 cc = new CreditCard2();
		cc.setNameOfThePerson("Risabh Gupta");
		cc.setAmount(1000);
		cc.setCardNumber(17311010054008L);
		cc.setCvv(Short.parseShort("745"));
		cc.setCardType(Short.parseShort("1"));
		cc.setExpiryDate(new Date());
		GenericDAO<CreditCard2> creditCardDAO = new GenericDAO<>(CreditCard2.class);
		creditCardDAO.insert(cc);
		
	}
	@Test
	public void testInheritanceAlter2()
	{
		BankAccount2 ba = new BankAccount2();
		ba.setAccountNumber(173110100054008L);
		ba.setAmount(50000);
		ba.setBankName("Andhra Bank");
		ba.setNameOfThePerson("Saurav Kumar Saraf");
		GenericDAO<BankAccount2> genericBankDAO = new GenericDAO<>(BankAccount2.class);
		genericBankDAO.insert(ba);
	}
	@Test
	public void testInheritance3()
	{
		CreditCard3 cc = new CreditCard3();
		cc.setNameOfThePerson("Risabh Gupta");
		cc.setAmount(1000);
		cc.setCardNumber(17311010054008L);
		cc.setCvv(Short.parseShort("745"));
		cc.setCardType(Short.parseShort("1"));
		cc.setExpiryDate(new Date());
		GenericDAO<CreditCard3> creditCardDAO = new GenericDAO<>(CreditCard3.class);
		creditCardDAO.insert(cc);
		
	}
	@Test
	public void testInheritanceAlter3()
	{
		BankAccount3 ba = new BankAccount3();
		ba.setAccountNumber(173110100054008L);
		ba.setAmount(50000);
		ba.setBankName("Andhra Bank");
		ba.setNameOfThePerson("Saurav Kumar Saraf");
		GenericDAO<BankAccount3> genericBankDAO = new GenericDAO<>(BankAccount3.class);
		genericBankDAO.insert(ba);
	}
}
