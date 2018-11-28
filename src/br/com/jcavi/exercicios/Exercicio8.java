package br.com.jcavi.exercicios;

import javax.swing.JOptionPane;

public class Exercicio8 {
	
	public static void main(String[] args) {
		Double quantidadeFaixa1 = 0d;
		Double quantidadeFaixa2 = 0d;
		Double quantidadeFaixa3 = 0d;
		Double quantidadeFaixa4 = 0d;
		Double quantidadeFaixa5 = 0d;
		
		for (int i = 0; i < 15; i++) {
			Integer idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade:"));
			if (idade <= 15) {
				quantidadeFaixa1++;
			} else if (idade <= 30) {
				quantidadeFaixa2++;
			} else if (idade <= 45) {
				quantidadeFaixa3++;
			} else if (idade <= 60) {
				quantidadeFaixa4++;
			} else {
				quantidadeFaixa5++;
			}
		}
		
		System.out.println("Quantidade de pessoas na faixa 1: " + quantidadeFaixa1);
		System.out.println("Quantidade de pessoas na faixa 2: " + quantidadeFaixa2);
		System.out.println("Quantidade de pessoas na faixa 3: " + quantidadeFaixa3);
		System.out.println("Quantidade de pessoas na faixa 4: " + quantidadeFaixa4);
		System.out.println("Quantidade de pessoas na faixa 5: " + quantidadeFaixa5);
		
		System.out.println("Percentual na primeira faixa: " + ((quantidadeFaixa1 / 15) * 100));
		System.out.println("Percentual na ultima faixa: " + ((quantidadeFaixa5 / 15) * 100));
	}

}
