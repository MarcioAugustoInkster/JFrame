import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Questao5 {
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		
		for (int i = 0; i < 4; i++) {
			nomes.add(JOptionPane.showInputDialog(null, 
				"Digite o " + (i + 1) + "º Nome:"));
		}
		
		
	}
}
