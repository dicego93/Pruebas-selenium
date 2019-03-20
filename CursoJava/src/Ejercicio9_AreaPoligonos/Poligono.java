package Ejercicio9_AreaPoligonos;

public abstract class Poligono {
	
	public abstract double area();
	
	protected int numeroLados;

	public Poligono(int numeroLados) {
		this.numeroLados = numeroLados;
	}

	public int getNumeroLados() {
		return numeroLados;
	}

	@Override
	public String toString() {
		return "NumeroLados= "+numeroLados;
	}
	
	
	
	

}
