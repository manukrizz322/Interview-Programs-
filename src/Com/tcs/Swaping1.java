package Com.tcs;

import java.util.Scanner;

public class Swaping1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the first number");
		int a = sc.nextInt();
		System.out.println(a);
		
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		System.out.println(b);
		
		int temp; 
		temp=a; // c=13
		a=b; // a=15
		b=temp; // b=13
		
		System.out.println(a);
		System.out.println(b);
		
		sc.close();
	}

}
