
public class Main {
	public static void main(String[] args){
		IntLinkedlist list = new IntLinkedlist();
		list.insertItem(10);
		list.insertItem(1);
		list.insertItem(100);
		
		list.printList();
		System.out.println("Head: "+(list.getHead()).value);
		System.out.println();
		list.reverseList();
		
		list.printList();
		
		System.out.println("Head: "+(list.getHead()).value);
//		Person person1 = new Person("Nick", "123");
//		Person person2 = new Person("Nemo", "321");
//		
//		PersonLinkedList list = new PersonLinkedList(person1);
//		list.insertItemB(person2);
//		
//		list.printList();
		
	}
}
