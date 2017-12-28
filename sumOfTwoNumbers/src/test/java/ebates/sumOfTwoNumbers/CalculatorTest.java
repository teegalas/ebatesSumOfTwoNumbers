package ebates.sumOfTwoNumbers;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.DataProvider;

public class CalculatorTest {

	/**
	 * Test Data provider method with two integers and expected sum
	 * 
	 * @return
	 */
	@DataProvider
	public Object[][] testData() {
		return new Object[][] { new Object[] { 1, 1, 2 }, new Object[] { 2, 6, 8 }, new Object[] { 20, 42, 62 },
				new Object[] { 12, 14, 26 }, new Object[] { 0, 0, 0 } };
	}

	/**
	 * Tests the sumOfTwoNumbers method.
	 * 
	 * @param firstNumber, first integer test data
	 * @param secondNumber, second integer test data
	 * @param expectedSum, expected sum of firstNumber and secondNumber
	 */
	@Test(dataProvider = "testData")
	public void sumofTwoNumberTest(Integer firstNumber, Integer secondNumber, Integer expectedSum) {
		Integer actualSum = Calculator.sumOfTwoNumbers(firstNumber, secondNumber);
		assertEquals(actualSum, expectedSum);
	}

}
