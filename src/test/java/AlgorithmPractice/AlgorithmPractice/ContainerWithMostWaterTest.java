package AlgorithmPractice.AlgorithmPractice;

import static org.junit.Assert.*;

import org.junit.Test;

public class ContainerWithMostWaterTest {

	@Test
	public void simpleContainer() {
		int[] heights = new int[] {1, 1};
		int expected = 1;
		
		ContainerWithMostWater cmw = new ContainerWithMostWater();
		
		int actual = cmw.maxArea(heights);
		
		assertEquals(expected, actual);
		
	}
	
	
	@Test
	public void simpleContainer2() {
		int[] heights = new int[] {2, 1};
		int expected = 1;
		
		ContainerWithMostWater cmw = new ContainerWithMostWater();
		
		int actual = cmw.maxArea(heights);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void simpleContainer3() {
		int[] heights = new int[] {1, 2};
		int expected = 1;
		
		ContainerWithMostWater cmw = new ContainerWithMostWater();
		
		int actual = cmw.maxArea(heights);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void tallCenterWall() {
		int[] heights = new int[] {1, 4, 1};
		int expected = 2;
		
		ContainerWithMostWater cmw = new ContainerWithMostWater();
		
		int actual = cmw.maxArea(heights);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void longContainer() {
		int[] heights = new int[] {1, 0, 0, 0, 0, 1};
		int expected = 5;
		
		ContainerWithMostWater cmw = new ContainerWithMostWater();
		
		int actual = cmw.maxArea(heights);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void increasingContainer() {
		int[] heights = new int[] {1, 2, 3, 4};
		int expected = 4;
		
		ContainerWithMostWater cmw = new ContainerWithMostWater();
		
		int actual = cmw.maxArea(heights);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void decreasing() {
		int[] heights = new int[] {4, 3, 2, 1};
		int expected = 4;
		
		ContainerWithMostWater cmw = new ContainerWithMostWater();
		
		int actual = cmw.maxArea(heights);
		
		assertEquals(expected, actual);
		
	}
	
	@Test
	public void complex() {
		int[] heights = new int[] {2,3,4,5,18,17,6};
		int expected = 17;
		
		ContainerWithMostWater cmw = new ContainerWithMostWater();
		
		int actual = cmw.maxArea(heights);
		
		assertEquals(expected, actual);
		
	}

}













