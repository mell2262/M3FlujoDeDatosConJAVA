import java.util.Scanner;

public class CityNames {

	public static void main(String[] args) {
		/*Ejercicio: El ejercicio consiste en mostrar por consola diferentes nombres de ciudades partiendo de un 
		 * array y modificar los nombres cambiando letras.
		FASE 1
		- Crea seis variables tipu string vacías.
		- Pide por consola que se introduzcan los nombres.
		- Introduce los siguientes nombres de ciudades (Barcelona, Madrid, Valencia, Málaga, Cádiz, Santander) para 
		teclado.
		- Mostrar por consola el nombre de las 6 ciudades.
		 */ 
		
		String varUno, varDos, varTres, varCuatro, varCinco, varSeis;
		
		Scanner scan= new Scanner(System.in);
		
		System.out.println("introduzca los nombres de las ciudades");
		varUno=scan.nextLine();
		varDos=scan.nextLine();
		varTres=scan.nextLine();
		varCuatro=scan.nextLine();
		varCinco=scan.nextLine();
		varSeis=scan.nextLine();
		System.out.println(varUno+", "+ varDos+", "+ varTres+", " +varCuatro+", "+ varCinco+", "+ varSeis);
		
		
		scan.close();
	}

}
