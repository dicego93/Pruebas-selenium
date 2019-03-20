package TringuloIsocelesMayor;

import java.util.Scanner;

import EjercicioCocheMasBarato.Vehiculo;

public class Principal {
	
	public static int getAreaMayor(Triangulo t[]) {
		double area;
		int indice = 0;
		
		area = t[0].obtenerArea();
		
		for (int i=1;i<t.length;i++) {
			if(t[i].obtenerArea()>area) {
				area= t[i].obtenerArea();
				indice=i;
			}
		}
		
		return indice;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float lado;
		float base;
		int numeroTriangulos;
		int areaMayor;
		
		Scanner entrada = new Scanner(System.in);
		
		
		System.out.println("Digite la cantidad de triangulos: ");
		numeroTriangulos = entrada.nextInt();
		
		//Creamos los objetos para los coches
		
		Triangulo t[] = new Triangulo [numeroTriangulos];
		
		for(int i=0; i<t.length;i++) {
			entrada.nextLine();			
			System.out.println("\nDigite las caracteristaicas del coche "+(i+1)+":" );
			System.out.println("Introduzco el lado: ");
			lado = entrada.nextFloat();
			System.out.println("Introduzco la base: ");
			base = entrada.nextFloat();
			
			t[i] = new Triangulo(base, lado);
		}
		
		areaMayor = getAreaMayor(t);
		
		System.out.println("\nEl AREA mayor es: ");
		System.out.println(t[areaMayor].mostrarDatos());
		
		
		

	}

}
