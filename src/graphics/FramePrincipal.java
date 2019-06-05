package graphics;

import java.awt.Container;

import javax.swing.JFrame;

@SuppressWarnings("serial")

public class FramePrincipal extends JFrame {
	
	//Janela Principal do programa
	Container painelPrincipal  = getContentPane();
	
	//Paineis parelelos
	JPBonecos bonecos = null;
	JPBotoes btnpainel = null;
	
	public FramePrincipal(){
		
		super("Josephus LED v0.1");
		setSize(1200, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		bonecos = new JPBonecos();
		btnpainel = new JPBotoes();
	}
	
	public void iniciarJanela(){
		bonecos.adicionarLabelsNoPainelIndividuos(10);
		
		painelPrincipal.add ("Center", bonecos.getPainelIndividuos());
		painelPrincipal.add ("South", btnpainel.getPainel());
		setVisible(true);
		
	}
}
