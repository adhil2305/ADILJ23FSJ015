package skirmish;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		float first = 2.50f, second = 4.50f;
		
		System.out.println("--- Before swap ---");
		System.out.println("First Number and Second Number"+first + second);
		
		//Value if first number is assigned to temporary
		float temporary = first;
		
			//Second number is assigned to first 
			first = second;
		
		//Value of temporary which contains the intial value 
		//of first is now assigned to second
		second = temporary;
		System.out.println("-- After Swapping --");
		System.out.println("The first and second numbers are"+first+second);
		
	}

}
