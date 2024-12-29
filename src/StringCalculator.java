public class StringCalculator {
	int add(String input) {
		String[] s=input.split(","); //converting string separated by commas to array 
		int sum=0;//to store sum of all numbers
		for(int i = 0;i < s.length;i++) 
		{
		   sum += Integer.parseInt(s[i]);//adding integers after converting it to integer type
		}
		return sum;
	}
}
