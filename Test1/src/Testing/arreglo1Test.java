package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class arreglo1Test {

	@Test
	public void test() {
		TestOne test= new TestOne();
		int[]suma={9,12};
		int[] resulto= test.arreglo1();
		assertArrayEquals(suma, resulto);
	}

}
