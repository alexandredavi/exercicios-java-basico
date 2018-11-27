package br.com.jcavi.exercicios;

import javax.swing.JOptionPane;

public class Exercicio4 {
	public static void main(String[] args) {
		Integer numeroDePessoas = Integer.parseInt(JOptionPane.showInputDialog("Numero de pessoas:"));
		System.out.println("Quantidade de carne:" + (numeroDePessoas *  350) + "g");
		System.out.println("Quantidade de linguiça:" + (numeroDePessoas * 100) + "g");
		System.out.println("Quantidade de cerveja:" + (numeroDePessoas * 2) + "L");
		System.out.println("Quantidade de refrigerante:" + (numeroDePessoas * 200) + "ml");
	}
}
