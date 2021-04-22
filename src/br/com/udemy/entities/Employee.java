package br.com.udemy.entities;

public class Employee {

	// Atributos	
	private String name;
	private Integer hours;
	private Double valuePerHour;
	
	// Construtores
	public Employee(String name, Integer hours, Double valuePerHour) {
		this.name = name;
		this.hours = hours;
		this.valuePerHour = valuePerHour;
	}
	public Employee() {}
	
	// Métodos Gets e Sets
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getHours() {
		return hours;
	}
	public void setHours(Integer hours) {
		this.hours = hours;
	}
	public Double getValuePerHour() {
		return valuePerHour;
	}
	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}	
	
	// Outros métodos
	public Double payment() {
		return this.hours * this.valuePerHour;
	}
	
	// Método String
	public String toString() {
		return "Funcionário: " + this.name + " Valor R$: " + this.payment();
	}
	
}
