package entities.enuns;

public enum WorkerLevel {
	//entrada do objeto tipo enum pode ser a string com nome igual ao enum atravez da função WorkerLevel.valueOf("JUNIOR")
	//ou pode apenas fazer WorkerLevel.JUNIOR, que o retorn do metodo getNivel será o numero associado ao enum
	JUNIOR(1),
	MID_LEVEL(2),
	SENIOR(3);
	
	private int nivel;

	private WorkerLevel(int nivel) {
		this.nivel = nivel;
	}
	
	public int getNivel() {
		return nivel;
	}
	
}
