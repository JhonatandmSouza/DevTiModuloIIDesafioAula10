package principal;

import javax.swing.JOptionPane;

import classes.Usuario;

public class Principal {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Digite os dados para realizar seu cadastro.");
		String nome = JOptionPane.showInputDialog("Informe seu nome");
		
		String email = JOptionPane.showInputDialog("Informe seu email");
		while (!Usuario.validaEmail(email)) {
			
			email = JOptionPane.showInputDialog("E-mail inválido! Tente novamente!");
			
		}
		
		String login = JOptionPane.showInputDialog("Crie um login para acessar sua conta");
		String senha = JOptionPane.showInputDialog("Crie uma senha para acessar sua conta");
		Usuario user1 = new Usuario(nome, login, senha, email);
		
		JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso. \nInforme seu login e senha para acessar sua conta.");
		
		String loginAcesso = JOptionPane.showInputDialog("Login:");
		String senhaAcesso = JOptionPane.showInputDialog("Senha:");
		Usuario user2 = new Usuario(loginAcesso, senhaAcesso);
		
		while (!user2.equals(user1)) {
			JOptionPane.showMessageDialog(null, "Login ou senha inválidos. Tente novamente");
			user2.setLogin(JOptionPane.showInputDialog("Login:"));
			user2.setSenha(JOptionPane.showInputDialog("Senha:"));
		}
		
		JOptionPane.showMessageDialog(null, "Login efetuado com sucesso!!!");

	}

}
