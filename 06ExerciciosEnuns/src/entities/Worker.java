package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import entities.enuns.WorkerLevel;

public class Worker {
	
	private static Calendar cal = Calendar.getInstance();
	
	private String nome;
	private WorkerLevel level;
	private Double salarioBase;
	
	private Departamento departamento;
	private List<HourContract> contratos = new ArrayList<>();
	
	
	public Worker(String nome, WorkerLevel level, Double salarioBase, Departamento departamento) {
		this.nome = nome;
		this.level = level;
		this.salarioBase = salarioBase;
		this.departamento = departamento;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getLevel() {
		return level.getNivel();
	}


	public void setLevel(WorkerLevel level) {
		this.level = level;
	}


	public Double getSalarioBase() {
		return salarioBase;
	}


	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}


	public Departamento getDepartamento() {
		return departamento;
	}


	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}



	public List<HourContract> getContratos() {
		return contratos;
	}


	public void addContratos(HourContract contrato) {
		contratos.add(contrato);
	}
	
	public void removeContratos(HourContract contrato) {
		contratos.remove(contrato);
	}
	
	public Double income(Integer mes, Integer ano) {
		
		Double totalContratos = salarioBase;
		for(HourContract list: contratos) {
			cal.setTime(list.getDate());
			Date d = cal.getTime();
			int mesLista = 1 + cal.get(Calendar.MONTH);
			int anoLista = cal.get(Calendar.YEAR);
			if(mesLista == mes && anoLista == ano) {
				totalContratos += list.totalValue();
			}
		}
		
		return totalContratos;

	}

}
