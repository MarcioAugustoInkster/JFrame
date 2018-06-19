import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Questao8 {
	private static ArrayList<Double> salarios = new ArrayList<>();
	private static final int CADASTRA_SALARIO = 1;
	private static final int LISTA_SALARIO = 2;
	private static final int MEDIA_SALARIO = 3;
	private static final int SOMA_SALARIO = 4;
	private static final int SALARIO_POSICAO_PAR = 5;
	private static final int MEDIA_POSICAO_IMPAR = 6;
	private static final int QUANTIDADE_SALARIOS = 7;
	private static final int ENCERRA_APLICACAO = 0;
	
	public static void main(String[] args) {
		int mensagem = JOptionPane.showConfirmDialog(null, 
			"Inserir dados padrao no ArrayList?", "Informação", JOptionPane.YES_OPTION);
		
		if (mensagem == JOptionPane.YES_OPTION) {
			salarios.add(1400.00);
			salarios.add(1350.70);
			salarios.add(800.20);
			salarios.add(1500.60);
			salarios.add(1780.00);
			salarios.add(720.30);
			salarios.add(900.00);
			salarios.add(1200.50);
			salarios.add(1300.00);
			salarios.add(1800.80);
		}
		
		monstraMenu();
	}
	
	private static void monstraMenu() {
		boolean valida = false;
		
		while (!valida) {
			try {
				int menuSalario = menuOpcoes();
				
				switch (menuSalario) {
				case CADASTRA_SALARIO:
					cadastraSalario();
					break;
				case LISTA_SALARIO:
					listaSalario();
					break;
				case MEDIA_SALARIO:
					mediaSalario();
					break;
				case SOMA_SALARIO:
					totalSalario();
					break;
				case SALARIO_POSICAO_PAR:
					somaSalarioPosicaoPar();
					break;
				case MEDIA_POSICAO_IMPAR:
					mediaSalarioPosicaoImpar();
					break;
				case ENCERRA_APLICACAO:
					valida = true;
					break;
				default :
					JOptionPane.showMessageDialog(null, 
						"Informe uma opcao no Menu", "Aviso", JOptionPane.WARNING_MESSAGE);
					break;
				}
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
				JOptionPane.showMessageDialog(null, 
					"Ups, Opcao informado nao eh valido!", "Erro", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	private static int menuOpcoes() {
		int salario = Integer.parseInt(
			JOptionPane.showInputDialog(null, "[ LISTA 7 - EXERCICIO 8 ]\n\n"
				+ "[1] Cadastrar Salário\n"
				+ "[2] Listar todos Salários\n"
				+ "[3] Média de Salários\n"
				+ "[4] Total de Salários\n"
				+ "[5] Somatória das posições Pares\n"
				+ "[6] Média de Salários Impares\n"
				//+ "[7] Quantidade de Salários\n"
				+ "[0] Encerrar"
			));
		
		return salario;
	}
	
	private static void cadastraSalario() {
		boolean valida = false;
		int quantidade = 10, contador = 0;
		
		while (!valida) {
			try {
				for (int i = 0; i < quantidade; i++) {
					if (contador == quantidade) {
						valida = true;
						break;
					}
					
					salarios.add(Double.parseDouble(
						JOptionPane.showInputDialog(null, "[ 1 - CADASTRAR SALARIO ]\n\n"
							+ "Entre o " + (contador + 1) + "º Salario (R$):\n(" 
							+ contador + "/" + quantidade + ")")));
					
					contador = contador + 1;
				}
			} catch (Exception ex) {
				System.out.println(ex.getMessage());
				JOptionPane.showMessageDialog(null, 
					"Informe um valor de Salario (R$)!", "Erro", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	private static void listaSalario() {
		String listagem = "";
		System.out.println(salarios.size());
		
		if (salarios.size() != 0) {
			for (int i = 0; i < salarios.size(); i++) {
				listagem += salarios.get(i) + "\n";
			}
		} else {
			mensagemListaVazia();
		}
		if (salarios.size() != 0) {
			JOptionPane.showMessageDialog(null, "[ MENU 2 - LISTAR TODOS SALARIO ]\n"
				+ "Quantidade: " + salarios.size() + "\n\n" + listagem);
		}
	}
	
	private static void mediaSalario() {
		double soma = 0, media = 0;
		
		if (salarios.size() != 0) {
			for (int i = 0; i < salarios.size(); i++) {
				soma += salarios.get(i);
			}
			media = soma / salarios.size();
			
			JOptionPane.showMessageDialog(null, "[ 3 - MEDIA DE SALARIOS ]\n\nR$" + media);
		} else {
			mensagemListaVazia();
		}
	}
	
	private static void totalSalario() {
		int soma = 0;
		
		if (salarios.size() != 0) {
			for (int i = 0; i < salarios.size(); i++) {
				soma += salarios.get(i);
			}
			JOptionPane.showMessageDialog(null, "[ 4 - SOMA DOS SALARIOS ]\n\nR$" + soma);
		} else {
			mensagemListaVazia();
		}
	}
	
	private static void somaSalarioPosicaoPar() {
		int soma = 0;
		
		if (salarios.size() != 0) {
			for (int i = 0; i < salarios.size(); i++) {
				if (i % 2 == 0) {
					soma += salarios.get(i);
				}
			}
			JOptionPane.showMessageDialog(null, "[ 5 - SOMA DAS POSICOES PARES ]\n\nR$" + soma);
		} else {
			mensagemListaVazia();
		}
	}
	
	private static void mensagemListaVazia() {
		JOptionPane.showMessageDialog(null, 
			"Nenhum Salario encontrado na Lista!", "Aviso", JOptionPane.WARNING_MESSAGE);
	}
	
	private static void mediaSalarioPosicaoImpar() {
		int soma = 0;
		double media = 0;
		
		if (salarios.size() != 0) {
			for (int i = 0; i < salarios.size(); i++) {
				if (i % 2 == 1) {
					soma += salarios.get(i);
				}
			}
			media = soma / salarios.size();
			
			JOptionPane.showMessageDialog(null, 
				"[ 6 - MEDIA POSICAO IMPAR ]\n\nSoma: R$" + soma + "\nMedia: R$" + media);
		} else {
			mensagemListaVazia();
		}
	}
}
