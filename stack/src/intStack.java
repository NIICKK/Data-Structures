
public class intStack {
	private int[] stack;
	private int top;
	private int size;
	public intStack(){
		top =-1;
		size =50;
		stack = new int [50];
	}
	
	public int[] getStack() {
		return stack;
	}

	public void setStack(int[] stack) {
		this.stack = stack;
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public intStack(int size){
		top = -1;
		this.size = size;
		stack = new int [this.size];
	}
	
	public boolean push(int item){
		if(!isFull()){
			top++;
			stack[top] = item;
			return true;
		}
		else{
			return false;
		}
	}
	
	public int pop(){
		return stack[top--];
	}
	
	public boolean isEmpty(){
		return (top==-1);
	}
	
	public boolean isFull(){
		return (top == stack.length -1);
	}
}
