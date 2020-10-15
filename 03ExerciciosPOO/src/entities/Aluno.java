package entities;

public class Aluno {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double media() {
		return nota1 + nota2 + nota3;
	}
	
	public String result() {
		if(media()>=60) {
			return "PASS";
		}else {
			return "FAILED \n" + "MISSING " + Double.toString(60-media()) +" POINTS";
		}
	}

}
