package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	
	
	@Test
	public void testEmptyString() {
		assertEquals(7, Calculator.add("2,1,2,2")); 
	}



}
