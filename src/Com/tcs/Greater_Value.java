package Com.tcs;

public class Greater_Value {
	public static void main(String[] args) {
		int a, b, c, d;
		a = 20;
		b = 45;
		c = 10;
		d = 86;
		if (a > b && a > c && a > d) {
			System.out.println("The Biggest value is" + a);

		}
		else if (b > a && b > c && b > d) {
			System.out.println("The Biggest value is" + b);

		}
		else if (c > a && c > b && c > d) {
			System.out.println("The Biggest value is" + c);

		}
		else  {
			System.out.println("The Biggest value is"+d);
		}
		
			
		

	}

}
