package dados;

public class DoubleCircledList {
	
	private Node head;
	private int length;
	
	public DoubleCircledList() {
		this.length = 0;
	}
	
	public void addNode(Object content) {
		Node n = new Node(content);
		if(length == 0) {
			this.head = n;
			this.length++;
		}else {
			Node aux1, aux2;
			aux1= this.head;
			
			for(int i=1;i < this.length; i++) {
				aux2 = aux1.getNext();
				aux1 = aux2;
			}
			
			n.setBefore(aux1);
			n.setNext(head);
			aux1.setNext(n);
			head.setBefore(n);
			this.length++;
		}
	}
	
	public Object getContent(int num) {
		Node aux1;
		aux1= this.head;
		for(int i=1;i < num; i++) {
			aux1 = aux1.getNext();
		}

		return aux1.getContent();
	}
	
	public void excludeNode(int num) {
		if(length == 1) {
			head = null;
		}else {
			
			Node aux1, aux2;
			aux1= this.head;
			
			
			if(num != 1) {
				
				for(int i=1;i <length; i++) {
					aux1 = aux1.getNext();
				}
				
				aux2 = aux1.getBefore();
				aux1 = aux1.getNext();
				aux1.setBefore(aux2);
				aux2.setNext(aux1);
				
			}else {
				aux2 = aux1.getBefore();
				aux1 = aux1.getNext();
				aux1.setBefore(aux2);
				aux2.setNext(aux1);
				this.head = aux1;
			}
			this.length--;
		}
	}
	
	public Node getHead() {
		return head;
	} 

	public int getLength() {
		return length;
	}

}
