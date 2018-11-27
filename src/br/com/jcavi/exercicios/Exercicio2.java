package br.com.jcavi.exercicios;

import javax.swing.JOptionPane;

public class Exercicio2 {
	
	public static void main(String[] args) {
		String usuario = "user";
		String senha = "password";
		
		String usuarioDigitado = JOptionPane.showInputDialog("Digite o usuario:");
		String senhaDigitada = JOptionPane.showInputDialog("Digite a senha:");
		
		if (usuario.equals(usuarioDigitado) && senha.equals(senhaDigitada)) {
			JOptionPane.showMessageDialog(null, "Acesso autorizado!");
		} else {
			JOptionPane.showMessageDialog(null, "Acesso não autorizado!");
		}
	}

}
