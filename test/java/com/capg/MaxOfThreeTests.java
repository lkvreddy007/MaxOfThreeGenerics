package com.capg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MaxOfThreeTests {

	@Test
	public void givenMaxIntegerInFirstPos_WhenProper_ShouldReturnTrue() {
		Integer n=new MaxOfThree().findMax(5, 2, 3);
		Assert.assertEquals((Integer)5, n);
	}
	
	@Test
	public void givenMaxIntegerInSecondPos_WhenProper_ShouldReturnTrue() {
		Integer n=new MaxOfThree().findMax(2, 5, 3);
		Assert.assertEquals((Integer)5, n);
	}
	
	@Test
	public void givenMaxIntegerInThirdPos_WhenProper_ShouldReturnTrue() {
		Integer n=new MaxOfThree().findMax(2, 3, 5);
		Assert.assertEquals((Integer)5, n);
	}
	
	@Test
	public void givenMaxFloatInFirstPos_WhenProper_ShouldReturnTrue() {
		Float n=new MaxOfThree().findMax(5.6f, 2.5f, 3.4f);
		Assert.assertEquals((Float)5.6f, n);
	}
	
	@Test
	public void givenMaxFloatInSecondPos_WhenProper_ShouldReturnTrue() {
		Float n=new MaxOfThree().findMax(2.5f, 5.6f, 3.4f);
		Assert.assertEquals((Float)5.6f, n);
	}
	
	@Test
	public void givenMaxFloatInThirdPos_WhenProper_ShouldReturnTrue() {
		Float n=new MaxOfThree().findMax(2.5f, 3.4f, 5.6f);
		Assert.assertEquals((Float)5.6f, n);
	}
	
	@Test
	public void givenMaxStringInFirstPos_WhenProper_ShouldReturnTrue() {
		String n=new MaxOfThree().findMax("Peach", "Apple", "Banana");
		Assert.assertEquals("Peach", n);
	}
	
	@Test
	public void givenMaxStringInSecondPos_WhenProper_ShouldReturnTrue() {
		String n=new MaxOfThree().findMax("Apple", "Peach", "Banana");
		Assert.assertEquals("Peach", n);
	}
	
	@Test
	public void givenMaxStringInThirdPos_WhenProper_ShouldReturnTrue() {
		String n=new MaxOfThree().findMax("Apple", "Banana", "Peach");
		Assert.assertEquals("Peach", n);
	}
}
