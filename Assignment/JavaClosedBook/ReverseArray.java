public class ReverseArray {
	public static void main(String[] args) {
		
		
		        int arr[] = {1,4,2,7};
		        
		        int j = arr.length;

	        for(int i=0;i<arr.length-1;i++){	            int temp = 0;
	            temp = arr[j-1];
	            arr[j-1] = arr[i];
	            arr[i] = temp;
	            j = j-1;
	        }
	        for (int k:arr) {
	        System.out.println(k);
	        }
	    }
	}
	

