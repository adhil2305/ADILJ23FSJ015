package skirmish;

import java.util.Scanner;

public class PrintNumber {
	public static void main(String[] args) {
		//Create a reader instance which takes input from a standard input keyboard
		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number:");
		int number = reader.nextInt();
		//print the next line to the output screen 
		System.out.println("Your number is ..."+number);
		
	}-

}
