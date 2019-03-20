import java.util.Scanner;

import javax.swing.JOptionPane;

public class MostrarMensaje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 String num=JOptionPane.showInputDialog("Introduzca un numero: ");
		 int numf=Integer.parseInt(num);
		 System.out.println("---------------------------");
		 mostrar(numf);
		 System.out.println("---------------------------");

	}
	static void mostrar(int num){
		 for (int i=0;i<num;i++){
		 System.out.println("Módulo ejecutándose");
		 }	 
}
}
