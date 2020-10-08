package com.capg;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

class MaxOfThreeTests {

	@Test
	public void givenMaxInFirstPos_WhenProper_ShouldReturnTrue() {
		Integer n=new MaxOfThree().findMax(5, 2, 3);
		Assert.assertEquals((Integer)5, n);
	}
	
	@Test
	public void givenMaxInSecondPos_WhenProper_ShouldReturnTrue() {
		Integer n=new MaxOfThree().findMax(2, 5, 3);
		Assert.assertEquals((Integer)5, n);
	}
	
	@Test
	public void givenMaxInThirdPos_WhenProper_ShouldReturnTrue() {
		Integer n=new MaxOfThree().findMax(2, 3, 5);
		Assert.assertEquals((Integer)5, n);
	}
}
