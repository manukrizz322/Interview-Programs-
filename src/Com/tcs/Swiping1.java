package Com.tcs;

import java.util.Scanner;

public class Swiping1 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		 System.out.println("Enter the first number");
		 int a = sc.nextInt();
		 System.out.println(a);
		 System.out.println("Enter the second number");
		 int b = sc.nextInt();
		 System.out.println(b);
		 
		 a= a+b;
		 b=a-b;
		 a=a-b;
		 
		 
		 System.out.println(a);
		 System.out.println(b);
		 
		 sc.close();
	}

}
