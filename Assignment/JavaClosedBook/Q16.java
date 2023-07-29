public class Q16 {
	public static void main(String[] args) {
		int arr[] = {4,2,6,4};
		byte theNumberr = 4;
		byte howManyTimes = 0;
		
		for(int i:arr) {
			if(i==theNumberr) {
				System.out.println("The place value of 4 is "+i);
				howManyTimes++;
			}
		}
		
		System.out.println("The Number of times it occurs is " + howManyTimes
				);
		
	}

}
