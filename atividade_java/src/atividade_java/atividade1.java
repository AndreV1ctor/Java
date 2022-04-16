package atividade_java;

import java.util.Scanner;

public class atividade1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nome_variavel;
		nome_variavel = 5;
		String nome = "Soul ON";
		
		int numero = 10;
		double number_ponto = 2.5;
		boolean status = false;
		
		int numero_usuario;
		Scanner leitura = new Scanner(System.in);
		System.out.println("Digite um numero");
		numero_usuario = leitura.nextInt();
		
		System.out.println("Você digito o numero" + numero_usuario);

		String nome_usuario, sobrenome;
		System.out.println("Digite seu nome");
		nome_usuario = leitura.nextLine();
		System.out.println("Digite seu Sobrenome");
		sobrenome = leitura.nextLine();
		
		System.out.println(" Seu nome completo é" + nome_usuario + " " + sobrenome);
	
	
	}

}
