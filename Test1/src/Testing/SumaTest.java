package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class SumaTest {

	@Test
	public void test() {
		TestOne test= new TestOne();
		int resulto= test.sumar(20, 30);
		assertEquals(50, resulto);
	}

}
