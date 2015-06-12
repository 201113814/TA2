package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import Beans.EmpleadoBean;

public class EmpleadoDaoImpl extends DAO implements EmpleadoDao {

	@Override
	public int ObtenerSueldo(int id) {
		EmpleadoBean empleado=null;
		try {
			Connection conexion = DAO.obtenerConexion();
			Statement stmt = conexion.createStatement();
			
			ResultSet rs =
					stmt.executeQuery("select * from empleado where id="+ id);
			
			if( rs.next() ){
				empleado = new EmpleadoBean();
				empleado.setId(rs.getInt("id") );
				empleado.setNombre(rs.getString("nombre"));
				empleado.setTipo(rs.getInt("tipo") );
				empleado.setSueldo(rs.getInt("sueldo") );
				
			}
		
			
			
			
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		return empleado.getSueldo();
	}

	@Override
	public EmpleadoBean obtenerid(int id) {
		EmpleadoBean empleado=null;
		try {
			Connection conexion = DAO.obtenerConexion();
			Statement stmt = conexion.createStatement();
			
			ResultSet rs =
					stmt.executeQuery("select * from empleado where id=" + id);
			
			if( rs.next() ){
				empleado = new EmpleadoBean();
				empleado.setId(rs.getInt("id") );
				empleado.setNombre(rs.getString("nombre"));
				empleado.setTipo(rs.getInt("tipo") );
				empleado.setSueldo(rs.getInt("sueldo") );
				
			}
		
			
			
			
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		
		return empleado;
	}

	@Override
	public boolean editar(EmpleadoBean empleado) {
boolean flag = false;
		
		try {
			Connection conexion = DAO.obtenerConexion();
			Statement stmt = conexion.createStatement();
			
			int filas = stmt.executeUpdate("update empleado "
					+ " set nombre='" + empleado.getNombre() + "',"
					+ " tipo='" + empleado.getTipo() + "',"
					+ " sueldo='" + empleado.getSueldo() + "'"
					+ " where id=" + empleado.getId() );

			conexion.close();
			
			if(filas==1){
				flag = true;
			}
		}catch (Exception e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}
		return flag;
	}

}


