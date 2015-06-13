package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

import pe.edu.upc.bean.alumno;

public class NullTest {

	@Test
	public void test() {
		TestOne test= new TestOne();
		alumno resulto= test.operacion(10);
		assertNull(resulto);
	}

}
