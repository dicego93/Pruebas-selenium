package Ejercicios2;

// El metodo statico lo que hace es que atributo ya no pertenece a la clase sino al objeto
// Es decir, si lo camio en cualquiera de los objeto se cambiara en todos.

public class Estatico {
	
	private static String frase = "Primera frase";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Estatico ob1 = new Estatico();
		Estatico ob2 = new Estatico();
		
		ob2.frase="Segunda frase";
		
		System.out.println(ob1.frase);
		System.out.println(ob2.frase);
		System.out.println(Estatico.frase);
		System.out.println(frase);
		
		

	}


}


