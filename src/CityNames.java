import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CityNames {

	public static void main(String[] args) {
		/*
		 * Ejercicio: El ejercicio consiste en mostrar por consola diferentes nombres de
		 * ciudades partiendo de un array y modificar los nombres cambiando letras. 
		 * FASE
		 * 3 - cambiar las vocales "a" de los nombres de las ciudades por el numero 4 y
		 * guarde los nombres modificados en un nuevo array (ArrayCiutatsModificades). -
		 * Muestre por consola el array modificado y ordenado por orden alfabético.
		 * 
		 * 
		 */

		String varUno, varDos, varTres, varCuatro, varCinco, varSeis;

		Scanner scan = new Scanner(System.in);

		System.out.println("introduzca los nombres de las ciudades");
		varUno = scan.nextLine();
		varDos = scan.nextLine();
		varTres = scan.nextLine();
		varCuatro = scan.nextLine();
		varCinco = scan.nextLine();
		varSeis = scan.nextLine();
		// System.out.println(varUno+", "+ varDos+", "+ varTres+", " +varCuatro+", "+
		// varCinco+", "+ varSeis);

		scan.close();

		List<String> arrayCities = Arrays.asList(varUno, varDos, varTres, varCuatro, varCinco, varSeis);

		List<String> arrayCitiesModif = new ArrayList<String>();
		for (int i = 0; i < arrayCities.size(); i++) {
			arrayCitiesModif.add(arrayCities.get(i).replaceAll("a", "4"));
		}

		Collections.sort(arrayCitiesModif);
		for (String i : arrayCitiesModif) {
			System.out.println(i);
		}

	}

}
