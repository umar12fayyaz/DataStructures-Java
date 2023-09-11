
public class Linklist {
	
	Node head;
	Node tail;
	
	public void insert(int data) {
	Node newnode = new Node(data);
	if(head==null)
	{
		head=newnode;
		tail=newnode;
	}
	else
	{
		tail.next=newnode;
		tail=newnode;
	}
	}
	
	public void insertFirst(int data) {
		Node newnode = new Node(data);
		newnode.next=head;
		head=newnode;
	}
	
	public void insertLast(int data) {
		Node newnode = new Node(data);
		tail.next=newnode;
		tail=newnode;
	}
	
	public void getFirst()
	{
		System.out.println("Data in Head Node");
		System.out.println(head.data);
	}
	
	public void getLast()
	
	{
		System.out.println("Data in Tail Node");
		System.out.println(tail.data);
	}
	
	public void size()
	{
		int counter=0;
		Node current=head;
		while(current!=null)
		{
			counter++;
			current=current.next;
		}
		System.out.println("Size of linked list is" + " " + counter);
	}
	
	public void popFirst()
	{
		head=head.next;
	}
	
	public void popLast()
	{
		Node current=head;
		while(current.next!=tail)
		{
			current=current.next;
		}
		tail=current;
		current.next=null;
	}
	
	public void display()
	{
		Node current=head;
		System.out.println("LinkedList");
		while(current!=null)
		{
			System.out.println(current.data);
			current=current.next;
		}
	}
	
	
}
