package pe.edu.upc.test;

import static org.junit.Assert.*;

import org.junit.Test;

import pe.edu.upc.bean.EmpleadoBean;
import pe.edu.upc.bean.PersonaBean;
import pe.edu.upc.dao.DAO;
import pe.edu.upc.dao.EmpleadoDao;
import pe.edu.upc.dao.PersonaDao;


public class FuncionesBDTest {

	@Test
	public void testListaPersonas() {
		
		
		assertEquals(7, DAO.getPersonaDao().listarTodos().size());
	}
	
	@Test
	public void testIngresarPersona() {
		
		PersonaDao personaDao=DAO.getPersonaDao();
		int num=personaDao.listarTodos().size();
		PersonaBean persona1= new PersonaBean();
		persona1.setNombre("Persona2");
		persona1.setEdad(21);
		persona1.setDni(73374734);
		personaDao.insertar(persona1);
		
		assertEquals(num+1, personaDao.listarTodos().size());
	}

	@Test
	public void testGetPersona() {
		
		PersonaDao PersonaDao=DAO.getPersonaDao();
		PersonaBean persona1= PersonaDao.obtenerid(2);

		assertNotNull(persona1);
	}
	
	@Test
	public void testxBorrarPersona() {
		
		PersonaDao PersonaDao=DAO.getPersonaDao();
		int num=PersonaDao.listarTodos().size();
		PersonaDao.borrar("56");
		
		assertEquals(num-1, DAO.getPersonaDao().listarTodos().size());
	}
	
	@Test
	public void testxSueldoEmpleado() {
		int num=1;
		
		EmpleadoDao EmpleadoDao=DAO.getEmpleadoaDao();
		int sueldo=EmpleadoDao.ObtenerSueldo(num);
		EmpleadoBean empleado1= EmpleadoDao.obtenerid(num);
		
		if(empleado1.getTipo()==1){
			assertEquals(20, sueldo);
		}
		else
			if(empleado1.getTipo()==0)
		{
			assertEquals(50, sueldo);
		}
	}
	
	@Test
	public void testEditarEmpleado() {
		
		EmpleadoDao empleadodao=DAO.getEmpleadoaDao();
		EmpleadoBean empleado1= new EmpleadoBean();
		empleado1.setId(1);
		empleado1.setNombre("Empleado3");
		empleado1.setTipo(1);
		empleado1.setSueldo(20);
		
	    boolean resulto=empleadodao.editar(empleado1);
		
		assertTrue(resulto);
	}

}
