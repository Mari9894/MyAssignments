package week1.day1;

public class Maths {
	public int add(int a,int b) {
		return a+b;
	}
	void multiply(int c,float d) {
		System.out.println("MULTIPLY :"+c*d);
	}
	private void divide(int e,int d) {
		System.out.println("DIVIDE :"+e/d);
		
	}
	public static void main(String[] args) {
		Maths m=new Maths();
		int c=m.add(10,20);
		System.out.println("ADD :"+c);
		m.multiply(15,10.5f);
		m.divide(30,2);
		
	}

}
