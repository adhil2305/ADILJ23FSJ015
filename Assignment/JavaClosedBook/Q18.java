public class Q18 {
	public static void main(String[] args) {
	
		 String values[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
	       int number=453;
	       String num=Integer.toString(number);
	       for(int i=0;i<num.length();i++)
	           {
	           char index=num.charAt(i);
	            System.out.print(values[Character.getNumericValue(index)]);
	}
		
		
	}
	}
