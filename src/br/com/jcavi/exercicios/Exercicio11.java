package br.com.jcavi.exercicios;

import javax.swing.JOptionPane;

public class Exercicio11 {

	public static void main(String[] args) {
		int total = 0;
		for (int i = 0; i < 10; i++) {
			Integer numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
			if (numero >= 30 && numero <= 90) {
				total++;
			}
		}
		System.out.println("Total: " + total);
	}
}
