import java.util.*;
import java.io.*;

public class Ejercicio3_2 {

	public static void main(String[] args) {

// Aquí es donde definimos nuestras variables que nos ayudaran en todo el programa
		Scanner leer = new Scanner(System.in);		
		int variable1; //almacena el valor que se ingresa
		int factorial = 1; //almacena el valor final

		System.out.println("Ingrese un número entero para calcular el factorial: ");
		variable1 = leer.nextInt();

//Hacemos una comparación para imprimir nuestros números del factorial


		while(variable1 != 0) {
			factorial *= variable1;
			variable1 --;
		} 
		
		
		System.out.println("El factorial del número es: " + factorial);
		
	}
}