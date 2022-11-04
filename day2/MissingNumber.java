package week1.day2;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,6,7,8};
		
		Arrays.sort(a);
		
		for (int i = 0; i < a.length; i++) {
			int temp=i+1;
			
			if (a[i]!=temp) {
				System.out.println(temp);
				break;
			}
		}

	}

}