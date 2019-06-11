package graphics;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import dados.Josephus;

@SuppressWarnings("serial")

public class FramePrincipal extends JFrame implements ActionListener {
	
	private int qtd, passo;
	
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
		//bonecos.adicionarLabelsNoPainelIndividuos(10);
		
		painelPrincipal.add ("Center", bonecos.getPainelIndividuos());
		painelPrincipal.add ("South", btnpainel.getPainelComandos());
		pack();
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String comando = arg0.getActionCommand();

		if(comando.contentEquals("Set")) {
			
			qtd = btnpainel.getTxtQuantidade();
			passo = btnpainel.getTxtPasso();
			
			if(qtd>0 && passo>0 && passo<qtd) {
				
				if(regras == null) {
					btnpainel.txtQuantidade.setEditable(false);
					btnpainel.txtPasso.setEditable(false);
					btnpainel.jbExecutar.setEnabled(false);
					btnpainel.jbReiniciar.setEnabled(true);
					btnpainel.jbConfig.setEnabled(true);
					regras =  new Josephus(qtd,passo);
					bonecos.adicionarIndividosComGrifo(qtd,regras.getSoldiersAlive());
					
				}else{
					JOptionPane.showMessageDialog( this,"Valores invalidos");
				}
			}
				//game = new Animacao(regras,bonecos);
				//game.start();
				
				pack();	
				
			}else if(comando.contentEquals("Reiniciar")){
				if(regras != null){
					btnpainel.txtQuantidade.setEditable(true);
					btnpainel.txtPasso.setEditable(true);
					btnpainel.jbExecutar.setEnabled(true);
					btnpainel.jbReiniciar.setEnabled(false);
					regras = null;
				}
				
			}else if(comando.contentEquals("Next") && (regras != null)){
					regras.playRound();
					bonecos.adicionarIndividosComGrifo(qtd,regras.getSoldiersAlive());
					
					if(regras.getWinner() != null){
						btnpainel.jlbIndividuosRestante.setVisible(true);
						btnpainel.jlbIndividuoRestanteValor.setText(regras.getWinner().toString());
						btnpainel.jlbIndividuoRestanteValor.setVisible(true);
					}
					
					pack();	
			}else if(comando.contentEquals("Sair")){
				System.exit(0);
			}
		
		
	}
}

