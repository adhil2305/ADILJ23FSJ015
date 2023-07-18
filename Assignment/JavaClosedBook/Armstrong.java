public class Armstrong {
		public static void main(String[] args) {
	/**
	 * Hai and Welcome 
	 * An armstrong is a number in which if you just
	 * take the individual elements of the number and
	 * then cube those number that is multipley 
	 * those numbers to an exponent of three and 
	 * then add those individual results the sum 
	 * would be same as of the original number 
	 * For Exxample:
	 * 			If you take 13 3^3+ 2^3 = 27+8=35	
	 */
			
	/** PALINDROME
	 * A numbeer whose reverse gives the same number 
	 * is the one which is called a palindrome 
	 * 
	 */
			int number = 56365;
			int sum = 0;
			int num2 = number;
			int divide = 0;
				while(num2>0) {
				divide = num2%10;
				sum = (sum*10) +divide;
				num2 = num2/10;
				}
				if(sum==number) {
					System.out.println("The given number "+number+" is a Palindrome");
				}
				else {
					System.out.println("The given number is not a Palindrome");
				}
			
int originalNumber, remainder, result = 0;
originalNumber = number;




while (originalNumber != 0)
{
remainder = originalNumber % 10;
result += Math.pow(remainder, 3);
originalNumber /= 10;

}
if(result == number)
System.out.println(number + " is an Armstrong number.");
else
System.out.println(number + " is not an Armstrong number.");


Prime p = new Prime();
p.doPrime();


}
}

 class Prime{
	void doPrime() {
		System.out.println();
		System.out.println("Printing Prime's between 1 to 100");
		for (int i=0;i<=100;i++) {
			if(i%2!=0) {
				System.out.println(i);
			}
		}
	}
}