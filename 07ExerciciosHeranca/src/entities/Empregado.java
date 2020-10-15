package entities;

public class Empregado {
	
	private String nome;
	private Integer hours;
	private Double valorPorHora;
	
	
	public Empregado(String nome, Integer hours, Double valorPorHora) {
		this.nome = nome;
		this.hours = hours;
		this.valorPorHora = valorPorHora;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getHours() {
		return hours;
	}


	public void setHours(Integer hours) {
		this.hours = hours;
	}


	public Double getValorPorHora() {
		return valorPorHora;
	}


	public void setValorPorHora(Double valorPorHora) {
		this.valorPorHora = valorPorHora;
	}
	
	public Double pagamento() {
		return hours*valorPorHora;
	}
	
	public String toString() {
		StringBuilder  sb = new StringBuilder();
		sb.append(nome);
		sb.append(" - $");
		sb.append(pagamento());
		
		return sb.toString();
	}
}
