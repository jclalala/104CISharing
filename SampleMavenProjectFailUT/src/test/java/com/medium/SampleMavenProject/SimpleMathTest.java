package com.medium.SampleMavenProject;

import org.junit.Assert;
import org.junit.Test;

public class SimpleMathTest {

	@Test
	public void test() {
		SimpleMath smt = new SimpleMath();
		int summedValue = smt.sum(1, 1);

	
		// purposely fail Ut
		Assert.assertEquals(1, summedValue);
	}

}
