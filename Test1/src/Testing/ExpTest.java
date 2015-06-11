package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class ExpTest {

	@Test
	public void test() {

		TestOne test= new TestOne();
		int resulto= test.dividir(3, 0);
		assertEquals(resulto, 9);
	}

}
