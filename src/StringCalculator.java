public class StringCalculator {
	int add(String input) {
		String[] nl=input.split("\n");
		int sum=0;//to store sum of all numbers
		for(int l=0;l<nl.length;l++) {
			
			String[] s=nl[l].split(","); //converting string separated by commas to array 
			
			for(int i = 0;i < s.length;i++) 
			{
			   sum += Integer.parseInt(s[i]);//adding integers after converting it to integer type
			}
		}
		return sum;
	}
}
