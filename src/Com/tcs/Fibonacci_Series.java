package Com.tcs;


import java.util.Scanner;

public class Fibonacci_Series {
	public static void main(String[] args) {
		//int a=0,b=1,c;
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt(),b=sc.nextInt(),c;
		
		System.out.println("a="+a+","+"b="+b+","+"c");
		
		for (int i = 0; i <10; i++) {
			 c=a+b;
			 System.out.println(c);
			 a=b;
			 b=c;
			 
			sc.close(); 
			
			
		}
	}

}
