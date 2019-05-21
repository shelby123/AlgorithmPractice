package AlgorithmPractice.AlgorithmPractice;

public class LongestCommonPrefix {

	
	public String longestCommonPrefix(String[] strs) {
        // Simplest problem... One string has a longest prefix of itself! 
		
		String prefix = strs[0];
		for(int i = 1; i < strs.length; i++) {
			String next = strs[i];
			int charIndex = 0;
			while(charIndex < prefix.length() 
					&& charIndex < next.length()
					&& prefix.charAt(charIndex) == next.charAt(charIndex)) {
				charIndex++;
			}
			prefix = prefix.substring(0, charIndex);
		}
		return prefix;
        
    }
}
