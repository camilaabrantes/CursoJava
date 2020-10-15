package entities;

public class Banco {
	private int numConta;
	private String titular;
	private double saldo;
	
	
	
	public Banco(int numConta, String titular) {
		this.numConta = numConta;
		this.titular = titular;
	}


	public Banco(int numConta, String titular, double depositoInicial) {
		this.numConta = numConta;
		this.titular = titular;
		Deposito(depositoInicial);
	}


	public int getNumConta() {
		return numConta;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public double getSaldo() {
		return saldo;
	}

	public void Deposito(double deposito) {
		saldo += deposito;
	}
	
	public void Saque(double saque) {
		saldo -= saque + 5.00;
	}
	
	public String toString() {
		return "Conta " + numConta + ", Titular: " + titular + ", Saldo: " + saldo;
	}

}
