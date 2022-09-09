package practice;

public class VarCase {
	void m1(int a, int b, int c) {
		System.out.println(a+" " + b + " " + c + " ");
	}
	void m1(byte...b) {
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		byte b =10;
		VarCase m = new VarCase();
		m.m1(b, b, b);
		m.m1(b);

	}

}
