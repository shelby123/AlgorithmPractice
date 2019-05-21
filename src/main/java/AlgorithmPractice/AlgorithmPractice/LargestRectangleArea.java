package AlgorithmPractice.AlgorithmPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
 * problem: https://leetcode.com/problems/largest-rectangle-in-histogram/
 */
public class LargestRectangleArea {
	
	
	public int largestRectangleArea(int[] heights) {
		
		// maintain a list of previous areas, based on height
		List<Integer> previousAreas = new ArrayList<Integer>();
		int curMax = 0;
		
		for(int i = 0; i < heights.length; i++) {
			List<Integer> myAreas = new ArrayList<Integer>();
			int myMax = heights[i];
			for(int height = 1; height <= heights[i]; height++) {
				int maxAtHeight = height;
				if(height <= previousAreas.size())
					maxAtHeight = height + previousAreas.get(height-1);
				if(myMax < maxAtHeight)
					myMax = maxAtHeight;
				myAreas.add(maxAtHeight);
			}
			if(curMax < myMax)
				curMax = myMax;
			previousAreas = myAreas;
		}
		return curMax;
	}
	

	public int largestRectangleAreaImpl2(int[] heights) {
		
		// maintain a stack of heights that we've seen
		Stack<Integer> heightStack = new Stack<Integer>();
		// maintain a corresponding stack of positions where the heights were seen
		Stack<Integer> positionStack = new Stack<Integer>();
		heightStack.push(0);
		positionStack.push(-1);
		
		int maxArea = 0;
		int curHeight = 0;
		
		for(int curPos = 0; curPos < heights.length; curPos++) {
			int heightOnStack = heightStack.peek();
			if(heights[curPos] > heightOnStack) {
				// this position i could potentially be the start of a new largest rectangle... push!
				heightStack.push(heights[curPos]);
				positionStack.push(curPos);
				curHeight = heights[curPos];
			} else {
				// Tricky bit! We just went down in height
				
				// calculate the height of the largest area starting at the height on the stack. 
				int newHeight = heights[curPos];
				int oldPos = positionStack.peek();
				while(newHeight < heightOnStack) {
					oldPos = positionStack.pop();
					int width = curPos - oldPos;
					int height = heightStack.pop();
					
					int area = width * height;
					if(area > maxArea) {
						maxArea = area;
					}
					heightOnStack = heightStack.peek();
				}
				if(heightStack.peek() != heights[curPos]) {
					heightStack.push(heights[curPos]);
					positionStack.push(oldPos);
				}
			}
		}
		int curPos = heights.length;
		while(!heightStack.isEmpty()) {
			int oldPos = positionStack.pop();
			int width = curPos - oldPos;
			int height = heightStack.pop();
			
			int area = width * height;
			if(area > maxArea) {
				maxArea = area;
			}
		}
		
		return maxArea;
	}
}










