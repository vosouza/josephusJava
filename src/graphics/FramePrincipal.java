package graphics2;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

import dados.Josephus;

@SuppressWarnings("serial")

public class FramePrincipal extends JFrame implements ActionListener {
	
	//Janela Principal do programa
	Container painelPrincipal  = getContentPane();
	
	//Paineis parelelos
	JPBonecos bonecos = null;
	JPBotoes btnpainel = null;
	
	//Classe responsavel pela animação do negocio
	Animacao game;
	
	//responsavel pela regra do jogo
	Josephus regras;
	
	public FramePrincipal(){
		
		super("Josephus LED v0.1");
		//setSize(1200, 500);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		bonecos = new JPBonecos();
		btnpainel = new JPBotoes(this);
	}
	
	public void iniciarJanela(){
		bonecos.adicionarLabelsNoPainelIndividuos(10);
		
		painelPrincipal.add ("Center", bonecos.getPainelIndividuos());
		painelPrincipal.add ("South", btnpainel.getPainelComandos());
		pack();
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String comando = arg0.getActionCommand();
		int qtd, passo;
		if(comando.contentEquals("Executar")) {
			
			qtd = btnpainel.getTxtQuantidade();
			passo = btnpainel.getTxtPasso();
			
			if(qtd>0 && passo>0) {
				regras =  new Josephus(qtd,passo);
				game = new Animacao(regras,bonecos);
				game.run();
				
			}
		}
	}
}
