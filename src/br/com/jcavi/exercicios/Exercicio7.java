package br.com.jcavi.exercicios;

import javax.swing.JOptionPane;

public class Exercicio7 {
	public static void main(String[] args) {
		int quantidade = 0;
		for (int i = 0; i < 10; i++) {
			Integer idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
			if (idade >= 18) {
				quantidade++;
			}
		}
		System.out.println("Quantidade de pessoas com idade maior ou igual a 18 anos: " + quantidade);
	}
}
