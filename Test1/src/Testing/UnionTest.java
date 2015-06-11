package Testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class UnionTest {

	@Test
	public void testUnion() {
		
		TestOne test= new TestOne();
		String resulto= test.texto1("mundo", "hola");
		assertNotEquals("hola", resulto);
		
	}

}
