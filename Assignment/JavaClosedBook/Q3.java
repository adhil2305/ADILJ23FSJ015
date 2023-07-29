
public class Q3 {
	public static void main(String[] args) {
		//Note to self don't run the program just for self improvement
		byte b = 10;
		
		int i = b; //will accept auto promotion will ocur
		
		byte c = b;//will not accept lower to upper type casting is not useful
		
		byte d = (byte)i; // type casitn makes it possible to do this operation 
		
		
		//long l1 = 122;
		short s1 = 564;
		long l1 = (long)s1;
		
		System.out.println(l1);
		
		byte x = 10;
		byte y = 20;
		
		float f1 = (float)11.5; // does not accept it
		double d1 = f1;

		
		System.out.println(d1+" "+f1);
		
		System.out.println(x+" "+y);
		//byte sum = x*y;
		// An error is thrown when you do two arithmetic operations using tow byte values 
		//as the value goes beyond the value of the safe limit of integer
		
		
				
	}

}
