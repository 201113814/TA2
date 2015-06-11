package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalificacionTest {

	@Test
	public void test() {
		TestOne test= new TestOne();
		boolean resulto= test.calificacion(10);
		assertEquals(false, resulto);
	}

}
