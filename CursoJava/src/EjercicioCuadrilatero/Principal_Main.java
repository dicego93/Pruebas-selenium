package EjercicioCuadrilatero;

import javax.swing.JOptionPane;
import javax.swing.SingleSelectionModel;
import javax.swing.undo.CannotUndoException;

public class Principal_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuadrilatero c1;
		float lado1,lado2;
		
		lado1 = Float.parseFloat(JOptionPane.showInputDialog("DIgite el lado 1: "));
		lado2 = Float.parseFloat(JOptionPane.showInputDialog("DIgite el lado 2: "));
		
		if (lado1 == lado2) {
			c1= new Cuadrilatero(lado1);
		}
		
		else {
			c1= new Cuadrilatero(lado1,lado2);
		}
		
		System.out.println("El perimetro es: " +c1.getPerimetro());
		System.out.println("El Area es: " +c1.getArea());

	}

}
