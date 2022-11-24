package com.Example.Junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertClassProgram {
	@Test
	public void assertEg(){
		assertEquals(5,5);
	}
	
	@Test
	public void testassertNotNull(){
		assertNotEquals(2,7);
	}
	
	@Test
	public void testAssertNull(){
		assertNull(null);
	}
	
	@Test
	public void testAssertNotNull(){
		assertNotNull("somu");
	}
	
	@Test
	public void assertCheckTrue(){
		boolean val=7!=8;
		assertTrue(val);
	}
	
	@Test
	public void testCheckFalse(){
		boolean val1=8==6;
		assertFalse(val1);
	}
	
	@Test
	public void testAssertSame(){
		assertSame("somu","somu");
	}
	
	@Test
	public void testAssertNotSame(){
		assertNotSame("somu","sundaram");
	}
	
	@Test
	public void testArrayEquals(){
		int[] num1={5,4,3};
		int[] num2={5,4,3};
		
		assertArrayEquals(num1,num2);
	}
}
