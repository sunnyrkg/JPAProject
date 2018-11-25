package com.service;

import com.dao.BookingDAO;
import com.dao.PassengerDAO;
import com.dao.TrainDAO;
import com.entity.Booking;
import com.entity.Passenger;
import com.entity.Train;

public class ProjectService {
	static void registerTrain(Train train)
	{
		TrainDAO trainDAO = new TrainDAO();
		trainDAO.insert(train);
	}
	static void registerPassenger(Passenger passenger)
	{
		PassengerDAO passengerDAO = new PassengerDAO();
		passengerDAO.insert(passenger);
	}
	static void registerBooking(Booking booking)
	{
		BookingDAO bookingDAO = new BookingDAO();
		bookingDAO.insert(booking);
	}
}
