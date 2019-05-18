package AlgorithmPractice.AlgorithmPractice;

import java.util.ArrayList;
import java.util.List;

/*
 * Problem: https://leetcode.com/problems/the-skyline-problem/
 * 
 */
public class SkylineProblem {
	
	private static final int LEFT = 0;
	private static final int RIGHT = 1;
	private static final int HEIGHT = 2;
	
	public List<int[]> getSkyline(int[][] buildings) {
		
		return getSkylineRecurse(0, buildings.length-1, buildings);
	}
	
	/*
	 * Recursively break down the skyline until it's at the smallest (And easiest!) problem
	 * Base case: 
	 *		- 1 building
	 *			- add the 
	 *		- 0 building (do nothing)
	 */
	private List<int[]> getSkylineRecurse(int low, int high, int[][] buildings) {
		List<int[]> skyline = new ArrayList<int[]>();
		
		if(low > high) {
			// no buildings! 
			return skyline;
		} else if (low == high) {
			// one building! 
			int[] building = buildings[low];
			
			// grab left most point, plus height, and right most point at 0. 
			int[] left = new int[] {building[LEFT], building[HEIGHT]};
			int[] right = new int[] {building[RIGHT], 0};
			
			skyline.add(left);
			skyline.add(right);
			return skyline;
			
		}
		
		return skyline;
		
		
	}
	
	
	
}













