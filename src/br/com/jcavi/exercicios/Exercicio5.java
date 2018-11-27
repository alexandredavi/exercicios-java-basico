package br.com.jcavi.exercicios;

import javax.swing.JOptionPane;

public class Exercicio5 {
	public static void main(String[] args) {
		Double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe seu salario:"));
		
		int menu = 0;
		while (menu != 9) {
			menu = Integer.parseInt(JOptionPane.showInputDialog("Deigite o menu: \n 1 - Pagar conta \n 2 - Saldo \n 9 - Sair"));
			if (menu == 1) {
				Double valorConta = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da conta:"));
				salario -= valorConta;
			} else if (menu == 2) {
				JOptionPane.showMessageDialog(null, "Saldo em conta: " + salario);
			} else if (menu != 9) {
				JOptionPane.showMessageDialog(null, "Opção invalida!");
			}
		}
	}
}
