package Testing;


public class TestOne {

	 public String texto1(String uno, String dos)/*Textos iguales*/
	 {
		 if(uno==dos)
		 return uno;
		 else
			 return "no";
	 }
	 
	 public String texto2(String uno, String dos)/*Textos diferentes*/
	 {
		 if(uno!=dos)
			 return "diferente";
		 else
			 return "iguales";
	 }
	 
	 public int multiplicarDif(int numero1, int numero2)/*numeros iguales*/
	 {
		 if(numero1==numero2)
			 return 1;
		 else
			 return 0;
		 
	 }
	 
	 public int sumar(int numero1, int numero2)/*numeros diferentes*/
	 {
		 return numero1+numero2;
	 }
	 
	 public boolean calificacion(int nota)/*numeros diferente*/
	 {
		 if(nota<13)
			 return false;
		 else
			 return true;
	 }
	 
	 public alumno operacion(int valor)/*valor null*/
	 {
		alumno alumno1=new alumno(); 
		alumno1.setNombre("Maria");
		alumno1.setApellido("segovia");
		alumno1.setEdad(valor);
		
		alumno1=null;
		 
		 return alumno1;
	 }
	 
	 public boolean par(int suma)/*valor boolean*/
	 {
		 if(suma%2==0)
			 return true;
		 else
			 return false;
	}

	public int[] arreglo1( )
	{
		
		int[]numero1 = new int[3];
		int[]numero2 = new int[3];
		int[]suma = new int[2];
		
		for( int i=0; i<3; i++)
		{
			numero1[i] = 3;
		}
		
		for( int i=0; i<3; i++)
		{
			numero2[i] = 4;
		}
		
		for( int i=0; i<2; i++)
		{
		   if( i == 0)
		   {
			for( int y=0; y<3; y++)
			{
					suma[i]+= numero1[y];
			}
		   }
		   if ( i == 1)
		   {
			   for( int y=0; y<3; y++)
				{
						suma[i]+= numero2[y];
				}
		   }
		}
		return suma;
	}

	 public int[] arreglo2( int numero)
	 {
		 int[] arreglo1=new int[numero];
		 int num=numero;
		 for(int i=0;i<num;i++)
		 {
			 arreglo1[i]=numero;
			 numero--;
		 }
		 return arreglo1;
	 }
	 
	 public alumno alumnos(String nombre, String apellido, int edad)
	 {
		 alumno alumno1 = new alumno();
		 alumno1.setNombre(nombre);
		 alumno1.setApellido(apellido);
		 alumno1.setEdad(edad);
		 
		 return alumno1;
	 }
	 
	 public Animal mascota( String nombre, String sexo, int tamano, int npatas)
	 {
		 Animal mascota1 = new Animal();
		 mascota1.setNombre(nombre);
		 mascota1.setSexo(sexo);
		 mascota1.setTamano(tamano);
		 mascota1.setNumero_patas(npatas);
		 return mascota1;
	 }	 
	 
	 public int dividir(int a, int b)
	 {

		 int div=0;
		 try
		 {
			 div=a/b;
		 }catch(Exception e)
		 {
			 div=9;
		 }
		 return div;
		 
	}
	 
	 public String ingreso(int numero, int longitud)
	 {
		 
		 int [] array = new int[longitud];
         try
         {
	         array[numero] = 24;
	         return "exito";
         }
         catch(ArrayIndexOutOfBoundsException e)
         {
	         return"error";
         }
	 }
	 
}
