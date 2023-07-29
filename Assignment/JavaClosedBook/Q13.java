public class Q13 {
	public static void main(String[] args) {
		int[][] brr = {{95,80,92,81,99},
					   {90,82,96,98,99},
					   {89,96,93,76,91},
					   {95,89,91,90,96}};
		
		for(int i=0;i<4;i++) {
			int temp = 0;

			for(int j=0;j<5;j++) {
				temp = brr[i][j] + temp;
				
			}
			System.out.println("The Average of student "+i+" is "+temp);
		}
		
		
		
		
		
		
	}

}
