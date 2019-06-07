package graphics2;

import dados.Josephus;

public class Animacao extends Thread {
	
	public int tempoEspera;
	JPBonecos painel;
	Josephus regra;
	
	public Animacao(int tempoEspera){
		this.tempoEspera = tempoEspera;
	}

	public Animacao(Josephus regras, JPBonecos bonecos) {
		// TODO Auto-generated constructor stub
		this.regra = regras;
		this.painel = bonecos;
		this.tempoEspera = 100;
		painel.adicionarLabelsNoPainelIndividuos(regra.getQuantidade());
	}

	// Metodo contendo o algoritmo do Josephus
	public void run() {

		// TESTE
		int qtd = regra.getQuantidade();
		for (int i = 0; i < qtd; i++) {
			painel.adicionarIndividosComGrifo(qtd,regra.getSoldiersAlive());
			regra.playRound();
			
			try {
				Thread.sleep(this.tempoEspera);
			}catch(Exception e) {

			}
		}
	}
}
