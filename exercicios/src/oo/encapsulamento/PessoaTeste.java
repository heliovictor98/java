package oo.encapsulamento;

public class PessoaTeste {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("Pessoa",110);
		
		p1.alterarIdade(230); // alterar
		
		System.out.println(p1.getIdade());// ler
		System.out.println(p1);// toString
	}
}
