import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CityNames {

	public static void main(String[] args) {
		/*Ejercicio: El ejercicio consiste en mostrar por consola diferentes nombres de ciudades partiendo de un 
		 * array y modificar los nombres cambiando letras.
		FASE 2
		- Una vez tenemos los nombres de las ciudades guardados en variables tendremos que pasar la información a un 
		array (arrayCiutats).
		- Cuando tengamos el array lleno, tendremos que mostrar por consola el nombre de las ciudades ordenadas por 
		orden alfabético.

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
		//System.out.println(varUno+", "+ varDos+", "+ varTres+", " +varCuatro+", "+ varCinco+", "+ varSeis);
		
		scan.close();
		
		
		List<String> arrayCities= Arrays.asList(varUno,varDos,varTres,varCuatro,varCinco,varSeis);
		Collections.sort(arrayCities);
		for (String i:arrayCities) {
			System.out.println(i);
		}
		
		
	}

}
