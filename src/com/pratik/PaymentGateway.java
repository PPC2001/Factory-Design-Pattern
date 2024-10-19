package com.pratik;

/*The PaymentGateway class is where we use the factory to process payments.
It will handle user input, calculate fees, and manage transactions.*/
public class PaymentGateway {
	private PaymentFactory paymentFactory;

	public PaymentGateway() {
		this.paymentFactory = new PaymentFactory();
	}

	public void processPayment(String paymentType, double amount) {
		Payment paymentMethod = paymentFactory.getPaymentMethod(paymentType);

		if (paymentMethod == null) {
			System.out.println("Invalid payment method selected.");
			return;
		}

		// Calculate processing fees
		double fees = paymentMethod.calculateProcessingFees(amount);
		double totalAmount = amount + fees;

		try {
			// Process the payment
			boolean success = paymentMethod.processPayment(totalAmount);
			if (success) {
				paymentMethod.logTransaction(totalAmount);
				System.out.println("Payment successful! Total amount: $" + totalAmount);
			} else {
				throw new RuntimeException("Payment failed due to network issues.");
			}
		} catch (Exception e) {
			System.out.println("Error processing payment: " + e.getMessage());
			System.out.println("Attempting to refund...");
			paymentMethod.refund(amount);
		}
	}

	public void initiateRefund(String paymentType, double amount) {
		Payment paymentMethod = paymentFactory.getPaymentMethod(paymentType);

		if (paymentMethod == null) {
			System.out.println("Invalid payment method for refund.");
			return;
		}

		paymentMethod.refund(amount);
		System.out.println("Refund successful for: $" + amount);
	}
}
