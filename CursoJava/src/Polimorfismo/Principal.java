package Polimorfismo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehiculo misVehiculos[] = new Vehiculo[3];
		
		misVehiculos[0] = new Vehiculo("8087fgt","FIAT" ,"500");
		misVehiculos[1] = new vehiculoFurgoneta("1234A","SEAT" ,"500", 5000);
		misVehiculos[2] = new VehiculoDeportivo(750,"citroen" ,"500", "3214f");
		
		for(Vehiculo vehiculos: misVehiculos) {
			System.out.println(vehiculos.mostrarDatos());
		}
		
		
		

	}

}
