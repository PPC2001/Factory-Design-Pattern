package com.pratik;

public class CreditCardPayment implements Payment {

	@Override
	public boolean processPayment(double amount) {
		// Simulating credit card validation and payment logic
		System.out.println("Validating Credit Card Details...");
		System.out.println("Processing Credit Card Payment of: $" + amount);
		return true; // Payment successful
	}

	@Override
	public double calculateProcessingFees(double amount) {
		double fee = amount * 0.025; // 2.5% fee
		System.out.println("Credit Card Payment Fees: $" + fee);
		return fee;
	}

	@Override
	public void logTransaction(double amount) {
		System.out.println("Logging Credit Card Payment of: $" + amount);
		// Simulate writing transaction log to a database
	}

	@Override
	public void refund(double amount) {
		System.out.println("Refunding Credit Card Payment of: $" + amount);
		// Logic for refunding payment back to the credit card
	}

}
