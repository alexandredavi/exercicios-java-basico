package br.com.jcavi.exercicios;

import javax.swing.JOptionPane;

public class Exercicio3 {
	public static void main(String[] args) {
		String nomeProduto1 = JOptionPane.showInputDialog("nome 1");
		Double valorProduto1 = Double.parseDouble(JOptionPane.showInputDialog("valor 1"));
		String nomeProduto2 = JOptionPane.showInputDialog("nome 2");
		Double valorProduto2 = Double.parseDouble(JOptionPane.showInputDialog("valor 2"));
		String nomeProduto3 = JOptionPane.showInputDialog("nome 3");
		Double valorProduto3 = Double.parseDouble(JOptionPane.showInputDialog("valor 3"));
		
		System.out.println("Nome: " + nomeProduto1 + " valor: " + valorProduto1);
		System.out.println("Nome: " + nomeProduto2 + " valor: " + valorProduto2);
		System.out.println("Nome: " + nomeProduto3 + " valor: " + valorProduto3);
		
		Double soma = valorProduto1 + valorProduto2 + valorProduto3;
		System.out.println("Valor total sem desconto: " + soma);
		if (soma >= 150) {
			soma -= (soma * 0.10);
		}
		System.out.println("Valor total com desconto: " + soma);
		
	}

}
