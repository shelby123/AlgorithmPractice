package AlgorithmPractice.AlgorithmPractice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class LargestRectangleAreaTest {

	@Test
	public void singleRectangle() {
		int[] heights = new int[] {2};
		
		LargestRectangleArea lra = new LargestRectangleArea();
		
		int expected = 2;
		int actual = lra.largestRectangleArea(heights);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void twoRectangles() {
		int[] heights = new int[] {3, 2};
		
		LargestRectangleArea lra = new LargestRectangleArea();
		
		int expected = 4;
		int actual = lra.largestRectangleArea(heights);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void singleRectangleImpl2() {
		int[] heights = new int[] {2};
		
		LargestRectangleArea lra = new LargestRectangleArea();
		
		int expected = 2;
		int actual = lra.largestRectangleAreaImpl2(heights);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void twoRectanglesImpl2() {
		int[] heights = new int[] {3, 2};
		
		LargestRectangleArea lra = new LargestRectangleArea();
		
		int expected = 4;
		int actual = lra.largestRectangleAreaImpl2(heights);
		
		assertEquals(expected, actual);
		
	}

}
