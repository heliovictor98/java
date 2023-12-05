package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.length());
		System.out.println(s.equalsIgnoreCase("Boa Tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		System.out.println("Nome: "+ nome + "\nSobrenome: " + sobrenome);
	}
}
