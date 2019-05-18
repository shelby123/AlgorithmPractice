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
	private static final int HEIGHT_ = 2;

	private static final int X = 0;
	private static final int HEIGHT = 1;
	
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
			int[] left = new int[] {building[LEFT], building[HEIGHT_]};
			int[] right = new int[] {building[RIGHT], 0};
			
			skyline.add(left);
			skyline.add(right);
			return skyline;
		} else {
			// more than one building! 
			// get the skyline from the buildings on the left
			int mid = (low + high) / 2;
			List<int[]> leftSkyline = getSkylineRecurse(low, mid, buildings);
			List<int[]> rightSkyline = getSkylineRecurse(mid + 1, high, buildings);
			
			// merge the two skylines and return the result
			return mergeSkylines(leftSkyline, rightSkyline);
		}
	}

	private List<int[]> mergeSkylines(List<int[]> leftSkyline, List<int[]> rightSkyline) {
		List<int[]> result = new ArrayList<int[]>();
		
		// track what the previous height we saw was
		int previousHeightLeft = 0;
		int previousHeightRight = 0;
		
		int[] selectedPoint = null;
		int leftIndex = 0;
		int rightIndex = 0;
		while(leftIndex < leftSkyline.size() || rightIndex < rightSkyline.size()) {
			if(leftIndex == leftSkyline.size()) {
				selectedPoint = rightSkyline.get(rightIndex);
				result.add(selectedPoint);
				rightIndex++;
			} else if (rightIndex == rightSkyline.size()) {
				selectedPoint = leftSkyline.get(leftIndex);
				result.add(selectedPoint);
				leftIndex++;
			} else {
				int[] leftPoint = leftSkyline.get(leftIndex);
				int[] rightPoint = rightSkyline.get(rightIndex);
				if(leftPoint[X] < rightPoint[X]) {
					selectedPoint = leftPoint;
					previousHeightLeft = selectedPoint[HEIGHT];
					if(selectedPoint[HEIGHT] <  previousHeightRight) {
						selectedPoint[HEIGHT] = previousHeightRight;
					} 
					result.add(selectedPoint);
					leftIndex++;
				} else if (leftPoint[X] > rightPoint[X]) {
					selectedPoint = rightPoint;
					previousHeightRight = selectedPoint[HEIGHT];
					if(selectedPoint[HEIGHT] <  previousHeightLeft) {
						selectedPoint[HEIGHT] = previousHeightLeft;
					} 
					result.add(selectedPoint);
					rightIndex++;
				} else {
					// just add the highest point and advance both indices.
					selectedPoint = leftPoint[HEIGHT] > rightPoint[HEIGHT] ? leftPoint : rightPoint;
					previousHeightRight = rightPoint[HEIGHT];
					previousHeightLeft = leftPoint[HEIGHT];
					rightIndex++;
					leftIndex++;
					result.add(selectedPoint);
				}
			}
		}
		
		result = removeRedundancies(result);
		return result;
	}

	private List<int[]> removeRedundancies(List<int[]> result) {
		List<int[]> cleanList = new ArrayList<int[]>();
		int[] cur = result.get(0);
		cleanList.add(cur);
		for(int i = 1; i < result.size(); i++) {
			int[] next = result.get(i);
			if(cur[HEIGHT] != next[HEIGHT]) {
				cleanList.add(next);
				cur = next;
			}
		}
		return cleanList;
		
	}
	
	
	
}













