package AlgorithmPractice.AlgorithmPractice;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MinimizeSumDigitArrayTest {
	
	@Before
	public void beforeEachTestCase() {
		
	}

	@Test
	public void evenNumbersTest() {
		int[] arr = new int[]{6, 8, 4, 5, 2, 3};
		
		int expected = 604;
		int actual = MinimizeSumOfDigitArray.minimizeSum(arr);
		System.out.println(actual);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void EvenNumbersTestWithZero() {
		int[] arr = new int[]{6, 8, 4, 5, 2, 3, 0};
		
		assertEquals(MinimizeSumOfDigitArray.minimizeSum(arr), 604);
	}

}
