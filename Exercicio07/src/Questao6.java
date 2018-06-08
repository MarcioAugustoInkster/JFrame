import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Questao6 {
	public static void main(String[] args) {
		ArrayList<Integer> numeros = new ArrayList<>();
		
		boolean valida = false;
		int atual = 0, quantidade = 15;
		String imprime = "";
		
		while (!valida) {
			try {
				for (int i = 0; i < quantidade; i++) {
					if (numeros.size() == quantidade) {
						valida = true;
						break;
					}
					
					atual = numeros.size();
					
					numeros.add(Integer.parseInt(JOptionPane.showInputDialog(null, 
						"Informe o " + (atual + 1) + "º Numero:\n(" + atual + "/" + quantidade + ")")));
					
					imprime += "[" + atual + "] " + numeros.get(atual) + "\n";
				}
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
				JOptionPane.showMessageDialog(null, 
					"Valor informado nao eh Numero inteiro.", "Erro", JOptionPane.ERROR_MESSAGE);
			}
		}
		
		JOptionPane.showMessageDialog(null, "[ LISTA DE 15 NUMEROS ]\n" + imprime);
	}
}
