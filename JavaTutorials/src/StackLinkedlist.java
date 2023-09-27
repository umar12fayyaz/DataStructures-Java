
public class StackLinkedlist {
	Node top=null;
	
	public void push(int data)
	{
		Node temp=new Node(data);
		temp.setNext(top);
		top=temp;
	}
	
	public void pop()
	{
		if(top==null)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("The popped element is "+ top.getData());
			top=top.getNext();
		}
	}
	
	public void peek()
	{
		if(top==null)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("The top element is "+ top.getData());
		}
	}

}
