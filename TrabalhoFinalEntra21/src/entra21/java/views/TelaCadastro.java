package entra21.java.views;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

import entra21.java.interfaces.IMethods;

public class TelaCadastro implements IMethods {
	private JFrame fTelaCadastro;
	private JLabel lNome, lIdade, lRaca, lApelido, lPreco, lDescricao;
	private JTextField tNome, tIdade, tApelido, tPreco;
	private JComboBox<String> cRaca;
	private JRadioButton rVivo, rMorto, rRacao, rAlmocoJanta;
	private JCheckBox cbAdestrado, cbCastrado, cbVacinado, cbPedigree;
	private JTextArea taDescricao;
	private JScrollPane spDescricao;
	private JButton bSalva, bCancela;
	private ButtonGroup bgJRadioGroupStatus, bgJRadioGroupAlimento;
	
	private int txtLargeX = 375, txtLargeY = 26, txtMediumX = 200, 
		txtMediumY = 26, lblNormalX = 90,lblNormalY = 20, cbNormalY = 25, 
			lblMediumX = 120, lblLargeX = 160, areaLargeX = 622, 
			areaLargeY = 105, btnLargeX = 150, btnLargeY = 70;
	
	public TelaCadastro() {
		geraTela();
		instanciaComponentes();
		defineTamanho();
		definePosicao();
		adicionaComponentes();
		configuraScrollPane();
		pressionaBotao();
		grupoJRadioButtonSaude();
		grupoJRadioButtonComida();
		
		fTelaCadastro.setVisible(true);
	}
	
	public void geraTela() {
		fTelaCadastro = new JFrame();
		fTelaCadastro.setSize(650, 460);
		fTelaCadastro.setResizable(false);
		fTelaCadastro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fTelaCadastro.setLocationRelativeTo(null);
		fTelaCadastro.setLayout(null);
	}
	
	public void adicionaComponentes() {
		fTelaCadastro.add(lNome);
		fTelaCadastro.add(tNome);
		fTelaCadastro.add(lIdade);
		fTelaCadastro.add(tIdade);
		fTelaCadastro.add(lRaca);
		fTelaCadastro.add(cRaca);
		fTelaCadastro.add(lApelido);
		fTelaCadastro.add(tApelido);
		fTelaCadastro.add(lPreco);
		fTelaCadastro.add(tPreco);
		fTelaCadastro.add(rVivo);
		fTelaCadastro.add(rMorto);
		fTelaCadastro.add(rRacao);
		fTelaCadastro.add(rAlmocoJanta);
		fTelaCadastro.add(cbAdestrado);
		fTelaCadastro.add(cbCastrado);
		fTelaCadastro.add(cbVacinado);
		fTelaCadastro.add(cbPedigree);
		fTelaCadastro.add(lDescricao);
		fTelaCadastro.add(spDescricao);
		fTelaCadastro.add(bSalva);
		fTelaCadastro.add(bCancela);
		
		insereItemsComboBoxRaca();
	}
	
	public void defineTamanho() {
		lNome.setSize(lblNormalX, lblNormalY);
		tNome.setSize(txtLargeX, txtLargeY);
		lIdade.setSize(lblNormalX, lblNormalY);
		tIdade.setSize(txtMediumX, txtMediumY);
		lRaca.setSize(lblNormalX, lblNormalY);
		cRaca.setSize(lblLargeX, cbNormalY);
		lApelido.setSize(lblNormalX, lblNormalY);
		tApelido.setSize(txtMediumX, txtMediumY);
		lPreco.setSize(lblNormalX, lblNormalY);
		tPreco.setSize(txtMediumX, txtMediumY);
		rVivo.setSize(lblNormalX, lblNormalY);
		rMorto.setSize(lblNormalX, lblNormalY);
		rRacao.setSize(lblNormalX, lblNormalY);
		rAlmocoJanta.setSize(lblLargeX, lblNormalY);
		cbAdestrado.setSize(lblNormalX, lblNormalY);
		cbCastrado.setSize(lblNormalX, lblNormalY);
		cbVacinado.setSize(lblNormalX, lblNormalY);
		cbPedigree.setSize(lblMediumX, lblNormalY);
		lDescricao.setSize(lblNormalX, lblNormalY);
		spDescricao.setSize(areaLargeX, areaLargeY);
		bSalva.setSize(btnLargeX, btnLargeY);
		bCancela.setSize(btnLargeX, btnLargeY);
	}

