
public class SortLinkedlist {
	
	public void sort(Linklist list)
	{
		Node current = list.getHead();
		Node index = current;
		int temp;
		while (current != null) {
			index = current.getNext();
		while (index != null) {
			if (current.getData() > index.getData()) {
				temp = current.getData();
				current.setData(index.getData());
				index.setData(temp);
			}
			index = index.getNext();
		}
		current = current.getNext();
		}
	}

}
