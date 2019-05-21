package AlgorithmPractice.AlgorithmPractice;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestCommonPrefixTest {

	@Test
	public void oneString() {
		String[] strings = new String[] {"hello"};
		String expected = "hello";
	
		LongestCommonPrefix lcp = new LongestCommonPrefix();
		String actual = lcp.longestCommonPrefix(strings);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void twoStringsSame() {
		String[] strings = new String[] {"a", "a"};
		String expected = "a";
	
		LongestCommonPrefix lcp = new LongestCommonPrefix();
		String actual = lcp.longestCommonPrefix(strings);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void twoStringsNoneSame() {
		String[] strings = new String[] {"abc", "def"};
		String expected = "";
	
		LongestCommonPrefix lcp = new LongestCommonPrefix();
		String actual = lcp.longestCommonPrefix(strings);
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void twoStringsPartialSame() {
		String[] strings = new String[] {"abc", "abd"};
		String expected = "ab";
	
		LongestCommonPrefix lcp = new LongestCommonPrefix();
		String actual = lcp.longestCommonPrefix(strings);
		
		assertEquals(expected, actual);
	}
	
	
	@Test
	public void twoStringsOneEmpty() {
		String[] strings = new String[] {"", "abd"};
		String expected = "";
	
		LongestCommonPrefix lcp = new LongestCommonPrefix();
		String actual = lcp.longestCommonPrefix(strings);
		
		assertEquals(expected, actual);
	}

}
