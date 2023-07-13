package skirmish;

import java.util.Scanner;


public class AreaOfSquare {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the radius:");
		double radius = scanner.nextDouble();
		double area = Math.PI*(radius*radius);
		System.out.println("The area of the circle is "
				+area);
		
		double circumference = Math.PI*2*radius;
		System.out.println("The Circumference is"+circumference);
		
	}

}
