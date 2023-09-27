
public class Main {

	public static void main(String[] args) {
//		User a = new User();
//		a.setFirstName("Umar");
//		a.setLastName("Fayyaz");
//		System.out.println(a.getFullName());
//		
		Linklist list1=new Linklist();
		Linklist list2=new Linklist();
		list1.insert(9);
		list1.insert(7);
		list1.insert(2);
		list1.insert(5);
		list1.insert(4);
		
		list2.insert(10);
		list2.insert(1);
		list2.insert(3);
		list2.insert(0);
		list2.insert(6);
//		list.insertFirst(10);
//		list.insertFirst(20);
//		list.insertLast(30);
//		list.insertLast(40);
//		
		list1.display();
		list2.display();
//		list.getFirst();
//		list.getLast();
//		list.size();
//		list.popFirst();
//		list.popLast();
//		list.display();
//		ReverseLinkedlist rev=new ReverseLinkedlist();
//		rev.reverse(list);
//		SortLinkedlist sl=new SortLinkedlist();
//		sl.sort(list1);
//		sl.sort(list2);
//		System.out.println("Linked list after sorting");
//		list1.display();
		MergeLinkedlist ml=new MergeLinkedlist();
		ml.merge(list1, list2);
//
////		StackLinkedlist stack=new StackLinkedlist();
////		stack.push(1);
////		stack.push(2);
////		stack.push(3);
////		stack.push(4);
////		stack.push(5);
////		stack.peek();
////		stack.pop();
////		stack.peek();
////		
////		QueueLinkedlist queue=new QueueLinkedlist();
////		queue.enqueue(1);
////		queue.enqueue(2);
////		queue.enqueue(3);
////		queue.enqueue(4);
////		queue.dequeue();
////		queue.peek();
		
//		int array[]= {1,2,3,4,5};
//		ReverseArray arr=new ReverseArray();
//		arr.display(array);
//		arr.reverse(array);
	}

}
