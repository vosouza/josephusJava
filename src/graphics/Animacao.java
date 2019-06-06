//package graphics;
//
//public class Animacao extends Thread {
//	public int tempoEspera;
//	
//	
//	public Animacao(int tempoEspera){
//		this.tempoEspera = tempoEspera;
//	}
//
//	// Metodo contendo o algoritmo do Josephus
//	public void run() {
//
//		// TESTE
//		int qtd = getQtdIndividuos();
//		for (int i = 0; i < qtd; i += 2) {
//			individuos[i].setBackground(getCorIndividuoExecutado());	
//			try {
//				Thread.sleep(this.tempoEspera);
//			}catch(Exception e) {
//
//			}
//		}
//	}
//}