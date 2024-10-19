package com.pratik;

/*The factory will handle the creation of the different payment methods based on 
user input or system configuration.*/
class PaymentFactory {

	public Payment getPaymentMethod(String paymentType) {
		if (paymentType.equalsIgnoreCase("CREDITCARD")) {
			return new CreditCardPayment();
		} else if (paymentType.equalsIgnoreCase("UPI")) {
			return new UPIPayment();
		} else if (paymentType.equalsIgnoreCase("BANKTRANSFER")) {
			return new BankTransferPayment();
		} else {
			return null;
		}
	}
}
