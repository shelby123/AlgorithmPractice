package AlgorithmPractice.AlgorithmPractice;

import java.util.PriorityQueue;

public class KthSmallestInMatrix {
	
	private class Position implements Comparable<Position> {
		public int row;
		public int col;
		public int val;
		
		
		
		public Position(int row, int col, int val) {
			super();
			this.row = row;
			this.col = col;
			this.val = val;
		}



		public int compareTo(Position o) {
			// TODO Auto-generated method stub
			return this.val-o.val;
		}
	}
	
	public int kthSmallest(int[][] matrix, int k) {
		boolean[][] evaluated = new boolean[matrix.length][matrix[0].length];
		
		PriorityQueue<Position> queue = new PriorityQueue<Position>();
		queue.add(new Position(0, 0, matrix[0][0]));
		int ct = 1;
		while(ct < k) {
			Position next = queue.remove();
			if(!evaluated[next.row][next.col]) {
				evaluated[next.row][next.col] = true;
				if(next.row+1 < matrix.length) {
					queue.add(new Position(next.row+1, next.col, matrix[next.row+1][next.col]));
				}
				if(next.col+1 < matrix[0].length) {
					queue.add(new Position(next.row, next.col+1, matrix[next.row][next.col+1]));
				}
				ct++;
			}
		}
		Position result = queue.remove();
		while(evaluated[result.row][result.col]) {
			result = queue.remove();
		}
		return result.val;
		
    }
}
