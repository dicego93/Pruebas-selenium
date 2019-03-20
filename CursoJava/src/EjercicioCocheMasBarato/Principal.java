package EjercicioCocheMasBarato;

import java.util.Scanner;

import javax.swing.SingleSelectionModel;

public class Principal {
	
	public static int indiceCocheMBarato(Vehiculo coches[]) {
		float precio;
		int indice = 0;
		
		
		precio = coches[0].getPrecio();
		
		for(int i=1; i<coches.length; i++) {
			
			if (coches[i].getPrecio()<precio) {
				precio = coches[i].getPrecio();
				indice = i;
				
			}
		}
		
		return indice;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		String marca,modelo;
		float precio;
		int numeroVehiculos;
		int indiceBarato;
		
		System.out.println("Digite la cantidad de vehiculos: ");
		numeroVehiculos = entrada.nextInt();
		
		//Creamos los objetos para los coches
		Vehiculo coches[] = new Vehiculo [numeroVehiculos];
		
		for(int i=0; i<coches.length;i++) {
			entrada.nextLine();			System.out.println("\nDigite las caracteristaicas del coche "+(i+1)+":" );
			System.out.println("Introduzco la Marca: ");
			marca = entrada.nextLine();
			System.out.println("Introduzco la modelo: ");
			modelo = entrada.nextLine();
			System.out.println("Introduzco la Precio: ");
			precio = entrada.nextFloat();
			
			coches[i] = new Vehiculo(marca, modelo, precio);
		}
		
		indiceBarato = indiceCocheMBarato(coches);
		System.out.println("\nEl coche mas barato es: ");
		System.out.println(coches[indiceBarato].mostrarDatos());
		
		

	}
	
	
	

}
