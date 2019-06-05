package graphics;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")

public class JPBotoes extends JPanel{
	
	JPanel painelComandos;
	
	JLabel jlbIndividuosRestante;
	JLabel jlbIndividuoRestanteValor;
	
	JButton jbExecutar;
	JButton jbReiniciar;
	JButton jbSair;
	JButton jbConfig;
	
	JPBotoes(){
		painelComandos = new JPanel();
		
		jlbIndividuosRestante = new JLabel("Individuo executado: ");
		jlbIndividuosRestante.setVisible(false);

		jlbIndividuoRestanteValor = new JLabel("  ");
		jlbIndividuoRestanteValor.setBackground(Color.GRAY);
		jlbIndividuoRestanteValor.setVisible(false);

		jbExecutar = new JButton ("Executar");
		jbExecutar.setToolTipText("Executar regras do Josephus");
	//	jbExecutar.addActionListener(this);

		jbReiniciar  = new JButton ("Reiniciar");
		jbReiniciar.setToolTipText("Reiniciar Josephus com os mesmos valores");
	//	jbReiniciar.addActionListener(this);
		jbReiniciar.setEnabled(false);

		jbSair = new JButton ("Sair");
		jbSair.setToolTipText("Termina programa");
	//	jbSair.addActionListener(this);

		jbConfig = new JButton ("Config");
		jbConfig.setToolTipText("Ativa configuracoes");
	//	jbConfig.addActionListener(this);
		jbConfig.setEnabled(true);

		// adiciona os botoes
		painelComandos.add (jlbIndividuosRestante);
		painelComandos.add (jlbIndividuoRestanteValor);
		painelComandos.add (jbExecutar);
		painelComandos.add (jbReiniciar);        	
		painelComandos.add (jbConfig);
		painelComandos.add (jbSair);

		//adiciona o painel de botoes na posi��o sul da janela principal
		
	}

	public Component getPainel() {
		// TODO Auto-generated method stub
		return this.painelComandos;
	}
	
}
