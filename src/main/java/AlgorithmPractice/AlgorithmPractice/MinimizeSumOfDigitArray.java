package AlgorithmPractice.AlgorithmPractice;

import java.util.Arrays;

public class MinimizeSumOfDigitArray {
	
	public static int minimizeSum(int[] array) {
		Arrays.sort(array);
		String numA = "";
		String numB = "";
		int numDigits = array.length;
		if(array[0] == 0)
			numDigits--;
		int startIndex = array[0]== 0 ? 1 : 0;
		if(numDigits%2 == 0) {
			boolean numATurn = true;
			for(int i = startIndex ; i < array.length; i++) {
				if(numATurn) {
					numA += array[i];
				} else 
					numB += array[i];
			}
		} else {
			int endIndex = array[0]== 0 ? numDigits/2 + 1 : numDigits/2;
			for(int i = startIndex; i < endIndex; i++) {
				numA += array[i];
			}
			for(int i = endIndex; i < array.length; i++) {
				numB += array[i];
			}
		}
		int results = Integer.parseInt(numA) + Integer.parseInt(numB);
		return results;
	}

}
