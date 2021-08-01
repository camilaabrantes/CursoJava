package services;

public class PaypalService implements OnlinePaymentServices{

	public Double testando() {
		return 2.00;
	}
	@Override
	public Double interest(Double amount, Integer months) {
		Double parcelaInterest = amount + 0.01*amount*months;		
		return parcelaInterest;
	}
	
	@Override
	public Double paymentFee(Double amount) {		
		return amount + amount*0.02;
	}

}
