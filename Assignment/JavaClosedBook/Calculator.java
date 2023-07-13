

public class Calculator {
	public int add(int i, int j) {
		if(i<0) {
			i=0;
		}
		if(j<0) {
			j=10;
		}
		if(j==0) {
			j=1;
		}
		return i+j;
	}

}
