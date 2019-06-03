package AlgorithmPractice.AlgorithmPractice;

/*
 * Find the problem here: https://www.geeksforgeeks.org/number-days-tank-will-become-empty/
 * 
 */
public class NumberOfDaysEmptyTank {

	public int naiveSolution(int capacity, int dailyRefill) {
		int startingCap = capacity;
		int day = 1;
		while((capacity - day) > 0) {
			capacity -= day;
			capacity = (capacity + dailyRefill);
			if(capacity > startingCap) {
				capacity = startingCap;
			}
			day++;
		}
		return day;
		
	}
}
