package Stringjava1;

public class stringmethod {
	
	
	public static void main(String[]args) {
		
		
		String s1="velocity";
		String s2="VELOCITY";
		String s3="city";
		
		
		
		System.out.println(s1.charAt(2)); //to print any char in any index
		System.out.println(s2.replace("V", "H")); //to replace the character
		System.out.println(s2.isEmpty()); // true or false 
		System.out.println(s2. concat(s3));
		System.out.println(s3.substring (3)); //3rd character
		System.out.println(s1.equals(s2));
		System.out.println(s1==s2);
		System.out.println(s2.equalsIgnoreCase(s1));
		System.out.println(s1.length());
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
	
	
}

}

