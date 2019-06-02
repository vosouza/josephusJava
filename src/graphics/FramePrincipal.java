package graphics;

import javax.swing.JFrame;

@SuppressWarnings("serial")

public class FramePrincipal extends JFrame {
	
	//Janela Principal do programa
	JFrame principal = null;
	
	//Paineis parelelos
	JPBonecos bonecos = null;
	JPBotoes btnpainel = null;
	
	public FramePrincipal(){
		principal = new JFrame();
		bonecos = new JPBonecos();
		btnpainel = new JPBotoes();
	}
	
	public void iniciarJanela(){
		
	}
}
