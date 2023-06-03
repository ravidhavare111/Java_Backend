package demo;

class Calculation{
	
	public int add(int ...a ) {
		int sum = 0;
		
		for(int x : a) {
			sum+= x;
		}
		
		return sum;
	}
		
}

public class VariableLengthArgument {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculation obj = new Calculation();
		System.out.println(obj.add(2, 4, 6, 8));
		
		
	}

}
