package com.pratik;

class BankTransferPayment implements Payment {
	@Override
	public boolean processPayment(double amount) {
		// Simulate bank transfer payment
		System.out.println("Validating Bank Account Details...");
		System.out.println("Processing Bank Transfer Payment of: $" + amount);
		return true;
	}

	@Override
	public double calculateProcessingFees(double amount) {
		double fee = 5.00; // Fixed fee for bank transfers
		System.out.println("Bank Transfer Payment Fees: $" + fee);
		return fee;
	}

	@Override
	public void logTransaction(double amount) {
		System.out.println("Logging Bank Transfer Payment of: $" + amount);
		// Simulate writing transaction log to a database
	}

	@Override
	public void refund(double amount) {
		System.out.println("Refunding Bank Transfer Payment of: $" + amount);
		// Logic for refunding payment via bank transfer
	}
}
