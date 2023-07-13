
public class TernaryDemo {
		public static void main(String[] args) {
			
			//ternary operator - ?
			
			int i=10;
			String result=(i%2==0)?"even number....":"odd number...";
			System.out.println(result);
			
			String day="Tuesday";
			
			String stmt=(day.equalsIgnoreCase("monday"))?
					"first working day..":(day.equalsIgnoreCase("sunday")|| day.equalsIgnoreCase("saturday"))?
					"holiday....":(day.equalsIgnoreCase("friday"))?
					"holy day...":"normal working day..";
				
			System.out.println(stmt);
		}
	}