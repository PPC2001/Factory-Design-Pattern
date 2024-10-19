package com.pratik;

/*This interface will be implemented by all payment methods and 
 * includes real-world methods for processing payments, like transaction logging,
 *  calculating fees, and refunding.*/

public interface Payment {
	boolean processPayment(double amount);

	double calculateProcessingFees(double amount);

	void logTransaction(double amount);

	void refund(double amount);
}
