package Abstarctmethod;

public class classB  extends ClassA{
	
	public static void main (String []args) {
		 ClassA.set(5555);
		
		 classB m =new  classB();
		
		int y = m.get();
		System.out.println(y);
	}

}
