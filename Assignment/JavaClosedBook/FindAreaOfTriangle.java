
import java.util.Scanner;

public class FindAreaOfTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length of the Rectangle");
		double length = sc.nextDouble();
		System.out.println("Enter the width of the Rectangle");
		double width = sc.nextDouble();
		double area= (length*width)/2;
		System.out.println("The area of the triangle is "+area);
		
	}

}
