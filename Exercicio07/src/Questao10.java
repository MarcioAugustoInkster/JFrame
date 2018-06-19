import java.util.ArrayList;

public class Questao10 {
	public static void main(String[] args) {
		ArrayList<Integer> numerosA = new ArrayList<>();
		ArrayList<Integer> numerosB = new ArrayList<>();
		
		int tamanho = 7;
		
		numerosA.add(2);
		numerosA.add(4);
		numerosA.add(7);
		numerosA.add(8);
		numerosA.add(1);
		numerosA.add(3);
		numerosA.add(5);
		
		numerosB.add(3);
		numerosB.add(6);
		numerosB.add(5);
		numerosB.add(0);
		numerosB.add(7);
		numerosB.add(9);
		numerosB.add(2);
		
		for (int i = 0; i < numerosA.size(); i++) {
			for (int j = 0; j < numerosB.size(); j++) {
				if (numerosA.get(i).equals(numerosB.get(j))) {
					System.out.println(
						numerosA.get(i) + " contem no segundo Array = " 
						+ numerosB.get(j));
				}
			}
		}
	}
}
