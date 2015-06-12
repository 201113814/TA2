import dao.DAO;
import dao.PersonaDao;
import Beans.PersonaBean;


public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
		PersonaDao PersonaDao=DAO.getPersonaDao();
		PersonaBean persona1= PersonaDao.obtenerid(1);

		System.out.println("ID"+ persona1.getId());
		System.out.println("Nombre:"+ persona1.getNombre());
		System.out.println("Edad:"+ persona1.getEdad());
		System.out.println("DNI:"+ persona1.getDni());
		}catch(Exception e)
		{
			System.out.println("Hola Mundo");		
		}
		
	}

}
