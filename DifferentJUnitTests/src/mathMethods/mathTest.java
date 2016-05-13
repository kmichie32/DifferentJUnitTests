package mathMethods;

import static org.junit.Assert.*;

import org.junit.Test;

public class mathTest {

	@Test
	public void test() {
		int three = Math.add(4, 5);
		assertEquals(9,three, 0);
		//assertEquals(Expected, Actual, Change threshold);
		//You can also do
		// assertEquals(Expected, Actual);
	}

}
