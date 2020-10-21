package entities;

import entities.exception.DomainException;

public class Account {
	
	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limiteSaque;
	
	
	public Account(Integer numero, String titular, Double saldo, Double limiteSaque) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}


	public Integer getNumero() {
		return numero;
	}


	public String getTitular() {
		return titular;
	}


	public void setTitular(String titular) {
		this.titular = titular;
	}


	public Double getSaldo() {
		return saldo;
	}


	public Double getLimiteSaque() {
		return limiteSaque;
	}


	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}
	
	public void deposito(Double amount) {
		saldo += amount;
	}
	
	public void saque(Double amount) {
		if(amount > limiteSaque)	{
			throw new DomainException("O valor de saque é maior que o limite de saque disponivel");
		}
		if(saldo < amount) {
			throw new DomainException("Saldo Insuficiente!");
		}
		saldo -= amount;
	}
	

}
