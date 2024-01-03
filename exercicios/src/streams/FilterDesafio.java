package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterDesafio {
	
	public static void main(String[] args) {
		
		AlunoDesafio a1 = new AlunoDesafio("Jonas", 7, "Masculino");
		AlunoDesafio a2 = new AlunoDesafio("Lucas", 6, "Masculino");
		AlunoDesafio a3 = new AlunoDesafio("Ana", 6, "Feminino");
		AlunoDesafio a4 = new AlunoDesafio("Bia", 5, "Feminino");
		
		List<AlunoDesafio> alunos = Arrays.asList(a1,a2,a3,a4);
		
		Predicate<AlunoDesafio> aprovado = a -> a.nota >= 6;
		Predicate<AlunoDesafio> sexoMasculino = a -> a.sexo.equalsIgnoreCase("Masculino");
		
		Function<AlunoDesafio, String> saudacao = a -> "Parabéns " + a.nome;
		
		alunos.stream()
			.filter(aprovado)
			.filter(sexoMasculino)
			.map(saudacao)
			.forEach(System.out::println);
	}
}
