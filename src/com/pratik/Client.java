package com.pratik;

public class Client {
	public static void main(String[] args) {
		PaymentGateway paymentGateway = new PaymentGateway();

		// Example 1: Pay with Credit Card
		System.out.println("User selects Credit Card:");
		paymentGateway.processPayment("CREDITCARD", 100.0);

		System.out.println("\nUser selects UPI:");
		// Example 2: Pay with UPI
		paymentGateway.processPayment("UPI", 200.0);

		System.out.println("\nUser selects Bank Transfer:");
		// Example 3: Pay with Bank Transfer
		paymentGateway.processPayment("BANKTRANSFER", 300.0);

		System.out.println("\nInitiating a refund for UPI payment...");
		paymentGateway.initiateRefund("UPI", 200.0);
	}
}
