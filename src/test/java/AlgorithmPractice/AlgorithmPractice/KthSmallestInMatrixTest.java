package AlgorithmPractice.AlgorithmPractice;

import static org.junit.Assert.*;

import org.junit.Test;

public class KthSmallestInMatrixTest {
	
	@Test
	public void singleRowFirstItem() {
		KthSmallestInMatrix calculator = new KthSmallestInMatrix();
		
		int[][] values = new int[][] {
			{1, 2}
		};
		int k = 1;
		
		int expected = 1;
		
		int actual = calculator.kthSmallest(values, k);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void singleRowLastItem() {
		KthSmallestInMatrix calculator = new KthSmallestInMatrix();
		
		int[][] values = new int[][] {
			{1, 2}
		};
		int k = 2;
		
		int expected = 2;
		
		int actual = calculator.kthSmallest(values, k);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void singleRowMiddleItem() {
		KthSmallestInMatrix calculator = new KthSmallestInMatrix();
		
		int[][] values = new int[][] {
			{1, 2, 3}
		};
		int k = 2;
		
		int expected = 2;
		
		int actual = calculator.kthSmallest(values, k);
		assertEquals(expected, actual);
		
	}

	@Test
	public void squareNormal() {
		KthSmallestInMatrix calculator = new KthSmallestInMatrix();
		
		int[][] values = new int[][] {
			{1, 2}, 
			{3, 4}
		};
		int k = 2;
		
		int expected = 2;
		
		int actual = calculator.kthSmallest(values, k);
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void largerSquare() {
		KthSmallestInMatrix calculator = new KthSmallestInMatrix();
		
		int[][] values = new int[][] {
			{1,3,5},
			{6,7,12},
			{11,14,14}
		};
		int k = 6;
		
		int expected = 11;
		
		int actual = calculator.kthSmallest(values, k);
		assertEquals(expected, actual);
		
	}
	
	
	

}
