package AlgorithmPractice.AlgorithmPractice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NumberOfDaysEmptyTankTest {
	
	@Test
	public void slowRefill() {
		int capacity = 4;
		int refill = 1;
		int expected = 3;
		
		NumberOfDaysEmptyTank tank = new NumberOfDaysEmptyTank();
		int actual = tank.naiveSolution(capacity, refill);
		
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void slowRefillHigherCap() {
		int capacity = 5;
		int refill = 1;
		int expected = 4;
		
		NumberOfDaysEmptyTank tank = new NumberOfDaysEmptyTank();
		int actual = tank.naiveSolution(capacity, refill);
		
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void noRefill() {
		int capacity = 4;
		int refill = 0;
		int expected = 3;
		
		NumberOfDaysEmptyTank tank = new NumberOfDaysEmptyTank();
		int actual = tank.naiveSolution(capacity, refill);
		
		
		assertEquals(expected, actual);
	}
	
	@Test
	public void overflow() {
		int capacity = 2;
		int refill = 2;
		int expected = 2;
		
		NumberOfDaysEmptyTank tank = new NumberOfDaysEmptyTank();
		int actual = tank.naiveSolution(capacity, refill);
		
		
		assertEquals(expected, actual);
	}

	@Test
	public void onlineExample() {
		int capacity = 5;
		int refill = 2;
		int expected = 4;
		
		NumberOfDaysEmptyTank tank = new NumberOfDaysEmptyTank();
		int actual = tank.naiveSolution(capacity, refill);
		
		
		assertEquals(expected, actual);
	}

}
