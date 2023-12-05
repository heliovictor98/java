package oo.encapsulamento;

public class Pessoa {
	
	 private String nome;
     public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	private int idade;
     
     public Pessoa(String nome,int idade) {
    	 setIdade(idade);
    	 setNome(nome);
     }
     
     public int getIdade() {
    	 return idade;
     }
     
     public void alterarIdade(int novaIdade) {
    	 if(novaIdade >= 0 && novaIdade <= 120) {    		 
    		 this.idade = novaIdade;
    	 }
     }
     
     @Override
    public String toString() {
    	return "Ola eu sou o " + getNome() + " tenho " + getIdade() +" anos.";
    }
}	
