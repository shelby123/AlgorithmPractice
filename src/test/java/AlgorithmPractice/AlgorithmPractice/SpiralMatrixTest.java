package AlgorithmPractice.AlgorithmPractice;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class SpiralMatrixTest {

	@Test
	public void squareMatrix() {

		int[][] matrix = new int[][] {
			{ 1, 2, 3 },
			{ 4, 5, 6 },
			{ 7, 8, 9 }
		};
		
		Integer[] expected = new Integer[] {1,2,3,6,9,8,7,4,5};
		Integer[] actual = new Integer[9];
		
		List<Integer> res = SpiralMatrix.spiralOrder(matrix);
		assertEquals(9, res.size());
		System.out.println(res);
		
		for(int i = 0; i < actual.length; i++) {
			actual[i] = res.get(i);
		}
		
		assertArrayEquals(expected, actual);
	}

}
