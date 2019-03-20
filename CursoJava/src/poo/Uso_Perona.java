//VIDEO 46

package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_Perona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona[] laspersonas=new Persona[3]; 
		
		
		laspersonas[0]=new Empleado2 ("Paco Gomez",50000,2009,02,25);
		laspersonas[1]=new Empleado2 ("Paco Gomez",50000,2009,02,25);
		laspersonas[2]=new Alumno ("Sandra", "fisica");
		
		for (Persona p: laspersonas) {
			
			System.out.println(p.dameNombre()+" , "+p.dameDescripcion());
		}
		
		

	}}

	abstract class Persona{ //si declaras un metodo abstracto debes crear la clase tb abstracta
		
		private String nombre;
		
		public Persona(String nom) {
			nombre=nom;
		}
		
		public String dameNombre() {
			
			return nombre;
		}
		
		public abstract String dameDescripcion(); //Aseguran que todas las clases que vienen de la clase padre tengan ese metodo
		
	}
	
	
	
class Empleado2 extends Persona{
		
		private double sueldo;
		private Date altaContrato;
		private int IdSiguiente=0;
		private int Id;
		
		
		public Empleado2(String nom, double sue, int agno, int mes, int dia) {
			super(nom);
			sueldo=sue;
			GregorianCalendar calendario= new GregorianCalendar(agno, mes-1,dia);
			altaContrato=calendario.getTime();
			IdSiguiente++;
			Id=IdSiguiente;
			
		}
		
		public String dameDescripcion() {
			
			return "Este empleado tiene un id= "+Id+ " con un sueldo igual a: "+sueldo;
		}
		
		
		public double dameSueldo() { //GETTER
			
			return sueldo;
		}
		
		public Date dameFechaContrato() {
			
			return altaContrato;
		}
		
		public void subeSueldo(double porcentaje) {
			double aumento=(sueldo*porcentaje/100);
			sueldo+=aumento;
		}
	}
class Alumno extends Persona{
	private String carrera;
	
	public Alumno(String nom, String car) {
		super(nom);
		carrera=car;
		
		
	}
	public String dameDescripcion() {
		
		return "Este alumno esta estudiando la carrera de: "+carrera;
	}
}
