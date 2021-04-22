package br.com.udemy.entities;

public class OutsourceEmployee extends Employee{

	// Atributos
	private Double additionalChange;

	// Contrutores
	public OutsourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalChange) {
		super(name, hours, valuePerHour);
		this.additionalChange = additionalChange;
	}

	public OutsourceEmployee() {}

	// Métodos Getteres e Setteres
	public Double getAdditionalChange() {
		return additionalChange;
	}

	public void setAdditionalChange(Double additionalChange) {
		this.additionalChange = additionalChange;
	}
	
	// Método Sobre Escrito
	@Override
	public Double payment() {
		return super.payment() + (1.1 * this.additionalChange);
	}
	
	@Override
	public String toString() {
		super.toString();
		return "Funcionário: " + this.getName() + " Valor R$: " + this.payment();
	}
	
	
	
}