	public void definePosicao() {
		lNome.setLocation(10, 10);
		tNome.setLocation(10, 35);
		lIdade.setLocation(430, 10);
		tIdade.setLocation(430, 35);
		lRaca.setLocation(10, 65);
		cRaca.setLocation(10, 90);
		lApelido.setLocation(185, 65);
		tApelido.setLocation(185, 90);
		lPreco.setLocation(430, 65);
		tPreco.setLocation(430, 90);
		rVivo.setLocation(10, 135);
		rMorto.setLocation(10, 165);
		rRacao.setLocation(105, 135);
		rAlmocoJanta.setLocation(105, 165);
		cbAdestrado.setLocation(355, 135);
		cbCastrado.setLocation(490, 135);
		cbVacinado.setLocation(355, 165);
		cbPedigree.setLocation(490, 165);
		lDescricao.setLocation(10, 200);
		spDescricao.setLocation(10, 230);
		bSalva.setLocation(480, 350);
		bCancela.setLocation(320, 350);
	}
	
	public void instanciaComponentes() {
		lNome = new JLabel("Nome Completo");
		tNome = new JTextField();
		lIdade = new JLabel("Idade");
		tIdade = new JTextField();
		lRaca = new JLabel("Raça");
		cRaca = new JComboBox<>();
		lApelido = new JLabel("Apelido");
		tApelido = new JTextField();
		lPreco = new JLabel("Preço");
		tPreco = new JTextField();
		rVivo = new JRadioButton("Vivo");
		rMorto = new JRadioButton("Morto");
		rRacao = new JRadioButton("Ração");
		rAlmocoJanta = new JRadioButton("Come almoços, jantas");
		cbAdestrado = new JCheckBox("Adestrado");
		cbCastrado = new JCheckBox("Castrado");
		cbVacinado = new JCheckBox("Vacinado");
		cbPedigree = new JCheckBox("Tem Pedigree");
		lDescricao = new JLabel("Descrição");
		taDescricao = new JTextArea();
		spDescricao = new JScrollPane();
		spDescricao.setViewportView(taDescricao);
		bSalva = new JButton("Salva");
		bCancela = new JButton("Cancela");
		bgJRadioGroupStatus = new ButtonGroup();
		bgJRadioGroupAlimento = new ButtonGroup();
	}
	
