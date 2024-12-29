import org.junit.Assert;
import org.junit.jupiter.api.Test;


class StringCalculatorTest {

	@Test
	public void String_Calculator_Test() {
		StringCalculator cal = new StringCalculator();
		Assert.assertEquals(6, cal.add("1,2,3"), 0); //added case to check comma separated numbers
		Assert.assertEquals(6, cal.add("1\n2,3"), 0); //added case to check new line and comma separated numbers
		Assert.assertEquals(3, cal.add("//;\n1;2"), 0);//added case to check different delimiters
		Assert.assertEquals(0, cal.add("//;\n-1;-2"), 0);//added case to check different delimiters
	}

}
