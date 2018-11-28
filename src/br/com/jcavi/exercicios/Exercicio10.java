package br.com.jcavi.exercicios;

import javax.swing.JOptionPane;

public class Exercicio10 {
	
	public static void main(String[] args) {
		Double valorAVista = 0.0;
		Double valorAPrazo = 0.0;
		
		for (int i = 0; i < 15; i++) {
			String codigo = JOptionPane.showInputDialog("Digite o codigo:");
			Double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor:"));
			if ("V".equals(codigo)) {
				valorAVista += valor;
			} else {
				valorAPrazo += valor;
			}
		}
		System.out.println("Total de compras a vista: " + valorAVista);
		System.out.println("Total de compras a prazo: " + valorAPrazo);
		System.out.println("Total das compras: " + (valorAPrazo + valorAVista));
		System.out.println("Valor primeira parcela: " + (valorAPrazo / 3));
	}

}
