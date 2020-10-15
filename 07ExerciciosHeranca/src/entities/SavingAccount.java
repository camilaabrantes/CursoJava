package entities;

public final class SavingAccount extends Account{
	
	private Double taxa;

	public SavingAccount(Integer number, String holder, Double balance, Double taxa) {
		super(number, holder, balance);
		this.taxa = taxa;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}
	
	public void updateBalance() {
		balance *= (1 + taxa/100);
	}
	
	@Override
	public void saque(Double amount) {
		balance -= amount;
	}

}
