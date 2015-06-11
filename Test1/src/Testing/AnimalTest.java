package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnimalTest {

	@Test
	public void test() {
		TestOne test= new TestOne();
		Animal resulto1 = test.mascota("dog", "macho", 20, 4);
		alumno resulto2= test.alumnos("Hector", "CW", 20);
		assertNotEquals(resulto1, resulto2);
	}

}
