package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2); // double -> Double
		conjunto.add(true);
		conjunto.add("este");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamho é: " + conjunto.size());
		
		conjunto.add("teste");
		System.out.println("Tamho é: " + conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		System.out.println("Tamho é: " + conjunto.size());
		
		System.out.println(conjunto.remove('x'));
		if(conjunto.contains('x')){
			System.out.println("Tem no conjunto");
		}else {
			System.out.println("Não tem no conjunto");
		}
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//conjunto.addAll(nums);
		conjunto.retainAll(nums);
		
		System.out.println(conjunto);
		
	}
}
