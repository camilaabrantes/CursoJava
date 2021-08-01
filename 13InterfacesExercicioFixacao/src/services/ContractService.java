package services;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installment;

public class ContractService {

	OnlinePaymentServices onlinePaymentServices;
	Contract contract;
		
	public ContractService(Contract contract, OnlinePaymentServices onlinePaymentServices) {
		this.contract = contract;
		this.onlinePaymentServices = onlinePaymentServices;
	}

	public void processContract(Integer months) {
		Date[] dueDate = new Date[months];
		Calendar cal = Calendar.getInstance();
		cal.setTime(contract.getDate());
		Double parcelaInicial = (Double) contract.getTotalValue()/months;
		
		for(int i=1; i<=months; i++) {
			cal.add(Calendar.MONTH , 1);
			dueDate[i-1] = cal.getTime();
			Double parcelaInterest = onlinePaymentServices.interest(parcelaInicial, i);
			Double parcelaTotalMes = onlinePaymentServices.paymentFee(parcelaInterest);
			contract.addInstallments(new Installment(dueDate[i-1],parcelaTotalMes));
		}
		
		contract.printInstallments();
	}

}
