package pe.edu.upc.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Vector;

import pe.edu.upc.bean.PersonaBean;


public class PersonaDaoImpl extends DAO implements PersonaDao {

	@Override
	public boolean insertar(PersonaBean persona) {
boolean flag = false;
		
		try {
			Connection conexion = DAO.obtenerConexion();
			Statement stmt = conexion.createStatement();
			
			int filas = stmt.executeUpdate("insert into persona "
			+ "(nombre,edad,dni) "
			+ "values ('"+persona.getNombre()+"','"+persona.getEdad()+"','"+persona.getDni()+"')");

			conexion.close();
			
			if(filas==1){
				flag = true;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}
		
		return flag;
	}

	@Override
	public Vector<PersonaBean> listarTodos() {
		Vector<PersonaBean> personas=new Vector<PersonaBean>();
		try
		{
		Connection con= DAO.obtenerConexion();
		Statement stmt= con.createStatement();
		ResultSet rs= stmt.executeQuery("select * from persona");
		PersonaBean persona=null;
		while(rs.next())
		{
			persona=new PersonaBean();
			persona.setId(rs.getInt("id"));
			persona.setNombre(rs.getString("nombre"));
			persona.setEdad(rs.getInt("edad"));
			persona.setDni(rs.getInt("dni"));
			personas.add(persona);
		}
		
		}catch(Exception E)
		{
			System.out.print(E.getMessage());
		}
		return personas;

	}

	@Override
	public boolean borrar(String id) {
		boolean flag=false;
		
		try {
			Connection con= DAO.obtenerConexion();
			Statement stmt= con.createStatement();
			
			int filas= stmt.executeUpdate("delete from persona where id=" + id);
			
			con.close();
			
			if(filas==1){
				flag = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
			System.out.print(e.getMessage());
		}
		return flag;
	}

	@Override
	public PersonaBean obtenerid(int id) {
		PersonaBean persona=null;
		try {
			Connection conexion = DAO.obtenerConexion();
			Statement stmt = conexion.createStatement();
			
			ResultSet rs =
					stmt.executeQuery("select * from persona where id=" + id);
			
			if( rs.next() ){
				persona = new PersonaBean();
				persona.setId(rs.getInt("id") );
				persona.setNombre(rs.getString("nombre"));
				persona.setEdad(rs.getInt("edad") );
				persona.setDni(rs.getInt("dni") );
				
			}
		
			
			
			
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}
		
		return persona;
	}

}