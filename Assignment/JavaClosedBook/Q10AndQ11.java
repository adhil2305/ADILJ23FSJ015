
public class Q10AndQ11 {
		public static void main(String[] args) {
			
			byte row = 4;
			byte column =4;
			
			int[][] arr = new int[row][column];
			
		//	arr[0][0] = 1;
			//arr[0][1] = 2;
			
			System.out.println("Array Demo");
			
			int k =0;
			
			for (int i=0;i<row;i++) {
				for(int j=0;j<column;j++) {
				arr[i][j] = k;
				k++;
				}
			}
			for(int i=0;i<row;i++) {
				for (int j=0;j<column;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			
			for(int i=0;i<row;i++) {
				for(int j=0;j<i+1;j++) {					System.out.print(arr[i][j]+ " ");
				}
				System.out.println();
			}
		}
}