	private void configuraScrollPane() {
		spDescricao.setViewportView(taDescricao);
		spDescricao.setHorizontalScrollBarPolicy(
			JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		spDescricao.setVerticalScrollBarPolicy(
			JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
		taDescricao.setLineWrap(true);
	}
	
	private void insereItemsComboBoxRaca() {
		String[] racas = new String[] {
			"Akita", "Pastor Alemão", "Beagle", "Boxer", "Pinsher",
			"Buldog", "Pug", "Husky Siberiano", "Chihuahua",
			"Chow Chow", "Collie", "Dálmata", "Doberman", 
			"Golden Retriever", "Labrador", "Poodle", "Pastor Alemão",
			"Rottweiler", "Shih Tzu"
		};
		
		for (int i = 0; i < racas.length; i++) {
			cRaca.addItem(racas[i]);
		}
	}
	
	private void grupoJRadioButtonSaude() {
		bgJRadioGroupStatus.add(rVivo);
		bgJRadioGroupStatus.add(rMorto);
	}
	
	private void grupoJRadioButtonComida() {
		bgJRadioGroupAlimento.add(rRacao);
		bgJRadioGroupAlimento.add(rAlmocoJanta);
	}
	
	private void limparCheckBox() {
		cbAdestrado.setSelected(false);
		cbVacinado.setSelected(false);
		cbCastrado.setSelected(false);
		cbPedigree.setSelected(false);
	}
	
	private void limparTextField() {
		tNome.setText(null);
		tIdade.setText(null);
		tApelido.setText(null);
		tPreco.setText(null);
	}
	
	private void limparComboBox() {
		cRaca.setSelectedIndex(0);
	}
	
	private void limparTextArea() {
		taDescricao.setText(null);
	}
	
	private void armazenaConteudos() {
		JOptionPane.showMessageDialog(null, "Dados salvos com sucesso!");
		
		String opcaoSaude = "", opcaoAlimento = "", administracao = "";
		
		String imprime = "[ FICHA DE ANIMAL ]\n\n";
		
		imprime += "Nome: " + tNome.getText() + "\n";
		imprime += "Idade: " + tIdade.getText() + "\n";
		imprime += "Raça: " + cRaca.getSelectedItem() + "\n";
		imprime += "Apelido (opcional):" + tApelido.getText() + "\n";
		imprime += "Preço: R$" + tPreco.getText() + "\n";
		
		if (rVivo.isSelected()) {
			opcaoSaude = rVivo.getText();
		} else {
			opcaoSaude = rMorto.getText();
		}
		
		imprime += "Status: " + opcaoSaude + "\n";
		
		if (rRacao.isSelected()) {
			opcaoAlimento = rRacao.getText();
		} else {
			opcaoAlimento = rAlmocoJanta.getText();
		}
		
		imprime += "Alimentação: " + opcaoAlimento + "\n";
		
		if (cbAdestrado.isSelected() || cbCastrado.isSelected() ||
			cbVacinado.isSelected() || cbPedigree.isSelected()) {
			
			if (cbAdestrado.isSelected()) {
				administracao += "[x] " + cbAdestrado.getText() + "\n";
			}
			if (cbVacinado.isSelected()) {
				administracao += "[x] " + cbAdestrado.getText() + "\n";
			}
			if (cbCastrado.isSelected()) {
				administracao += "[x] " + cbCastrado.getText() + "\n";
			}
			if (cbPedigree.isSelected()) {
				administracao += "[x] " + cbPedigree.getText() + "\n";
			}
		} else {
			administracao += "[ Nenhum ]\n";
		}
		
		imprime += "Cuidados Clinicos:\n" + administracao + "\n";
		imprime += "Descrição:\n- " + taDescricao.getText();
		
		JOptionPane.showMessageDialog(null, imprime);
	}
	
	private boolean verificaCamposObrigatorios() {
		boolean valida = false;
		
		if (rVivo.isSelected() || rMorto.isSelected()) {
			if (rRacao.isSelected() || rAlmocoJanta.isSelected()) {
				valida = true;
			} else {
				JOptionPane.showMessageDialog(null,
					"Por favor, selecione entre \"Ração\" ou " + 
					"\"Come almoços, jantas\"", "Aviso",
					JOptionPane.WARNING_MESSAGE);
			}
		} else {
			JOptionPane.showMessageDialog(null,
				"Por favor, selecione entre \"Morto\" ou \"Vivo\"", "Aviso",
				JOptionPane.WARNING_MESSAGE);
		}
		return valida;
	}

	private void pressionaBotao() {
		bSalva.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (verificaCamposObrigatorios()) {
					armazenaConteudos();
				}
			}
		});
		
		bCancela.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int confirma = JOptionPane.showConfirmDialog(null,
					"Limpar todos os campos?", "Aviso", JOptionPane.YES_NO_OPTION);
				
				if (confirma == JOptionPane.YES_OPTION) {
					bgJRadioGroupStatus.clearSelection();
					bgJRadioGroupAlimento.clearSelection();
					limparCheckBox();
					limparTextField();
					limparComboBox();
					limparTextArea();
				}
			}
		});
	}
}
