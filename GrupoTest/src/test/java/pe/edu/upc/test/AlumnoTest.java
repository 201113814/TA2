package pe.edu.upc.test;

import static org.junit.Assert.*;

import org.junit.Test;

import pe.edu.upc.bean.Alumno;

public class AlumnoTest {

	@Test
	public void test() {

		TestOne test= new TestOne();
		Alumno resulto= test.alumnos("maria", "segovia", 20);
		assertNotNull(null);
		
	}

}
