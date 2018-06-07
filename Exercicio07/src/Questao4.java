import java.util.ArrayList;

public class Questao4 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(1); // 0
		numeros.add(2); // 1
		numeros.add(3); // 2
		numeros.add(4); // 3
		numeros.add(5); // 4
		numeros.add(6); // 5
		numeros.add(7); // 6
		numeros.add(8); // 7
		numeros.add(9); // 8
		numeros.add(10); // 9
		
		for (int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}
		
		numeros.remove(3);
		
		System.out.println("==== Remove [3] ====");
		for (int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}
		
		numeros.remove(4);
		
		System.out.println("==== Remove [4] ====");
		for (int i = 0; i < numeros.size(); i++) {
			System.out.println(numeros.get(i));
		}
	}
}
