package dados;

public class Josephus {
	
	private int totalSoldiers;
	private int step, round;
	private DoubleCircledList soldiers;
	private Object winner;
	
/*
 * @param total soldiers, steps to kill the soldiers
 * 
 * 	
*/	
	public Josephus(int total,int step){
		this.totalSoldiers = total;
		this.step = step;
		this.round = 1;
		this.winner = null;
		
		soldiers = new DoubleCircledList();
		for(int i=1; i <= totalSoldiers; i++) {
			soldiers.addNode(i);
		}
	}
	
	/*
	 *Faz uma iteraÃ§Ã£o para tirar 1 soldado do estrutura de dados
	 * soldado morto tem o conteudo null
	 */
	public void playRound() {
		int pos = step*round;
		
		while((soldiers.getContent(pos)) == null) {
			pos++;
		}
		
		if(round == totalSoldiers){
			this.winner = soldiers.getContent(pos);
		}
		
		soldiers.setContent(pos, null);
		
		round++;
	}
	
	/*
	 *Devolve um array de inteiro com o tamanho total de soldados 
	 * em cada celula 
	 * 1-para vivo
	 * 0-para morto 
	 */
	public int[] getSoldiersAlive() {
		int[] sol = new int[this.totalSoldiers];
		for(int i=0;i<this.totalSoldiers;i++) {				//inicializa em zero por causa da matriz
			if( soldiers.getContent(i+1) == null ) { 		//adiciona 1 por causa da logica
				sol[i] = 0;
			}else {
				sol[i] = 1;
			}
		}
		return sol;
		
	}

	public Object getWinner() {
		return winner;
	}

	public int getQuantidade() {
		// TODO Auto-generated method stub
		return totalSoldiers;
	}
	
}
