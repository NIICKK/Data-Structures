
public class Main {
	public static void main(String[] args){
//		IntQ q = new IntQ();
//		q.enqueue(3);
//		q.enqueue(4);
//		q.enqueue(6);
//		
//		q.showAll();

		PersonQ q = new PersonQ();
		q.enqueue(new Person("nick","123"));
		q.enqueue(new Person("nemo", "321"));
		q.showAll();
		System.out.println("HI");
		System.out.println("front: " + q.getFront());
		System.out.println("total: " + q.getTotal());
		System.out.println(q.dequeue());
		
		System.out.println("dequeued!");
		
		Person[] refQ = q.getQ();
		
		System.out.println("front: " + q.getFront());
		System.out.println("total: " + q.getTotal());
		System.out.println(refQ[0]);
		System.out.println(refQ[1]);
		System.out.println(refQ[2]);
		
	}
}
