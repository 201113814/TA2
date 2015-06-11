package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplicarTest {

	@Test
	public void test() {
		TestOne test= new TestOne();
		int resulto= test.multiplicarDif(2, 2);
		assertNotEquals(0, resulto);
	}

}
