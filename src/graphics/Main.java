package graphics;

import dados.DoubleCircledList;

public class Main {

	public static void main(String[] args) {
		DoubleCircledList l = new DoubleCircledList();
		
		
		l.addNode("num1");
		l.addNode("num2");
		l.addNode("num3");
		l.addNode("num4");
		
		System.out.println(l.getContent(1));
		System.out.println(l.getContent(2));
		System.out.println(l.getContent(3));
		System.out.println(l.getContent(4)+"\n");
		l.excludeNode(1);
		System.out.println(l.getContent(1));
		System.out.println(l.getContent(2));
		System.out.println(l.getContent(3));
		System.out.println(l.getContent(4));

	}

}
