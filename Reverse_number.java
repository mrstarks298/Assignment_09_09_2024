package assignment;

public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345;
		System.out.println(reverse_int(num));
		

	}
	public static int reverse_int(int num) {
		int reversed=0;
		while(num>0) {
			int digit=num%10;
			reversed=reversed*10+digit;
					num/=10;
					
					
		}
		return reversed;
		
		
		
	}

}
