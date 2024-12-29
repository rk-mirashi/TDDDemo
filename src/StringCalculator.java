public class StringCalculator {
	int add(String input) {
		
		String[] nl=input.split("\n");//To handle new line in string
		int sum=0;//to store sum of all numbers
		String delimeter=nl[0].substring(nl[0].length()-1);//To handle different delimiters
		
		if (Character.isDigit(delimeter.charAt(0)))
		{
			delimeter=",";
		}
		
		for(int l=0;l<nl.length;l++) {
			 System.out.println(nl[l]); 
			String[] s=nl[l].split(delimeter); //converting string separated by commas to array 
			
			for(int i = 0;i < s.length;i++) 
			{
				if (Character.isDigit(s[i].charAt(0)))
				{
					sum += Integer.parseInt(s[i]);//adding integers after converting it to integer type
				}
			   
			}
		}
		return sum;
	}
}
