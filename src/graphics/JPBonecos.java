package graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")

public class JPBonecos extends JPanel {
	
	JPanel painelIndividuos;
	
	JLabel[] individuos;
	
	JPBonecos(){
		painelIndividuos = new JPanel();
		painelIndividuos.setLayout(new FlowLayout((FlowLayout.CENTER))); // define layout
		painelIndividuos.setBackground(Color.LIGHT_GRAY);
		painelIndividuos.setPreferredSize(new Dimension(605, 130));
	}
	
	public JPanel getPainelIndividuos() {
		return this.painelIndividuos;
	}
	
	public void adicionarLabelsNoPainelIndividuos(int qtd) {
		individuos = new JLabel[qtd];
		// remove todos os individuos anteriores
		painelIndividuos.removeAll();
		// redesenha o painel
		painelIndividuos.repaint();

		// cria cada label com os seus atributos
		for (int i =  (qtd - 1); i >= 0; i--) {
			// Cria o jlabel de define os atributos
			individuos[i] =  new JLabel (""+ (i+1) );
			individuos[i].setPreferredSize(new Dimension (25, 20));
			individuos[i].setToolTipText("(" +  (i+1) + ")");
			individuos[i].setOpaque(true);
			individuos[i].setForeground(Color.LIGHT_GRAY);
			individuos[i].setBackground(Color.BLUE);
			individuos[i].setHorizontalAlignment(SwingConstants.CENTER);

			// Adiciona o label para o painel de individuos
			painelIndividuos.add(individuos[i], 0);
		}
	}
}
