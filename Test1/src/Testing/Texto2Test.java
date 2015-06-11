package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class Texto2Test {

	@Test
	public void test() {
		TestOne test= new TestOne();
	String resulto= test.texto2("hola", "hola");
	assertEquals("iguales", resulto);
	}

}
