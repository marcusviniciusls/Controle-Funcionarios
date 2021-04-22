package br.com.udemy.application;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.com.udemy.entities.Employee;
import br.com.udemy.entities.OutsourceEmployee;

public class Aplicattion {

	public static void main(String[] args) {
		
		// Inicio do programa
		JOptionPane.showMessageDialog(null, "Bem vindo ao programa para fazer controle de pagamentos de Funcion�rios");
		int qtdFuncionario = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de Funcionarios que ser� cadastrado"));
		List<Employee> em1 = new ArrayList<>();
		
		// Leitura dos funcionarios
		for(int i = 0; i < qtdFuncionario; i++) {
			JOptionPane.showMessageDialog(null, "Funcion�rio: " + (i+1));
			String opcaoString = JOptionPane.showInputDialog("Funcion�rio:\nC - Contratado\n T - Tercerizado");
			char opcao = opcaoString.charAt(0);
			
			if(opcao == 'T') {
				OutsourceEmployee oe1 = new OutsourceEmployee();
				oe1.setName(JOptionPane.showInputDialog("Digite o nome do Funcion�rio?"));
				oe1.setHours(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas?")));
				oe1.setValuePerHour(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora?")));
				oe1.setAdditionalChange(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor extra do tercerizado?")));
				em1.add(oe1);
			}
			else if(opcao == 'C') {
				Employee e1 = new Employee();
				e1.setName(JOptionPane.showInputDialog("Digite o nome do Funcion�rio?"));
				e1.setHours(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas?")));
				e1.setValuePerHour(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora?")));
				em1.add(e1);
			}
			else {
				JOptionPane.showMessageDialog(null, "Op��o inv�lida!");
			}
		}
		// Processamentos dos dados e exibi��o
		Double somaTotal = 0.0;
		for(Employee x : em1) {
			JOptionPane.showMessageDialog(null, x.toString());
			somaTotal += x.payment();
		}
		
		
		
		JOptionPane.showMessageDialog(null, "Valor Total: R$ " + somaTotal);

	}

}
