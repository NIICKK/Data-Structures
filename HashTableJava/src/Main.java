
public class Main {
	public static void main(String[] args){
		HashTable hashtable = new HashTable();
		
		Student std1 = new Student("nick", "15-123", 3.4);
		Student std2 = new Student("nemo", "15-453", 3.1);
		Student std3 = new Student("jack", "15-233", 3.2);
		Student std4 = new Student("tom", "15-321", 3.9);

		int std1key = hashtable.toHashCode(std1.getRoll_no());
		int std2key = hashtable.toHashCode(std2.getRoll_no());
		int std3key = hashtable.toHashCode(std3.getRoll_no());
		int std4key = hashtable.toHashCode(std4.getRoll_no());
		
		hashtable.insert(std1key, std1);
		hashtable.insert(std2key, std2);
		hashtable.insert(std3key, std3);
		hashtable.insert(std4key, std4);
		
		hashtable.deleteStd(std3.getRoll_no());
		
		hashtable.showData();
		
		Student new_std2 = hashtable.fetchStdInfo(std2.getRoll_no());
		
		if(new_std2.getName().equals(std2.getName())){
			System.out.println("Equals");
		}
		
		
		
	}
}
