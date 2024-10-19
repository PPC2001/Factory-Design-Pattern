package com.pratik;

class UPIPayment implements Payment {
	@Override
	public boolean processPayment(double amount) {
		// Simulate UPI validation and payment logic
		System.out.println("Validating UPI ID...");
		System.out.println("Processing UPI Payment of: $" + amount);
		// Assume UPI payment is successful
		return true;
	}

	@Override
	public double calculateProcessingFees(double amount) {
		double fee = amount * 0.01; // 1% fee for UPI transactions
		System.out.println("UPI Payment Fees: $" + fee);
		return fee;
	}

	@Override
	public void logTransaction(double amount) {
		System.out.println("Logging UPI Payment of: $" + amount);
		// Simulate writing transaction log to a database
	}

	@Override
	public void refund(double amount) {
		System.out.println("Refunding UPI Payment of: $" + amount);
		// Logic for refunding payment via UPI
	}
}
