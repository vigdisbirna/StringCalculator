package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
	
	
	@Test
	public void testEmptyString() {
		assertEquals(0, Calculator.add("")); 
	}

	@Test 
	public void testSimpleAdd(){
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void testAdd() {
		assertEquals(7, Calculator.add("2,1,2,2")); 
	}

	@Test
	public void testTwoSplitters(){
		assertEquals(8, Calculator.add("2\n4,2"));
	}

	@Test
	public void TestNegative(){
		try{

		Calculator.add("-1, 3,-2");
	    }catch(Exception e){

	    }
	}

	@Test
	public void testAddOverThousand() {
		assertEquals(10, Calculator.add("10,1001")); 
	}

	@Test 
	public void testDelimeter() {
		assertEquals(10, Calculator.add("//;\n4;6"));
	}

}
