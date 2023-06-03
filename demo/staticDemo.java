package demo;

class student{
	int rollNo;
	String stream;
	int cgpa;
	static String college;
	
	static {
		college = "BVJNIOT";
	}
	
	
	student(){
		rollNo = 1;
		stream = "default";
		cgpa = 0;
		
	}
	
	public void print() {
		System.out.println(rollNo+" "+stream+" "+cgpa+" "+college);
	}
}


public class staticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student ravi = new student();
		student nisha = new student();
		
		ravi.rollNo = 10;
		ravi.stream = "E&TC";
		ravi.cgpa = 7;
//		ravi.college = "PVG";
		
		nisha.rollNo = 15;
		nisha.stream = "E&TC";
		nisha.cgpa = 8;
//		nisha.college = "MIT";
//		nisha.college = "BVJNIOT";
		
		ravi.print();
		nisha.print();

	}

}
