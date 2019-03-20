package EjercicioCuadrilatero;

public class Cuadrilatero {
	//Atributos
	
	private float lado1;
	private float lado2;
	
	//Metodo Constructor
	
	public Cuadrilatero(float lado1, float lado2) {
		this.lado1=lado1;
		this.lado2=lado2;
	}
	//Metodo2 en caso de cuadrilatero con un lado es suficiente
	public Cuadrilatero(float lado1) {
		this.lado1 = this.lado2=lado1;
	}



	public float getLado1() {
		return lado1;
	}
	public void setLado1(float lado1) {
		this.lado1 = lado1;
	}
	public float getLado2() {
		return lado2;
	}
	public void setLado2(float lado2) {
		this.lado2 = lado2;
	}
	
	public float getPerimetro() {
		float perimetro = 2*(lado1+lado2);
		return perimetro;
	}
	
	public float getArea() {
		float area = (lado1 * lado2);
		return area;
	}

}
