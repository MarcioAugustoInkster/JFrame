package entra21.java.instalacao;

import java.awt.EventQueue;
import entra21.java.views.TelaCadastro;

public class ExecutaPrincipal {
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			
			public void run() {
				new TelaCadastro();
			}
		});
	}
}
