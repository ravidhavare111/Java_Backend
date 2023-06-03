package demo;
class writerdemo{
	
}

interface writer{
	public abstract void write();
}


class pen extends writerdemo implements writer{
	public void write() {
		System.out.println("I am Pen");
	}
}


class pencil implements writer{
	public void write() {
		System.out.println("I am Pencil");
	}
	
}


class kit{
	public void dosomething(writer p) {
		p.write();
	}
}


//abstract class writer{                                      //super class
//	public abstract void show();
//}
//
//
//class pen extends writer{                          // sub class of writer class
//	public void show() {
//	System.out.println("I am Pen");
//	}
//}
//
//
//class pencil extends writer{                       // sub class of writer class
//	public void show() {
//		System.out.println("I am Pencil");
//	}
//}
//
//
//class kit{
//	public void dosomething(writer p) {
//		p.show();
//	}
//}


public class J17Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kit k = new kit();
		writer p = new pen();
		writer pc = new pencil();
		
		k.dosomething(p);
		k.dosomething(pc);
		

	}

}
