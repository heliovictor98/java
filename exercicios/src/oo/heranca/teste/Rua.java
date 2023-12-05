package oo.heranca.teste;

import oo.heranca.desafio.Civic;
import oo.heranca.desafio.Ferrari;

public class Rua {
	
	public static void main(String[] args) {
		
		Civic civic = new Civic();
		Ferrari ferrari = new Ferrari(400);
		
		System.out.println("Velociadade do Cdsivic: " + civic.velocidadeAtual);

		civic.acelerar();
		civic.acelerar();
		System.out.println("Velociadade do Civic: " + civic.velocidadeAtual);
	
		System.out.println("Velociadade do Ferrari: " + ferrari.velocidadeAtual);
		
		ferrari.ligarTurbo();
		ferrari.acelerar();
		ferrari.acelerar();
		ferrari.acelerar();
		
		System.out.println("Velociadade do Ferrari: " + ferrari.velocidadeAtual);
		
	}
}
