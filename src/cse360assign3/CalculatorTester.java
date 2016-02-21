package cse360assign3;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTester {

	@Test
	public void testCalculator() {
		Calculator ti84 = new Calculator();
		
		assertNotEquals(ti84, null);
	}

	
	@Test
	public void getTotal() {
		Calculator ti84 = new Calculator();
		
		assertEquals(ti84.getTotal(), 0);
	}
	
	@Test 
	public void add() {
		Calculator ti84 = new Calculator();
		ti84.add(5);
		ti84.add(6);
		
		assertEquals(ti84.getTotal(), 11);
	}
	
	@Test
	public void subtract() {
		Calculator ti84 = new Calculator();
		ti84.subtract(6);
		
		assertEquals(ti84.getTotal(), -6);
	}
	
	@Test
	public void multiply () {
		Calculator ti84 = new Calculator();
		ti84.multiply(5);
		ti84.add(5);
		ti84.multiply(5);
		
		assertEquals(ti84.getTotal(), 25);
	}
	
	@Test
	public void divide () {
		Calculator ti84 = new Calculator();
		ti84.add(20);
		ti84.divide(0);
		
		assertEquals(ti84.getTotal(), 0);
	}
	
	public void divide1 () {
		Calculator ti84 = new Calculator();
		ti84.add(20);
		ti84.divide(6);
		
		assertEquals(ti84.getTotal(), 3);
	}
	
	@Test
	public void getHistory () {
		Calculator ti84 = new Calculator();
		
		assertEquals(ti84.getHistory(), "");
	}
	
	
}
