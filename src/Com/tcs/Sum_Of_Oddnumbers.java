package Com.tcs;

public class Sum_Of_Oddnumbers {
	public static void main(String[] args) {
		int i;
		int sum=0;
		for ( i = 0; i <=8; i++) {
			if (i%2==1) {
				sum=sum+i;
				
			}
			
		}
		System.out.println(sum);
	}

}
