package AlgorithmPractice.AlgorithmPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

/*
 * Problem: https://leetcode.com/problems/spiral-matrix/
 * 
 * Notes:
 * 	- Draw out the matrix and figure out the bounds
 *  - keeping track of direction, position, and boundaries was the trickiest. 
 *  
 * Analysis: 
 * 	- O(N^2) solution
 *  - Slow(er) memory access by jumping through array in this order
 * 
 */
public class SpiralMatrix {
	

	
	private static final int RIGHT = 0;
	private static final int BOTTOM = 1;
	private static final int LEFT = 2;
	private static final int TOP = 3;
	
	public static List<Integer> spiralOrder(int[][] matrix) {
		// boundaries are RIGHT, BOTTOM, LEFT, TOP
		int[] boundaries = new int[] {matrix[0].length-1, matrix.length-1, 0, 0};
		int[] boundaryChange = new int[] {-1, -1, 1, 1};
		int boundaryChangeIndex = TOP;
		
		// Define "direction". RIGHT, DOWN, LEFT, UP
		int[] rowChange = new int[] {0, 1, 0, -1};
		int[] colChange = new int[] {1, 0, -1, 0};
		int curDirection = 0;
		
		int curX = 0;
		// start one to the left of the matrix, corner case
		int curY = -1;
		
		List<Integer> result = new ArrayList<Integer>();
		
		while(boundaries[LEFT] <= boundaries[RIGHT] || 
					boundaries[BOTTOM] >= boundaries[TOP]) {

			// travel in one direction until the next spot is past the boundary
			while(inBounds(curX + rowChange[curDirection], curY + colChange[curDirection], boundaries)) {
				curX += rowChange[curDirection];
				curY += colChange[curDirection];
				
				result.add(matrix[curX][curY]);			
			}
			
			// update boundary
			boundaries[boundaryChangeIndex] += boundaryChange[boundaryChangeIndex];
			boundaryChangeIndex = (boundaryChangeIndex + 1) % 4;
			
			// change direction
			curDirection = (curDirection + 1)%4;
		}
		return result;
	}

	private static boolean inBounds(int row, int col, int[] boundaries) {
		return boundaries[LEFT] <= col && col <= boundaries[RIGHT] 
				&& boundaries[BOTTOM] >= row && row >= boundaries[TOP]; 
	}
}
