import org.junit.Assert;
import org.junit.jupiter.api.Test;


class StringCalculatorTest {

	@Test
	public void String_Calculator_Test() {
		StringCalculator cal = new StringCalculator();
		Assert.assertEquals(6, cal.add("1,2,3"), 0);
				
	}

}
