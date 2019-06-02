package dados;

public class Josephus {
	
	private int totalSoldiers;
	private int step, round;
	private DoubleCircledList soldiers;
	
/*
 * @param total soldiers, steps to kill the soldiers
 * 
 * 	
*/	
	public Josephus(int total,int step){
		this.totalSoldiers = total;
		this.step = step;
		this.round = 1;
		
		soldiers = new DoubleCircledList();
		for(int i=1; i <= totalSoldiers; i++) {
			soldiers.addNode(i);
		}
	}
	
	public void playRound() {
		int pos;
		pos = step*round;
		
		if(pos > totalSoldiers) {
			round = 1;
		}else {
			round++;
		}
		
		while((soldiers.getContent(pos)) == null) {
			pos++;
		}
		soldiers.setContent(pos, null);
		
	}
	
	public int[] getSoldiersAlive() {
		int[] sol = new int[this.totalSoldiers];
		for(int i=1;i<this.totalSoldiers;i++) {
			if( soldiers.getContent(i) == null ) {
				sol[i] = 0;
			}else {
				sol[i] = 1;
			}
		}
		return sol;
		
	}
	
}
