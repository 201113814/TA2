package pe.edu.upc.test;

import static org.junit.Assert.*;

import org.junit.Test;

import pe.edu.upc.bean.Alumno;
import pe.edu.upc.bean.Animal;


public class FuncionesTest {

	@Test
	public void arreglos1test() {
		TestOne test= new TestOne();
		int[]suma={9,12};
		int[] resulto= test.arreglo1();
		assertArrayEquals(suma, resulto);
	}
	
	@Test
	public void Alumnostest() {

		TestOne test= new TestOne();
		Alumno resulto= test.alumnos("maria", "segovia", 20);
		assertNotNull(resulto);
		
	}
	
	@Test
		public void Uniontest() {
			
			TestOne test= new TestOne();
			String resulto= test.texto1("mundo", "hola");
			assertNotEquals("hola", resulto);
			
		}
	
	@Test
	public void Texto2test() {
		TestOne test= new TestOne();
	String resulto= test.texto2("hola", "hola");
	assertEquals("iguales", resulto);
	}
	

	@Test
	public void sumartest() {
		TestOne test= new TestOne();
		int resulto= test.sumar(20, 30);
		assertEquals(50, resulto);
	}
	
	@Test
		public void nulltest() {
			TestOne test= new TestOne();
			Alumno resulto= test.operacion(10);
			assertNull(resulto);
		}
	
	@Test
	public void multiplicartest() {
		TestOne test= new TestOne();
		int resulto= test.multiplicarDif(2, 2);
		assertNotEquals(0, resulto);
	}
	
	@Test(expected=Exception.class)
	public void Exptest() {

		TestOne test= new TestOne();
		test.dividir(3, 0);
	}
	
	@Test (expected=ArrayIndexOutOfBoundsException.class)
		public void Exp2test() {
		
		
			TestOne test= new TestOne();
			 test.ingreso(-4,30);
		}
	
	@Test
	public void Calificaciontest() {
		TestOne test= new TestOne();
		boolean resulto= test.calificacion(10);
		assertEquals(false, resulto);
	}
	
	@Test
		public void Arreglo2test() {
		TestOne test= new TestOne();
		int[] arreglo={4,3,2,1};
		int[] resulto= test.arreglo2(4);
		assertArrayEquals(arreglo,resulto);
	}
	
	@Test
		public void Animaltest() {
			TestOne test= new TestOne();
				Animal resulto1 = test.mascota("dog", "macho", 20, 4);
				Alumno resulto2= test.alumnos("Hector", "CW", 20);
				assertNotEquals(resulto1, resulto2);
			}	
	

}
