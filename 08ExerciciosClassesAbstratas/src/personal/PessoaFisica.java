package personal;

public final class PessoaFisica extends Personal{
	
	private Double gastosSaude;		

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}
	
	public Double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(Double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public final Double imposto() {
		if(rendaAnual < 20000.00) {
			return ((rendaAnual * 0.15) - (gastosSaude * 0.5));
		}else {
			return ((rendaAnual * 0.25) - (gastosSaude * 0.5));
		}
	}

}
