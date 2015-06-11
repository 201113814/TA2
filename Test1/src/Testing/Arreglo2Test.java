package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class Arreglo2Test {

	@Test
	public void test() {
	TestOne test= new TestOne();
	int[] arreglo={4,3,2,1};
	int[] resulto= test.arreglo2(4);
	assertArrayEquals(arreglo,resulto);
	}

}
