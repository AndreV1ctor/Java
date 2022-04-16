package leitura_valores;

import java.util.Scanner;

public class leitura_valores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		int numero, numero2 = 10;
		System.out.print("Digite \n um \t numero");
		numero = ler.nextInt();
		System.out.println("Você digitou \n o numero = " + numero + " Bem vindo");
		System.out.printf("Você digitou %d %d", numero, numero2);
	}

}
