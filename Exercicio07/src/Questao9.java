import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Questao9 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		
		int tamanho = 5;
		
		for (int i = 0; i < tamanho; i++) {
			numeros.add(Integer.parseInt(
				JOptionPane.showInputDialog(null, "Entre o " 
					+ (i + 1) + "º Numero:")));
		}
		
		int primeiro = 0, ultimo = 0;
		
		for (int i = 0; i < numeros.size(); i++) {
			primeiro = numeros.get(0);
			ultimo = numeros.get(i);
		}
		
		if (primeiro == ultimo) {
			System.out.println("Pos [" + primeiro 
				+ "] eh igual a Pos [" + ultimo + "]");
		} else {
			System.out.println("Pos [1] = " + primeiro 
				+ " nao eh igual a Pos [" + numeros.size() 
				+ "] = " + ultimo);
		}
	}
}
