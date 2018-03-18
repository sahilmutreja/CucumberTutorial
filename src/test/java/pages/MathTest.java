package pages;

public class MathTest {
	
	public int a, b, c;
	
	public MathTest(int n1, int n2) {
		a=n1;
		b=n2;
	}
	 
	public void add() {
		c = a + b;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("C = " + c);
	}
}
