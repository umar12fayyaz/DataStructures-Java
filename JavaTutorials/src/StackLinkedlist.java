
public class StackLinkedlist {
	Node top=null;
	
	public void push(int data)
	{
		Node temp=new Node(data);
		temp.next=top;
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
			System.out.println("The popped element is "+ top.data);
			top=top.next;
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
			System.out.println("The top element is "+ top.data);
		}
	}

}
