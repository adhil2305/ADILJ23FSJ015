package skirmish;

import java.util.Scanner;

public class FloydsTriangle {
	public static void main(String[] args) {
		int number = 1,counter, rows, j;
		Scanner scan = new Scanner(System.in);
				System.out.println("Enter the number of"
						+ "rows for the triangle");
		//Copying the user input 
		rows = scan.nextInt();
		System.out.println("Floyds triangle...");
		for(counter=1;counter<=rows;counter++) {
			for(j=1;j<=counter;j++) {
				System.out.print(number+" ");
				//Increment the number value
				number++;
				
			}
			//for new line
			System.out.println();
		}
	}
	

}
