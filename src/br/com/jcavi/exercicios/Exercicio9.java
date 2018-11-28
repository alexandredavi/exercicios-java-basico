package br.com.jcavi.exercicios;

import javax.swing.JOptionPane;

public class Exercicio9 {
	
	public static void main(String[] args) {
		Integer numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero:"));
		for (int i = 1; i <= 10; i++) {
			System.out.println(numero + " * " + i + " = " + numero * i);
		}
	}

}
