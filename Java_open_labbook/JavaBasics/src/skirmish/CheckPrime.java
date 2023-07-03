package skirmish;

import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) {
		int temp;
		System.out.println(13%2);
		boolean isPrime=true;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number :");
		int num = scan.nextInt();
		scan.close();
		for(int i=1;i<=num/2;i++) {
			temp=num%i;
			if(temp==0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime)
			System.out.println(num+"is a Prime number");
		else
			System.out.println(num+"is not a Prime Number");
		
		
	}
	

}
