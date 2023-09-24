
public class MergeLinkedlist {
	
	public void merge(Linklist list1,Linklist list2)
	{
		Node current = list1.getHead();
		Node temp = list1.getHead();
		while (current.getNext() != null) {
			current=current.getNext();
		}
		current.setNext(list2.getHead());
		System.out.println("Linked list after merging");
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.getNext();
		}
	}

}
