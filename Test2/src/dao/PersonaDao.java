package dao;

import java.util.Vector;

import Beans.PersonaBean;

public interface PersonaDao  {
	
	public boolean insertar(PersonaBean persona);
	public Vector<PersonaBean> listarTodos();
	public boolean borrar(String id);
	public PersonaBean obtenerid(int id);
}
