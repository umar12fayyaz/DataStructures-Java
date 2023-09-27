
public class QueueLinkedlist {

	Node front=null;
	Node rear=null;
	
	public void enqueue(int data)
	{
		Node temp=new Node(data);
		
		if(front==null && rear==null) {
			front=temp;
			rear=temp;
		}
		else {
			rear.setNext(temp);
			rear=temp;
		}
	}
	
	public void dequeue()
	{
		Node current;
		
		if(front==null && rear==null) {
			System.out.println("Queue is Empty");
		}
		else {
			System.out.println("The element dequeued is "+ front.getData());
			current=front;
			front=front.getNext();
			current=null;
		}
	}
	
	public void peek()
	{
		if(front==null && rear==null) {
			System.out.println("Queue is Empty");
		}
		else {
			System.out.println("Value at Front node is "+ front.getData());
		}
	}
}
