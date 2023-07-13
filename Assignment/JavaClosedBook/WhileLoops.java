
import java.util.Scanner;

public class WhileLoops {
	public static void main(String[] args) {
		int number, sum=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter any integer value "
				+"below ten");
		number = sc.nextInt();
		
		while(number<=10) {
			sum = sum + number;
		number++;
		}
		System.out.format("Sum of the number in the while loop is : %d",sum);

	}
 }
