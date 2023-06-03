package Collections;
import java.util.*;

class stud implements Comparable<stud> {
	int rollNo;
	int marks;
	String name;
	public stud(int rollNo, int marks, String name) {
		super();
		this.rollNo = rollNo;
		this.marks = marks;
		this.name = name;
	}
	@Override
	public String toString() {
		return "stud [rollNo=" + rollNo + ", marks=" + marks + ", name=" + name + "]";
	}
	
	public int compareTo(stud s) {
		return marks>s.marks ? 1 : -1;
	}
	

	
}

public class C6ComparatorForObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<stud> studs = new ArrayList<>();
		
		studs.add(new stud(12, 87, "Ravi"));
		studs.add(new stud(16, 75, "Nisha"));
		studs.add(new stud(5, 95, "XYZ"));
		studs.add(new stud(9, 81, "ABC"));
		
		
		Collections.sort(studs);
		
		for(stud x: studs) {
			System.out.println(x);
			}
		

	}

}
