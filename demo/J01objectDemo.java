	package demo;

class sum{
	
	int val1;
	int val2;
	int result;
	
	public void summation(){
		result = val1 + val2;
	}	
	
}

public class J01objectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sum obj = new sum();
		
		obj.val1 = 5;
		obj.val2 = 4;
		obj.summation();
		
		System.out.println(obj.result);
		

	}

}
