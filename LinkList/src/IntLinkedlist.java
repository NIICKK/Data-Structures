
public class IntLinkedlist {
	private Node head;
	
	public IntLinkedlist(){
		head = new Node();
		head.value = 0;
		head.link = null;
	}
	
	public boolean insertItem(int item){
		Node n = new Node();
		n.value = item;
		n.link = head;
		head = n;
		return true;
	}
	
	public boolean insertItemB(int item){
		Node n = new Node();
		Node new_node = new Node();
		new_node = head;
		while(new_node.link != null){
			new_node = new_node.link;			
		}
		n.value = item;
		n.link = null;
		new_node.link = n;
		return true;
	}
	
	public boolean deleteItem(int item){
		if(head.link.value == item){
			head.link = head.link.link;
			return true;
		} else{
			Node x = head;
			Node y = head.link;
			while(true){
				if(y==null || y.value ==item){
					break;
				} else {
					x = y;
					y = y.link;
				}
			}
			if(y!= null){
				x.link = y.link;
				return true;
			}else{
				return false;
			}
		}
	}
	
	public void printList(){
		Node z = head;
		while(z!=null){
			if(z.value!=0){
				System.out.println(z.value);				
			}
			z = z.link;
		}
	}
	
	public void sortList(){
		int c = 0 ; 
		Node a = head.link;
		while(a.link != null){
			Node b = head.link;
			while(b.link != null){
				if(b.value < b.link.value){
					c = b.value;
					b.value = b.link.value;
					b.link.value = c;
				}
				b = b.link;
			}
			a = a.link;
		}
	}
	
	public void reverseList(){
		Node curr = head;
		Node pre = null;
		Node incoming = null;
		
		while(curr != null){
			incoming = curr.link;
			curr.link = pre;
			pre = curr;
			curr = incoming;			
		}
		
		head = pre;
	}
	
	class Node{
		public int value;
		private Node link;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}
}
