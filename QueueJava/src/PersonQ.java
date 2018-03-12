
public class PersonQ {
	private Person[] q;
	
	public Person[] getQ() {
		return q;
	}

	public void setQ(Person[] q) {
		this.q = q;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}

	public int getRear() {
		return rear;
	}

	public void setRear(int rear) {
		this.rear = rear;
	}

	private int size;
	private int total;
	private int front;
	private int rear;
	
	public PersonQ(){
		size =100;
		total = 0;
		front = 0;
		rear = 0;
		q = new Person[size];
	}
	
	public PersonQ(int size){
		this.size = size;
		total = 0;
		front =0;
		rear =0;
		q = new Person[this.size];
	}
	
	public boolean enqueue(Person item){
		if(isFull()){
			return false;
		}
		else{
			total++;
			q[rear]=item;
			rear = (rear +1)%size;
			return true;
		}
	}
	
	public Person dequeue(){
		Person item = q[front];
		total--;
		front = (front +1)%size++;
		return item;
	}
	
	public boolean isFull(){
		if(size ==total){
			return true;
		}
		else{
			return false;
		}
	}
	
	public void showAll(){
		int f = front;
		if(total !=0){
			for(int i =0; i<total; i++){
				System.out.println("" +q[f].toString());
				f = (f+1)%size;
			}
		}
	}
}
