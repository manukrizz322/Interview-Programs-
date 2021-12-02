package Com.tcs;

public class Sum_Of_Even_numbers {
	public static void main(String[] args) {
		int sum =0;
		int i;
		for ( i = 1; i <=10; i++) {
			if (i%2==0) {
				sum=sum+i;
				
				
			}
			
		}
		System.out.println(sum);
	}

}
