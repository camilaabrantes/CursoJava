package entities;

public final class BusinessAccount extends Account{
	
	private Double loanLimit;

	
	/*
	public BusinessAccount() {
		super();
	}
	*/


	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}


	public Double getLoanLimit() {
		return loanLimit;
	}


	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double loan) {
		balance += loan - 10;
	}

}
