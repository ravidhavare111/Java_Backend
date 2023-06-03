//Encapsulation
package demo;

class students{
	private int rollNo;
	private String name;
	
	public int getRollNo() {                     //getter for roll no.
		return rollNo;
	} 
	public void setRollNo(int rollNo) {          //setter for roll no.
		this.rollNo = rollNo;
	}
	public String getName() {                    //getter for name
		return name; 
	}
	public void setName(String name) {           //setter for name
		this.name = name;
	}
	
	
	
}

public class EncalsulationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		students s1 = new students();
		s1.setRollNo(4);
		
		int temp = s1.getRollNo();
		System.out.println(temp);

	}

}
