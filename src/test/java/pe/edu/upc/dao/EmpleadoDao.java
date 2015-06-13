package pe.edu.upc.dao;

import pe.edu.upc.bean.EmpleadoBean;


public interface EmpleadoDao {
	public int ObtenerSueldo(int id);
	public EmpleadoBean obtenerid(int id);
	public boolean editar(EmpleadoBean	empleado);

}
