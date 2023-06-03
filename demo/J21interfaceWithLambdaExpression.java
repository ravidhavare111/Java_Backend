package demo;

interface RAVI{
	public void show();
	
}

class J21interfaceWithLambdaExpression{
	public static void main(String []args) {
		RAVI obj = () -> System.out.println("I am In RAVI");
				
				
		obj.show();
	}
}
