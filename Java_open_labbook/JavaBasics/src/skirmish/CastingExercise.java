package skirmish;

public class CastingExercise {
	public static void main(String[] args) {
		//Note to self don't run the program just for self improvement
		byte b = 10;
		
		int i = b; //will accept auto promotion will ocur
		
		byte c = b;//will not accept lower to upper type casting is not useful
		
		byte d = (byte)i; // type casitn makes it possible to do this operation 
		
		byte x = 10;
		byte y = 20;
		//byte sum = x*y;
		// An error is thrown when you do two arithmetic operations using tow byte values 
		//as the value goes beyond the value of the safe limit of integer
		
		
				
	}

}
