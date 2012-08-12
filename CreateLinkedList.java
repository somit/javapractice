package practice.leanLinkedList;

public class CreateLinkedList {
	Node head = null;

	/**
	 * @param args
	 */

	public void addNode(int input) {
		Node end = new Node(input);
		if (this.head == null) {
			this.head = end;
			return;
		}
		Node h = this.head;
		while (h.next != null) {
			h = h.next;
		}
		h.next = end;
	}

	public void displayList() {
		Node printNode = this.head;
		System.out.println("Displaying the linked list nodes values :");
		while (printNode != null) {
			System.out.println(printNode.value);
			printNode = printNode.next;
		}
	}

	public int countNodes() {
		int count = 0;
		while (this.head.next != null) {
			count++;
		}
		return count;
	}
}
