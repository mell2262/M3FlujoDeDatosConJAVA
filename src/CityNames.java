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
		 *FASE 4
		- Crea un nuevo array para cada una de las ciudades que tenemos. El tamaño de los nuevos arrays será la 
		longitud de cada string (string nomCiutat.Length).
		- Llene los nuevos arrays letra por letra.
		- Muestre por consola los nuevos arrays con los nombres invertidos (Ej: Barcelona - anolecraB).

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

		String arrBarcelona[]=new String[varUno.length()];
		for (int i=0; i<arrBarcelona.length; i++) {
			arrBarcelona[i]=varUno.substring(i, i+1);
		}
		for (int i=(arrBarcelona.length-1);i>=0; i--) {
			System.out.print(arrBarcelona[i]);
		}
		System.out.println("");
		
		String arrMadrid[]=new String[varDos.length()];
		for (int i=0; i<arrMadrid.length; i++) {
			arrMadrid[i]=varDos.substring(i, i+1);
		}
		for (int i=(arrMadrid.length-1);i>=0; i--) {
			System.out.print(arrMadrid[i]);
		}
		System.out.println("");

		String arrValencia[]=new String[varTres.length()];
		for (int i=0; i<arrValencia.length; i++) {
			arrValencia[i]=varTres.substring(i, i+1);
		}
		for (int i=(arrValencia.length-1);i>=0; i--) {
			System.out.print(arrValencia[i]);
		}
		System.out.println("");

		String arrMalaga[]=new String[varCuatro.length()];
		for (int i=0; i<arrMalaga.length; i++) {
			arrMalaga[i]=varCuatro.substring(i, i+1);
		}
		for (int i=(arrMalaga.length-1);i>=0; i--) {
			System.out.print(arrMalaga[i]);
		}
		System.out.println("");

		String arrCadiz[]=new String[varCinco.length()];
		for (int i=0; i<arrCadiz.length; i++) {
			arrCadiz[i]=varCinco.substring(i, i+1);
		}
		for (int i=(arrCadiz.length-1);i>=0; i--) {
			System.out.print(arrCadiz[i]);
		}
		System.out.println("");

		String arrSantander[]=new String[varSeis.length()];
		for (int i=0; i<arrSantander.length; i++) {
			arrSantander[i]=varSeis.substring(i, i+1);
		}
		for (int i=(arrSantander.length-1);i>=0; i--) {
			System.out.print(arrSantander[i]);
		}
	}

}
