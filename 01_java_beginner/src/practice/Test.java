package practice;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Boolean b = new Boolean("true"); // true
		Boolean b1 = new Boolean(true); // true
		System.out.println(b1.equals(b)); // true
		
		Boolean b2 = new Boolean("True"); // true
		Boolean b3 = new Boolean("tRue"); // true
		System.out.println(b2.equals(b3)); // true
	
		Boolean b4 = new Boolean("hey"); // false
		Boolean b5 = new Boolean("Bye"); // false
		System.out.println(b4.equals(b5)); // true
	
	}

}
