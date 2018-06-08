import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Questao7 {
	private static final int LISTA_TODOS = 1;
	private static final int MAIOR_NOME = 2;
	private static final int MENOR_NOME = 3;
	private static final int NOME_CONTEM_X = 4;
	private static final int NOME_CONTEM_Y = 5;
	private static final int LETRA_INICIAL_VOGAL = 6;
	private static final int ENCERRAR = 0;
	private static final String NOME_IGUAL_A = "Paulo";
	private static final String NOME_IGUAL_B = "Ana";
	
	private static ArrayList<String> nomes = new ArrayList<>();
	
	public static void main(String[] args) {
		nomes.add("Marcio"); // 1
		nomes.add("Ana"); // 2
		nomes.add("Daiana"); // 3
		nomes.add("Kaio"); // 4
		nomes.add("Alan"); // 5
		nomes.add("Matheus"); // 6
		nomes.add("Michele"); // 7
		nomes.add("Reinaldo"); // 8
		nomes.add("Alessandra"); // 9
		nomes.add("Charles"); // 10
		nomes.add("Paulo"); // 11
		nomes.add("Igor"); // 12
		nomes.add("Francisco"); // 13
		nomes.add("Oscar"); // 14
		nomes.add("Lucas"); // 15
		nomes.add("Vanessa"); // 16
		nomes.add("Joao"); // 17
		nomes.add("Paula"); // 18
		nomes.add("Jaqueline"); // 19
		nomes.add("Tacila"); // 20
		nomes.add("Elenir"); // 21
		nomes.add("Paulo"); // 22
		nomes.add("Fernando"); // 23
		nomes.add("Fustavo"); // 24
		nomes.add("Nereu"); // 25
		
		mostraMenu();
	}
	
	private static void mostraMenu() {
		boolean valida = false;
		
		while (!valida) {
			try {
				int menu = listaMenu();
				
				switch (menu) {
				case LISTA_TODOS:
					listaNomes();
					break;
				case MAIOR_NOME:
					maiorNome();
					break;
				case MENOR_NOME:
					menorNome();
					break;
				case NOME_CONTEM_X:
					nomeIgualA();
					break;
				case NOME_CONTEM_Y:
					nomeIgualB();
					break;
				case LETRA_INICIAL_VOGAL:
					iniciaVogal();
					break;
				case ENCERRAR:
					valida = true;
					break;
				default:
					JOptionPane.showMessageDialog(null, 
						"Opcao incorreta!", "Aviso", JOptionPane.WARNING_MESSAGE);
					break;
				}
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
				JOptionPane.showMessageDialog(null, 
					"Informe uma opcao do Menu, seu Bundão!", "Erro", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	private static int listaMenu() {
		int menu = Integer.parseInt(JOptionPane.showInputDialog(null, 
			"[ LISTA DE NOMES ]\n\n" 
			+ "[1] Listar Todos\n" 
			+ "[2] Maior Nome\n" 
			+ "[3] Menor Nome\n"
			+ "[4] Nomes que contem \"" + NOME_IGUAL_A + "\"\n"
			+ "[5] Nomes que contem \"" + NOME_IGUAL_B + "\"\n"
			+ "[6] Nomes com letra Inicial de uma Vogal\n"
			+ "[0] Encerrar"
		));
		
		return menu;
	}
	
	private static void listaNomes() {
		String listagem = "";
		int contador = 0;
		
		for (int i = 0; i < nomes.size(); i++) {
			listagem += "[" + i + "] " + nomes.get(i) + "\n";
			
			contador = contador + 1;
		}
		
		JOptionPane.showMessageDialog(null, "[ 1 - LISTA DE NOMES : " + contador + "]\n" + listagem);
	}
	
	private static void maiorNome() {
		int contaMaiorNome = 0;
		String maiorNome = "";

		for (int i = 0; i < nomes.size(); i++) {
			if (nomes.get(i).length() > contaMaiorNome) {
				contaMaiorNome = nomes.get(i).length();
				maiorNome = nomes.get(i);
			}
		}
		
		JOptionPane.showMessageDialog(null, "[ 2 - MAIOR NOME ]\n\nNome: " 
			+ maiorNome + "\nTamanho: " + contaMaiorNome + " letras");
	}
	
	private static void menorNome() {
		int contaMenorNome = nomes.get(0).length();
		String menorNome = "";
		
		for (int i = 0; i < nomes.size(); i++) {
			if (nomes.get(i).length() < contaMenorNome) {
				contaMenorNome = nomes.get(i).length();
				menorNome = nomes.get(i);
			}
		}
		
		JOptionPane.showMessageDialog(null, 
			"[ 3 - MENOR NOME ]\n\nNome: " + menorNome + "\nTamanho: " + contaMenorNome + " letras");
	}
	
	private static void nomeIgualA() {
		int contador = 0;
		String nomeIgual = "";
		
		for (int i = 0; i < nomes.size(); i++) {
			if (nomes.get(i).equalsIgnoreCase(NOME_IGUAL_A)) {
				contador = contador + 1;
				nomeIgual += nomes.get(i) + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, "[ 4 - Nomes com \"" + NOME_IGUAL_A + "\" ]\n"
			+ "Quantidade: " + contador + "\n\nNomes:\n" + nomeIgual);
	}
	
	private static void nomeIgualB() {
		int contador = 0;
		String nomeIgual = "";
		
		for (int i = 0; i < nomes.size(); i++) {
			if (nomes.get(i).equalsIgnoreCase(NOME_IGUAL_B)) {
				contador = contador + 1;
				nomeIgual += nomes.get(i) + "\n";
			}
		}
		JOptionPane.showMessageDialog(null, "[ 4 - Nomes com \"" + NOME_IGUAL_B + "\" ]\n"
			+ "Quantidade: " + contador + "\n\nNomes:\n" + nomeIgual);
	}
	
	private static void iniciaVogal() {
		String nomeComVogal = "";
		int contador = 0;
		
		for (int i = 0; i < nomes.size(); i++) {
			if (nomes.get(i).toLowerCase().charAt(0) == 'a' ||
				nomes.get(i).toLowerCase().charAt(0) == 'e' ||
				nomes.get(i).toLowerCase().charAt(0) == 'i' ||
				nomes.get(i).toLowerCase().charAt(0) == 'o' ||
				nomes.get(i).toLowerCase().charAt(0) == 'u') {
				
				nomeComVogal += nomes.get(i) + "\n";
				contador = contador + 1;
			}
		}
		JOptionPane.showMessageDialog(null, 
			"[ 5 - Inicial com Vogal ]\n\nQuantidade: " + contador + "\n\n" + nomeComVogal );
	}
}
