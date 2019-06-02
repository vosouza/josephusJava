package dados;

public class Josephus {
	
	private int totalSoldiers;
	private int step;
	private DoubleCircledList soldiers;
	
	
	
	Josephus(int total,int step){
		this.totalSoldiers = total;
		this.step = step;
		
		soldiers = new DoubleCircledList();
		for(int i=1; i <= totalSoldiers; i++) {
			soldiers.addNode(i);
		}
	}
	
	public int[] getSoldiersAlive() {
		return null;
		
	}
	
}
