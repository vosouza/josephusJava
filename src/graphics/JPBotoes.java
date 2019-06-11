package graphics;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")

public class JPBotoes extends JPanel{
	
	JPanel painelComandos;
	
	JLabel jlbIndividuosRestante;
	JLabel jlbIndividuoRestanteValor;
	JLabel lblQuantidade;
	JLabel lblPasso;
	
	JButton jbExecutar;
	JButton jbReiniciar;
	JButton jbSair;
	JButton jbConfig;
	
	JTextField txtQuantidade;
	JTextField txtPasso;
	
	JPBotoes(FramePrincipal fp){
		//Inicializa o painel de onde se encontram os botões e interação com usuario
		painelComandos = new JPanel();
		painelComandos.setLayout(new GridLayout(3,4));

		lblPasso = new JLabel(" Passo: ");
		lblPasso.setVisible(true);
		
		txtPasso = new JTextField();
		txtPasso.setVisible(true);
		
		jlbIndividuosRestante = new JLabel("Vencedor: ");
		jlbIndividuosRestante.setVisible(false);

		jlbIndividuoRestanteValor = new JLabel("  ");
		jlbIndividuoRestanteValor.setBackground(Color.GRAY);
		jlbIndividuoRestanteValor.setVisible(false);

		lblQuantidade = new JLabel(" Quantidade de individuos: ");
		lblQuantidade.setVisible(true);
		
		txtQuantidade = new JTextField();
		txtQuantidade.setSize(100, 100);
		txtQuantidade.setEnabled(true);
		
		jbExecutar = new JButton ("Set");
		jbExecutar.setToolTipText("Executar regras do Josephus");
		jbExecutar.addActionListener(fp);

		jbReiniciar  = new JButton ("Reiniciar");
		jbReiniciar.setToolTipText("Reiniciar Josephus com os mesmos valores");
		jbReiniciar.addActionListener(fp);
		jbReiniciar.setEnabled(false);

		jbSair = new JButton ("Sair");
		jbSair.setToolTipText("Termina programa");
		jbSair.addActionListener(fp);

		jbConfig = new JButton ("Next");
		jbConfig.setToolTipText("Ativa configuracoes");
		jbConfig.addActionListener(fp);
		jbConfig.setEnabled(false);

		
		// adiciona os botoes
		painelComandos.add (jbExecutar);
		painelComandos.add (jbReiniciar);        	
		painelComandos.add (jbConfig);
		painelComandos.add (jbSair);
		
		painelComandos.add(lblQuantidade);
		painelComandos.add(txtQuantidade);
		
		painelComandos.add(lblPasso);
		painelComandos.add(txtPasso);
		
		painelComandos.add (jlbIndividuosRestante);
		painelComandos.add (jlbIndividuoRestanteValor);
		//adiciona o painel de botoes na posi��o sul da janela principal
		
	}

	public JPanel getPainelComandos() {
		return painelComandos;
	}

	public void setPainelComandos(JPanel painelComandos) {
		this.painelComandos = painelComandos;
	}

	public JLabel getJlbIndividuosRestante() {
		return jlbIndividuosRestante;
	}

	public void setJlbIndividuosRestante(JLabel jlbIndividuosRestante) {
		this.jlbIndividuosRestante = jlbIndividuosRestante;
	}

	public JLabel getJlbIndividuoRestanteValor() {
		return jlbIndividuoRestanteValor;
	}

	public void setJlbIndividuoRestanteValor(JLabel jlbIndividuoRestanteValor) {
		this.jlbIndividuoRestanteValor = jlbIndividuoRestanteValor;
	}

	public JLabel getLblQuantidade() {
		return lblQuantidade;
	}

	public void setLblQuantidade(JLabel lblQuantidade) {
		this.lblQuantidade = lblQuantidade;
	}

	public JLabel getLblPasso() {
		return lblPasso;
	}

	public void setLblPasso(JLabel lblPasso) {
		this.lblPasso = lblPasso;
	}

	public int getTxtQuantidade() {
		int i;
		try {
			i = Integer.parseInt(txtQuantidade.getText());
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Erro ao capturar o quantidade de individeuos");
			i = 0;
		}
		return i;
	}

	public void setTxtQuantidade(JTextField txtQuantidade) {
		this.txtQuantidade = txtQuantidade;
	}

	public int getTxtPasso() {
		int i;
		try {
			i = Integer.parseInt(txtPasso.getText());
		}catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(this, "Erro ao capturar o numero de passos");
			i = 0;
		}
		return i;
	}

	public void setTxtPasso(JTextField txtPasso) {
		this.txtPasso = txtPasso;
	}
	
}
