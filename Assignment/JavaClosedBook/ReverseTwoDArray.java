
public class ReverseTwoDArray {
	public static void main(String[] args) {
		
		int[][] inTwoDArray = {{12,54,65,78},
						       {45,77,86,73},
						       {58,12,51,55},
						       {56,45,77,16}};
	
		 
		       for (int i = 0; i < inTwoDArray.length; i++)
		       {	int left = 0;
		       		int right = inTwoDArray[0].length - 1;
		    	   
		       			while(left<right) {
		       				int temp = inTwoDArray[i][left];
		       				inTwoDArray[i][left] = inTwoDArray[i][right];
		       				inTwoDArray[i][right] = temp;
		       				left++;
		       				right--;
		       			}
		       }
		       
	        for (int k = 0; k < inTwoDArray.length; k++) {
	        		
	            for (int l = 0; l < inTwoDArray.length; l++) {
	            	
	                System.out.print(inTwoDArray[k][l] + " ");
	    }
    System.out.println();
    }
		    }
		}
