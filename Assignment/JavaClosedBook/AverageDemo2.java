
import java.util.Scanner;

public class AverageDemo2 {
	public static void main(String[] args) {
		Tiger obj = new Tiger();
		obj.doIt();
	}
	}
		class Tiger{
			 void doIt(){
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		int s;
		System.out.println("Enter the number of elements you wanna find the average for:");
		s = scan.nextInt();
				
		
		int[] n = new int[s];
		
		System.out.println("Enter The numbers one by one");
		for(int j= 0;j<s;j++) {
		n[j] = scan.nextInt(); 
		 }
		
		for(int i: n) {
			sum = sum+i;
		}
		sum = sum/s;
		System.out.println("The Average of the given numbers is "+ sum);
		
			}
		}
			
			


