package graphics;

import java.util.Arrays;

import dados.Josephus;

public class Main {

	public static void main(String[] args) {
		
		
		//josephusGuiTeste t = new josephusGuiTeste(10,3,1);
		//t.mostrarGui();
		
		
		FramePrincipal fp = new FramePrincipal();
		fp.iniciarJanela();
		
		Josephus teste = new Josephus(5,3);
		
		System.out.println(Arrays.toString(teste.getSoldiersAlive()));
		teste.playRound();
		System.out.println(Arrays.toString(teste.getSoldiersAlive()));
		teste.playRound();
		System.out.println(Arrays.toString(teste.getSoldiersAlive()));
		teste.playRound();
		System.out.println(Arrays.toString(teste.getSoldiersAlive()));

	}
	
}
