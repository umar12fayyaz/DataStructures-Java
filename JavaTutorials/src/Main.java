
public class Main {

	public static void main(String[] args) {
//		User a = new User();
//		a.setFirstName("Umar");
//		a.setLastName("Fayyaz");
//		System.out.println(a.getFullName());
		
		Linklist list=new Linklist();
//		list.insert(1);
//		list.insert(2);
//		list.insert(3);
//		list.insert(4);
//		list.insertFirst(10);
//		list.insertFirst(20);
//		list.insertLast(30);
//		list.insertLast(40);
//		
//		list.display();
//		list.getFirst();
//		list.getLast();
//		list.size();
//		list.popFirst();
//		list.popLast();
//		list.display();

//		StackLinkedlist stack=new StackLinkedlist();
//		stack.push(1);
//		stack.push(2);
//		stack.push(3);
//		stack.push(4);
//		stack.push(5);
//		stack.peek();
//		stack.pop();
//		stack.peek();
		
		QueueLinkedlist queue=new QueueLinkedlist();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.dequeue();
		queue.peek();
	}

}
