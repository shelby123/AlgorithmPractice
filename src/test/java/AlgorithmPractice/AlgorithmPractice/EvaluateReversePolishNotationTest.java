package AlgorithmPractice.AlgorithmPractice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class EvaluateReversePolishNotationTest {
	
	@Test
	public void testAdd() {
		String[] testArray = new String[] {"10", "6", "+"};
		
		int expected = 16;
		int actual = EvaluateReversePolishNotation.evalRPN(testArray);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testSubtract() {
		String[] testArray = new String[] {"10", "6", "-"};
		
		int expected = 4;
		int actual = EvaluateReversePolishNotation.evalRPN(testArray);
		assertEquals(expected, actual);
	}
	
	@Test
	public void testMultiply() {
		String[] testArray = new String[] {"10", "6", "*"};
		
		int expected = 60;
		int actual = EvaluateReversePolishNotation.evalRPN(testArray);
		assertEquals(expected, actual);
	}

	
	@Test
	public void testDivide() {
		String[] testArray = new String[] {"8", "2", "/"};
		
		int expected = 4;
		int actual = EvaluateReversePolishNotation.evalRPN(testArray);
		assertEquals(expected, actual);
	}

	
	
	@Test
	public void complexTest() {
		String[] testArray = new String[] {"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"};
		
		int expected = 22;
		int actual = EvaluateReversePolishNotation.evalRPN(testArray);
		assertEquals(expected, actual);
	}

}
