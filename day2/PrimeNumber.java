package week1.day2;

public class PrimeNumber {

	public static void main(String[] args) {
		int number = 13;
		boolean flag = false;
		for (int i = 0; i <= number/2; i++) {
			if (number %2==0) {
				flag=true;
				break;
			}
			
		}
		
		if (!flag) {
			System.out.println(number+"is a prime number");
		    
		}
		
		else {
			System.out.println(number+ "is not prime number");
		}
	}
}