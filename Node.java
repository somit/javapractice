package practice.leanLinkedList;

public class Node {
	Node next = null;
	int value;
	Node(int val){
		setValue(val);
	}
	public Node()
	{
	
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	
}
