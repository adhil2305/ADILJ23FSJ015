

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		int num = 0;
		int reversenum=0;
		System.out.println("Enter a number :");
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		while(num !=0) {
			reversenum *= 10;
			reversenum = reversenum + num%10;
			num = num/10;
			
			System.out.println("Reverse of the Number:"+reversenum);
			
		}
		
				
	}

}
