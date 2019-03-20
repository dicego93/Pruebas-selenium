package poo;

public class Coche {
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cuero,climatizador;

	
	public Coche() {
		
		ruedas=4;
		largo=10000;
		ancho=50;
		motor=1600;
		peso_plataforma=1000;
		
		
	}
	
	public String dime_datos_generales() {   //GETTER . ESTA ENCAPSULADO NO SE PUEDE MODIFICAR FUERA.
		return "La pataforma del vehiculo tiene "+ ruedas+ " ruedas \n"+ "Mide: "+(double)(largo/1000)+ " metros\n con un ancho de : " + ancho+ "cm y un \n peso de plataforma de: "+ peso_plataforma+ "Kg";
		
	}
	
	public void establece_color(String color_coche) { //SETTER. SE PUEDE MODIFICAR
		color=color_coche;
	}
	
	public String dime_color() {   //GETTER . ESTA ENCAPSULADO NO SE PUEDE MODIFICAR FUERA.
		return "El coche es de color: " + color;
	}	
	
	public void configura_asientos(String asientos_cuero) { //METODO SETTER. ASIGNA VALOR A ASIENTOS CUERO
		
		if (asientos_cuero.equalsIgnoreCase("si")) { //IMPORTANTE RECORDAR QUE LOS STRING SE COMPARA CON EQUAL
			
			this.asientos_cuero=true;
		}else {
			this.asientos_cuero=false;
		}
	}
	
	public String dime_asientos() {
		
		if (asientos_cuero==true) {               			//TAMBIEN SE PODRIA PONE IF(ASIENTOS_CUERO){ (LO TOMARIA COMO TRUE)
			return "El coche tiene asientos de CUERO";
		}else {
			return "El coche NOO tiene asientos de CUERO";
		}
	}
	
	public void configura_climatizador(String climatizador) { //METODO SETTER. ASIGNA VALOR A ASIENTOS CUERO
		
		if (climatizador.equalsIgnoreCase("si")) { //IMPORTANTE RECORDAR QUE LOS STRING SE COMPARA CON EQUAL
			
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
	}
	
	public String dime_climatizador() {
		
		if (climatizador==true) {               			//TAMBIEN SE PODRIA PONE IF(ASIENTOS_CUERO){ (LO TOMARIA COMO TRUE)
			return "El coche tiene climatizador";
		}else {
			return "El coche NOO tiene climatizador";
		}
	}
	
	public String dime_peso_coche() {  //SETTER + GETTER. NO RECOMENDABLE
		
		int peso_carroceria=500;
		peso_total=peso_carroceria+peso_plataforma;
		if(asientos_cuero==true) {
			
			peso_total+=50;  //PESO_TOTAL=PESO_TOTAL+50
		}
		return "El peso del coche es: " + peso_total;
		
		
	}
	
	public int precio_coche() { //GETTER
		int preciofinal=1000;
		if(asientos_cuero==true) {
			preciofinal+=500;
		}
		if (climatizador==true) {
			preciofinal+=150;
			}	
		return preciofinal;
	}
	
	

			
}
