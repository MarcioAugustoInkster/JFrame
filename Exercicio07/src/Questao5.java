import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Questao5 {
	public static void main(String[] args) {
		ArrayList<String> nomes = new ArrayList<>();
		
		for (int i = 0; i < 4; i++) {
			nomes.add(JOptionPane.showInputDialog(null, 
				"Informe o " + (i + 1) + "º Nome:"));
		}
		
		String busca = JOptionPane.showInputDialog(null, 
			"Informe um Nome para busca:");
		
		boolean encontrou = false;
		
		System.out.println("[ Lista de Nomes ]");
		
		for (int i = 0; i < nomes.size(); i++) {
			System.out.println("[" + i + "] " + nomes.get(i));
			
			if (nomes.get(i).equalsIgnoreCase(busca)) {
				encontrou = true;
			}
		}
		
		if (encontrou) {
			JOptionPane.showMessageDialog(null, "Nome \"" + busca 
				+ "\" existe na Lista.", "Informativo", JOptionPane.INFORMATION_MESSAGE);
		} else {
			JOptionPane.showMessageDialog(null, "Nome \"" + busca 
				+ "\" nao encontra-se na Lista.", "Aviso", JOptionPane.WARNING_MESSAGE);
		}
	}
}
