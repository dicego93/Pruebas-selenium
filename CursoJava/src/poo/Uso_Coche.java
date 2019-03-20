package poo;
import javax.swing.*;

public class Uso_Coche {

	public static void main(String[] args) {
		Coche micoche=new Coche();
		micoche.establece_color(JOptionPane.showInputDialog("Introduce el color del coche:"));  //AL ESTAR ENCAPSULADO NECESITO LLAMAR A SU FUNCION QUE LA DECLARA
		micoche.configura_asientos(JOptionPane.showInputDialog("Tiene asientos de cuero?: "));
		micoche.configura_climatizador(JOptionPane.showInputDialog("Tiene climatizador?: "));
		
		System.out.println(micoche.dime_color()); //SETTER
		System.out.println(micoche.dime_datos_generales()); //GETTER
		System.out.println(micoche.dime_asientos()); //GETTER
		System.out.println(micoche.dime_peso_coche());
		System.out.println(micoche.dime_climatizador());
		System.out.println("El precio final del coche es:"+micoche.precio_coche()); 
	}

}
