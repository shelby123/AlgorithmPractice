package AlgorithmPractice.AlgorithmPractice;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SkylineProblemTest {

	@Test
	public void noBuilding() {
		int[][] buildings = new int[][] {};
		
		List<int[]> expected = new ArrayList<int[]>();
		SkylineProblem p = new SkylineProblem();
		List<int[]> actual = p.getSkyline(buildings);
		
		assertEquals(expected.size(), actual.size());
		
		for(int i = 0; i < expected.size(); i++) {
			assertArrayEquals(expected.get(i), actual.get(i));
		}
	}
	
	@Test
	public void oneBuilding() {
		int[][] buildings = new int[][] {{1, 2, 3}};
		
		List<int[]> expected = new ArrayList<int[]>();
		expected.add(new int[] {1, 3});
		expected.add(new int[] {2, 0});
		
		
		SkylineProblem p = new SkylineProblem();
		List<int[]> actual = p.getSkyline(buildings);
		
		assertEquals(expected.size(), actual.size());
		
		for(int i = 0; i < expected.size(); i++) {
			assertArrayEquals(expected.get(i), actual.get(i));
		}
	}
	
	@Test
	public void twoDistinctBuildings() {
		int[][] buildings = new int[][] {{1, 2, 3}, {3, 4, 3}};
		
		List<int[]> expected = new ArrayList<int[]>();
		expected.add(new int[] {1, 3});
		expected.add(new int[] {2, 0});
		expected.add(new int[] {3, 3});
		expected.add(new int[] {4, 0});
		
		
		SkylineProblem p = new SkylineProblem();
		List<int[]> actual = p.getSkyline(buildings);
		
		assertEquals(expected.size(), actual.size());
		
		for(int i = 0; i < expected.size(); i++) {
			assertArrayEquals(expected.get(i), actual.get(i));
		}
	}
	
	@Test
	public void twoBuildingSimpleOverLap() {
		int[][] buildings = new int[][] {{1, 3, 1}, {2, 4, 2}};
		
		List<int[]> expected = new ArrayList<int[]>();
		expected.add(new int[] {1, 1});
		expected.add(new int[] {2, 2});
		expected.add(new int[] {4, 0});
		
		
		SkylineProblem p = new SkylineProblem();
		List<int[]> actual = p.getSkyline(buildings);
		
		assertEquals(expected.size(), actual.size());
		
		for(int i = 0; i < expected.size(); i++) {
			assertArrayEquals(expected.get(i), actual.get(i));
		}
	}
	
	@Test
	public void twoBuildingsSameStart() {
		int[][] buildings = new int[][] {{1, 2, 1}, {1, 3, 2}};
		
		List<int[]> expected = new ArrayList<int[]>();
		expected.add(new int[] {1, 2});
		expected.add(new int[] {3, 0});
		
		
		SkylineProblem p = new SkylineProblem();
		List<int[]> actual = p.getSkyline(buildings);
		
		assertEquals(expected.size(), actual.size());
		
		for(int i = 0; i < expected.size(); i++) {
			assertArrayEquals(expected.get(i), actual.get(i));
		}
	}
	

}
