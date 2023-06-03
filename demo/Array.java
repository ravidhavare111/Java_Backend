package demo;
import java.util.*;

class studentData{
	int rollNo;
	String Name;
	
	studentData(int rollNo, String name){
		this.rollNo = rollNo;
		this.Name = name;
	}
	
	public void display() {
		System.out.println(rollNo+"  "+Name);
	}
}

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		studentData[] arr = new studentData[2];
		Scanner sc = new Scanner(System.in);
		
		for(int i = 0; i<2 ; i++) {
			arr[i] = new studentData(sc.nextInt(),sc.nextLine());
		}
		
//		arr[0] = new studentData(24, "Ravi Dhavare");
//		arr[1] = new studentData(16, "Nisha Kasbe");
		
		arr[0].display();
		arr[1].display();
		
		
		

	}

}
