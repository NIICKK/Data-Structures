
public class HashTable {
	private StdList[] arr;
	private int size;
	private int totalstudents;
	
	public HashTable(){
		size = 1000;
		arr = new StdList[size];
	}
	
	public int toHashCode(String rollno){
		int addASCIIs = 0;
		int codeValue = 0;
		for(int i = 0; i<rollno.length(); i++){
			addASCIIs = addASCIIs + (int)rollno.charAt(i);
		}
		codeValue = addASCIIs % arr.length; //index of hashtable
		return codeValue;
	}
	
	public boolean insert(int key, Student data){
		if(arr[key] == null){
			arr[key] = new StdList();
		} 
		arr[key].insertStd(data);
		totalstudents++;
		return true;
	}
	
	public int getTotal(){
		return totalstudents;
	}
	
	public Student fetchStdInfo(String rollno){
		int key = toHashCode(rollno);
		if(arr[key] == null){
			return null;
		} else{
			Student q = arr[key].fetchData(rollno);
			if(q != null){
				return q;
			} else{
				return null;
			}
		}
	}
	
	public boolean deleteStd(String rollno){
		boolean have = arr[toHashCode(rollno)].haveRollno(rollno);
		if(have){
			int key = toHashCode(rollno);
			arr[key].deleteStudent(rollno);
			totalstudents--; 
			return true;
		}
		return false;
	}
	
	public void showData(){
		for(int i =0; i< arr.length; i++){
			if(arr[i] != null){
				arr[i].showAll();
			}
		}
	}
}
