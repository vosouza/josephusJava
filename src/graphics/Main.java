package graphics;

import java.util.Arrays;

import dados.Josephus;

public class Main {

	public static void main(String[] args) {
		Josephus teste = new Josephus(5,3);
		
		System.out.println(Arrays.toString(teste.getSoldiersAlive()));
		teste.playRound();

	}

}
