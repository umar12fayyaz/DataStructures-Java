
public class Linklist {
	
	private Node head;
	private Node tail;
	
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}
	
	public void insert(int data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
			tail = newnode;
		} else {
			tail.setNext(newnode);
			tail = newnode;
			}
	}

	public void insertFirst(int data) {
		Node newnode = new Node(data);
		newnode.setNext(head);
		head = newnode;
	}
	
	public void insertLast(int data) {
		Node newnode = new Node(data);
		tail.setNext(newnode);
		tail = newnode;
	}
	
	public void getFirst() {
		System.out.println("Data in Head Node");
		System.out.println(head.getData());
	}
	
	public void getLast() {
		System.out.println("Data in Tail Node");
		System.out.println(tail.getData());
	}
	
	public void size() {
		int counter = 0;
		Node current = head;
		while (current != null) {
			counter++;
			current = current.getNext();
		}
		System.out.println("Size of linked list is" + " " + counter);
	}
	
	public void popFirst() {
		head = head.getNext();
	}
	
	public void popLast() {
		Node current = head;
		while (current.getNext() != tail) {
			current = current.getNext();
		}
		tail = current;
		current.setNext(null);
	}
	
	public void display()
	{
		Node current = head;
		System.out.println("LinkedList");
		while (current != null) {
			System.out.println(current.getData());
			current = current.getNext();
		}
	}
}
