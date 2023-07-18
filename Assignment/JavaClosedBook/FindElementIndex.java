import java.util.Scanner;

public class FindElementIndex {
	public static void main(String[] args) {
		int[] arr = {5,1,4,6,7};
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the element of which you want to find the indices of :");
		int n = s.nextInt();
		s.close();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				System.out.println("The index of the element is "i);
			}
		}
		
	}

}
