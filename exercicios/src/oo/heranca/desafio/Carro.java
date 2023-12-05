package oo.heranca.desafio;

public class Carro {
	final int VELOCIDADE_MAXIMA;
	public int velocidadeAtual;
	int delta = 5;
	
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	public void acelerar() {
		if(velocidadeAtual + delta > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		}else {
			velocidadeAtual += delta;
		}
	}
	
	public void freiar() {
		
		if(velocidadeAtual == 0) {
			velocidadeAtual = 0;
		} else {
			velocidadeAtual -= 5;
		}
		
		
	}
}
