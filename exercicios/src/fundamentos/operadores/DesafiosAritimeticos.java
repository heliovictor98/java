package fundamentos.operadores;

public class DesafiosAritimeticos {
	public static void main(String[] args) {
		
		int p1 = 6*(3+2); 
		int p2 = (int) Math.pow(p1 , 2);
		int p3 = 3 * 2;
		int p4 = p2 / p3;
		
		System.out.println(p4);
		
		int e1 = (1-5)*(2-7);
		int e2 = e1 /2;
		int e3 = (int) Math.pow(e2,2);
		
		System.out.println(e3);
		
		int r1 = p4 - e3;
		int r2 = (int) Math.pow(r1,3);
		int r3 = (int) Math.pow(10,3);
		int r4 = r2 / r3;
		
		System.out.println(r4);
	}
}
