package entities;

public final class EmpregadoTerceirizado extends Empregado{
	
	private  Double despesaAdicional;
	
	public EmpregadoTerceirizado(String nome, Integer hours, Double valorPorHora, Double despesaAdicional) {
		super(nome, hours, valorPorHora);
		this.despesaAdicional = despesaAdicional;
	}	
	
	@Override
	public final Double pagamento() {
		return super.pagamento() + (1.1 * despesaAdicional);
	}
	

}
