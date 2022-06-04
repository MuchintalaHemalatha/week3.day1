package week3.day1;

public class Calculator {

	public void add(int a, int b) {
		int sum=a+b; 
		System.out.println("Sum is "+ sum);
	}

	public void add(int a, int b, int c) {
		int sum=a+b+c;
		System.out.println("Sum is "+sum);
	}

	public void sub(int a, int b) {
		int diff=a-b;
		System.out.println("sub is "+diff);
	}

	public void sub(double a, double b) {
		double diff=a-b;
		System.out.println("sub is "+diff);
	}
	public void mul(int a, int b) {
		int multi= a*b;
		System.out.println("mul is "+multi);
	}
	

	public void mul(int a, double b) {
		double multi= a*b;
		System.out.println("mul is "+multi);
	
		}
	public static void main(String[] args)
	{
	
	Calculator cal= new Calculator();
	cal.add(2, 3);
	cal.add(2, 3,5);
	cal.sub(20, 3);
	cal.sub(20.00, 10.00);
	cal.mul(2, 3);
	cal.mul(2, 3.00);
	
	}	

}
