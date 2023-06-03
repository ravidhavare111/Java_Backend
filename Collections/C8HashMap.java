package Collections;
import java.util.*;

public class C8HashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<String, String> HM = new HashMap<>();
		
		HM.put("Name", "Ravi");
		HM.put("Actor", "Hrutik");
		HM.put("Bike", "Platina");
		HM.put("Job", "Software Developer");
		
//		System.out.println(HM);
		for(String x : HM.keySet()) {
			System.out.println(x+" "+ HM.get(x));
		}

	}

}
