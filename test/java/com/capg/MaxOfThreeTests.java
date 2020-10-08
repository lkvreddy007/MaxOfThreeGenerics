package com.capg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MaxOfThreeTests {

	@Test
	public void givenMaxIntegerInFirstPos_WhenProper_ShouldReturnTrue() {
		Integer n=new MaxOfThree<Integer>(5, 2, 3).findMax();
		Assert.assertEquals((Integer)5, n);
	}
	
	@Test
	public void givenMaxIntegerInSecondPos_WhenProper_ShouldReturnTrue() {
		Integer n=new MaxOfThree<Integer>(2, 5, 3).findMax();
		Assert.assertEquals((Integer)5, n);
	}
	
	@Test
	public void givenMaxIntegerInThirdPos_WhenProper_ShouldReturnTrue() {
		Integer n=new MaxOfThree<Integer>(2, 3, 5).findMax();
		Assert.assertEquals((Integer)5, n);
	}
	
	@Test
	public void givenMaxFloatInFirstPos_WhenProper_ShouldReturnTrue() {
		Float n=new MaxOfThree<Float>(5.6f, 2.5f, 3.4f).findMax();
		Assert.assertEquals((Float)5.6f, n);
	}
	
	@Test
	public void givenMaxFloatInSecondPos_WhenProper_ShouldReturnTrue() {
		Float n=new MaxOfThree<Float>(2.5f, 5.6f, 3.4f).findMax();
		Assert.assertEquals((Float)5.6f, n);
	}
	
	@Test
	public void givenMaxFloatInThirdPos_WhenProper_ShouldReturnTrue() {
		Float n=new MaxOfThree<Float>(2.5f, 3.4f, 5.6f).findMax();
		Assert.assertEquals((Float)5.6f, n);
	}
	
	@Test
	public void givenMaxStringInFirstPos_WhenProper_ShouldReturnTrue() {
		String n=new MaxOfThree<String>("Peach", "Apple", "Banana").findMax();
		Assert.assertEquals("Peach", n);
	}
	
	@Test
	public void givenMaxStringInSecondPos_WhenProper_ShouldReturnTrue() {
		String n=new MaxOfThree<String>("Apple", "Peach", "Banana").findMax();
		Assert.assertEquals("Peach", n);
	}
	
	@Test
	public void givenMaxStringInThirdPos_WhenProper_ShouldReturnTrue() {
		String n=new MaxOfThree<String>("Apple", "Banana", "Peach").findMax();
		Assert.assertEquals("Peach", n);
	}
}
