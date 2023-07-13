import java.util.Scanner;

public class MultiplyThis {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a value for i... ");
		int i = scan.nextInt();
		System.out.println("Enter a value for j...");
		int j = scan.nextInt();
		int mul = i*j;
		System.out.println("The product of i and j is ... "+mul);
	}

}
