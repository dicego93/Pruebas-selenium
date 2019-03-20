package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Empleado empleado1=new Empleado("Paco Gomez",8500,1990,12,17); 
		Empleado empleado2=new Empleado("Sandra", 50000,1993,11,2); 
		Empleado empleado3=new Empleado("Diego", 40000,1992,10,3); 
		
		empleado1.subeSueldo(10);
		empleado2.subeSueldo(20);
		empleado3.subeSueldo(30);
		
		System.out.println("Nombre : "+empleado1.dameNombre()+ " Sueldo : "+empleado1.dameSueldo()+ " Fecha de alta: "+empleado1.dameFechaContrato());
		System.out.println("Nombre : "+empleado2.dameNombre()+ " Sueldo : "+empleado2.dameSueldo()+ " Fecha de alta: "+empleado2.dameFechaContrato());
		System.out.println("Nombre : "+empleado3.dameNombre()+ " Sueldo : "+empleado3.dameSueldo()+ " Fecha de alta: "+empleado3.dameFechaContrato());

	}
} */
	
		Empleado[] misEmpleados=new Empleado[3]; 
		
		
		misEmpleados[0]=new Empleado ("Paco Gomez",100,1990,12,17);
		misEmpleados[1]=new Empleado ("Sandra", 50000,1993,11,2);
		misEmpleados[2]=new Empleado ("Diego", 40000,1992,10,3);
		
/*		for(int i=0; i<3; i++) {
			
			misEmpleados[i].subeSueldo(5);
			System.out.println("Nombre : "+misEmpleados[i].dameNombre()+ " Sueldo : "+misEmpleados[i].dameSueldo()+ " Fecha de alta: "+misEmpleados[i].dameFechaContrato());
		} */
		
		for (Empleado i: misEmpleados) {
			i.subeSueldo(5);
			System.out.println("Nombre : "+i.dameNombre()+ " Sueldo : "+i.dameSueldo()+ " Fecha de alta: "+i.dameFechaContrato());			
		}
		
	}}
		
	class Empleado{
		
		private String nombre;
		private double sueldo;
		private Date altaContrato;
		private static int IdSiguiente;
		private int Id;
		
		
		public Empleado(String nom, double sue, int agno, int mes, int dia) {
			nombre=nom;
			sueldo=sue;
			GregorianCalendar calendario= new GregorianCalendar(agno, mes-1,dia);
			altaContrato=calendario.getTime();
			++IdSiguiente;
			Id=IdSiguiente;
			
		}
		
		public String dameNombre() { //GETTER
			
			return nombre;
		}
		
		public double dameSueldo() { //GETTER
			
			return sueldo;
		}
		
		public Date dameFechaContrato() {
			
			return altaContrato;
		}
		
		public void subeSueldo(double porcentaje) {
			double aumento=(double)(sueldo*porcentaje/100);
			sueldo+=aumento;
		}
	}

