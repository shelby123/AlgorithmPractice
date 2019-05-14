package AlgorithmPractice.AlgorithmPractice;

import java.util.Stack;

import org.apache.commons.lang3.math.NumberUtils;

public class EvaluateReversePolishNotation {
	
	public static int evalRPN(String[] tokens) {
		Stack<String> s = new Stack<String>();
		for(String token : tokens) {
			if(NumberUtils.isNumber(token)) {
				s.push(token);
			} else {
				assert(s.size() >= 2);
				Integer rightNum = Integer.parseInt(s.pop());
				Integer leftNum = Integer.parseInt(s.pop());
				String res = "";
				if(token.equals("-")) {
					res = (leftNum - rightNum) + "";
				} else if (token.equals("+")) {
					res = (leftNum + rightNum) + "";
				} else if (token.equals("*")) {
					res = (leftNum * rightNum) + "";
				} else if (token.equals("/")) {
					res = (leftNum / rightNum) + "";
				}
				s.push(res);
			}
		}
		return Integer.parseInt(s.pop());
		 
	}

}
