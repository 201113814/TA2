package pe.edu.upc.dao;

import java.util.Vector;

import pe.edu.upc.bean.PersonaBean;


public interface PersonaDao {
	public boolean insertar(PersonaBean persona);
	public Vector<PersonaBean> listarTodos();
	public boolean borrar(String id);
	public PersonaBean obtenerid(int id);
}
