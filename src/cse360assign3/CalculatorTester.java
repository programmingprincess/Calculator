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
	public void getTotal1() {
		Calculator ti84 = new Calculator();
		ti84.divide(0);
		ti84.multiply(4);
		ti84.subtract(2);
		ti84.add(1);
		
		assertEquals(ti84.getTotal(), -1);
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
		ti84.subtract(8);
		
		assertEquals(ti84.getTotal(), -14);
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
	public void multiply1 () {
		Calculator ti84 = new Calculator();
		ti84.multiply(5);
		ti84.add(5);
		ti84.multiply(3);
		
		assertEquals(ti84.getTotal(), 15);
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
		ti84.add(4);
		ti84.subtract(2);
		ti84.multiply(2);
		ti84.add(5);
		
		
		assertEquals(ti84.getHistory(""), "0 + 4 - 2 * 2 + 5");
	}
	
	
}
