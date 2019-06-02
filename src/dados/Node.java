package dados;

public class Node {
	private Object content;
	private Node next;
	private Node before;
	
	Node(Object content){
		this.content = content;
		this.next = null;
		this.before = null;
		
	}

	public Object getContent() {
		return content;
	}

	public void setContent(Object content) {
		this.content = content;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	/**
	 * @return the before
	 */
	public Node getBefore() {
		return before;
	}

	/**
	 * @param before the before to set
	 */
	public void setBefore(Node before) {
		this.before = before;
	}
	
	
}
