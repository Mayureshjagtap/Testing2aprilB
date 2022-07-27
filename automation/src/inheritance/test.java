package inheritance;

public class test implements {
	
	public void M1() {
		
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("Running method M1");
	}
    public void M2() {
    	
    	System.out.println("Running method M2");
    }
    public static void main(String[]args)  {
    	
    test t = new test();
    	t.M1();
    	t.M2();
    }
}
