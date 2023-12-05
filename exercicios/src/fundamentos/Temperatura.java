package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		// (F - 32) x 5/9 = C
		
		final double ajuste = 32;
		final double fator = 5.0/9.0;
		
		double f = 86;
		//double c;
		
		double resultado = (f - ajuste) * fator;
		
		System.out.println(resultado);
	}
}
