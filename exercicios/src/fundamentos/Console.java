package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		//System.out.print("Bom");
		//System.out.print("dia!");
	
		Scanner estrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = estrada.nextLine();
		
		System.out.print("Digite o seu Sobrenome: ");
		String sobrenome = estrada.nextLine();
		
		System.out.print("Digite o seu Idade: ");
		int idade = estrada.nextInt();
		
		System.out.printf("%s %s tem %d anos.%n",
				nome, sobrenome, idade);
		
		estrada.close();
	}
}
