package AlgorithmPractice.AlgorithmPractice;

import java.util.ArrayList;
import java.util.List;

/*
 * Problem: https://leetcode.com/problems/container-with-most-water/ 
 * 
 */
public class ContainerWithMostWater {


	public int maxArea(int[] heights) {
		int left = 0;
		int right = heights.length - 1; 
		int maxArea = 0; 
		while(left < right) {
			int area = (right - left) * (Math.min(heights[left], heights[right]));
			if(area > maxArea) 
				maxArea = area;
			if(heights[left] < heights[right]) {
				left++;
			} else {
				right--;
			}
		}
		return maxArea;
	}
}
