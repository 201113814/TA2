package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exp2Test {

	@Test
	public void test() {
		TestOne test= new TestOne();
		String resulto= test.ingreso(-4,30);
		assertEquals("error",resulto);
	}

}
