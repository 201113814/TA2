package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class alumnoTest {

	@Test
	public void test() {

		TestOne test= new TestOne();
		alumno resulto= test.alumnos("maria", "segovia", 20);
		assertNotNull(resulto);
		
	}

}
