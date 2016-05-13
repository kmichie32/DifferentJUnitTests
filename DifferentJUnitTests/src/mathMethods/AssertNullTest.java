package mathMethods;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertNullTest {

	@Test
	public void test() {
		ArrayList b = NullPoint.initializer(0);
		assertNull(b);
	}

}
