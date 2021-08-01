package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Integer number;
	private Date date;
	private Double totalValue;
	
	List<Installment> installments = new ArrayList<>();
	
	public Contract(Integer number, Date date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Integer getNumber() {
		return number;
	}

	public Date getDate() {
		return date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}
	
	public void addInstallments(Installment instalment) {
		installments.add(instalment);
	}
	
	public void removeInstallments(Installment instalment) {
		installments.remove(instalment);
	}
	
	public void printInstallments() {
		System.out.println("Installments: ");
		for(Installment i: installments) {			
			System.out.println(sdf.format(i.getDueDate()) + " - " + i.getAmount());
		}
	}
	
}
