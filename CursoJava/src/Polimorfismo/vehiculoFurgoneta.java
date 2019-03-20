package Polimorfismo;

public class vehiculoFurgoneta extends Vehiculo {
	
	private int carga;

	public vehiculoFurgoneta(String matricula, String marca, String modelo, int carga) {
		super(matricula, marca, modelo);
		this.carga = carga;
	}

	public int getCarga() {
		return carga;
	}
	
	public String mostrarDatos() {
		
		return "\nMatricula: " +matricula+ "\nMarca: "+marca+"\nModelo: "+modelo+"\nCarga: "+carga;
	}
	
	
	

	
	}
	
	
