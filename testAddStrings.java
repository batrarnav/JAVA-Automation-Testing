package jUnitTestingPackage;
//ARNAV BATRA
//E20CSE105
import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		jUnitFunction jUnit = new jUnitFunction();
		String result = jUnit.AddStrings("Jatin", "Rastogi");
		assertEquals("JatinRastogi", result);
	}

}
