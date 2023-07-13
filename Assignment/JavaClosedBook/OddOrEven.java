import java.util.Scanner;

public class OddOrEven {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number:");
		byte num = scan.nextByte();
		
		//the input provided by the user is stored in num
		
		//If the number is divisible by two it si even
		// and if a number is not divisible by 2 obiviously its even
		if (num % 2 == 0) {
			System.out.println("The number you gave me is even");
		}
		else
			System.out.println("The number is odd");
		
	}

}
