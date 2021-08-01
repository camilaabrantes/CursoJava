package services;

public interface OnlinePaymentServices {

	Double interest(Double amount, Integer months);
	Double paymentFee(Double amount);
	
}
