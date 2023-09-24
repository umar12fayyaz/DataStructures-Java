
public class ReverseLinkedlist {
	
	public void reverse(Linklist list)
	{
		Node previous = null;
		Node current = list.getHead();
		Node temp = null;
		while (current != null) {
			temp = current.getNext();
			current.setNext(previous);
			previous = current;
			current = temp;
		}
		list.setHead(previous);
	}

}
