package br.com.jcavi.exercicios;

import javax.swing.JOptionPane;

public class Exercicio1 {
	public static void main(String[] args) {
		Double notaAluno = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota:"));
		if (notaAluno >= 7) {
			JOptionPane.showMessageDialog(null, "Aprovado com nota: " + notaAluno);
		} else if (notaAluno >= 5) {
			JOptionPane.showMessageDialog(null, "Recuperação com nota: " + notaAluno);
		} else {
			JOptionPane.showMessageDialog(null, "Reprovado com nota: " + notaAluno);
		}
	}
}
