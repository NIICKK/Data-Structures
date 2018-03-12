
public class Main {
	public static void main(String[] args ){
		Person p1 = new Person("nick", 24);
		Person p2 = new Person("nemo", 55);
		Person p3 = new Person("jack", 23);
		Person p4 = new Person("adam", 34);
		Person p5 = new Person("john", 18);
		
		BST bst = new BST();
		bst.insert(p1);
		bst.insert(p2);
		bst.insert(p3);
		bst.insert(p4);
		bst.insert(p5);
		
		
		bst.showAll(bst.findNode("nemo"));
		

		Person p = bst.getData(bst.findParent("jack"));
		System.out.println(p.toString());
	}
}
