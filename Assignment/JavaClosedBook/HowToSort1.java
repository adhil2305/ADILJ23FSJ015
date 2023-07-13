
public class HowToSort1 {
	public static void main(String[] args) {
		int arr[] = {4,6,1,7};
		
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++) {
				int temp = 0;
				if(arr[j]<arr[i]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
				
			
			}
		System.out.print(arr[i] +" ");
		
		
	}
		System.out.println();
		
		for(int k=0;k<=4;k++) {
			System.out.print(k+" k ");
			for(int l=0;l<=4;l++) {
				System.out.print(l + " l ");
			}
		}
		
	}

}
