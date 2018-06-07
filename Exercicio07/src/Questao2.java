import java.util.ArrayList;


public class Questao2 {
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add("Paulo");
		nomes.add("Kaio");
		nomes.add("Marcio");
		nomes.add("Ricardo");
		nomes.add("Ana");
		nomes.add("Daiana");
		nomes.add("Pedro");
		nomes.add("Matheus");
		nomes.add("Robson");
		
		System.out.println(
			nomes.get(0) + "\n" + nomes.get(1) + "\n"
			+ nomes.get(2) + "\n" + nomes.get(3) + "\n"
			+ nomes.get(4) + "\n" + nomes.get(5) + "\n"
			+ nomes.get(6) + "\n" + nomes.get(7) + "\n"
			+ nomes.get(8)
		);
	}
}
