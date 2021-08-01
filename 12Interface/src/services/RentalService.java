package services;

import entities.CarRental;
import entities.Invoice;

public class RentalService {
	
	private Double pricePerHour;
	private Double pricePerDay;
	
	private TaxService taxService;
	
	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public Double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public TaxService getTaxService() {
		return taxService;
	}

	public void setTaxService(TaxService taxService) {
		this.taxService = taxService;
	}
	
	public void processInvoice(CarRental carRental) {
		long start = carRental.getStart().getTime();
		long finish = carRental.getFinish().getTime();
				
		double rentalTime = (double) (finish - start)/1000/60/60;
		double basicPayment;
		
		if(rentalTime <= 12.0) {
			basicPayment = Math.ceil(rentalTime) * pricePerHour;
		}else {
			basicPayment = Math.ceil(rentalTime/24) * pricePerDay;
		}
		
		carRental.setInvoice(new Invoice(basicPayment, taxService.tax(basicPayment)));
	}

}
