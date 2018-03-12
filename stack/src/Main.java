public class Main{
	public static void main(String[] args){
//		intStack IntStack = new intStack();
//		if(!IntStack.isFull()){
//			IntStack.push(2);
//			IntStack.push(4);
//			IntStack.push(6);
//			IntStack.push(9);
//		}
//		

		Person person1 = new Person("nick","123");
		Person person2 = new Person("nemo","321");
		
		PersonStack stack = new PersonStack();
		
		stack.push(person1);
		stack.push(person2);
		
		System.out.println(stack.pop().toString());
		System.out.println(stack.pop().toString());
	}
}
