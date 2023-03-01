package practicasJava;

public class condicionales {
	// Las condicionales en programación, son sentencias que permiten tomar una
	// desición

	public static void main(String[] args) {

		int edad = 28;

		if (edad >= 18) {// Inicia proceso de IF
			// Definición:
			/*
			 * Si la variable edad es mayor o igual a el número 18, realizar la siguiente
			 * instrucción:
			 */
			System.out.print("La condifición es verdadera");

		} // Finaliza proceso de if

		if (edad <= 50) {// Inicia if
			/*
			 * Definici+on Si edad es menor o igual a 50, entonces realiza la siguiente
			 * instrucción Si la instrucción es verdadera, realizara la intrcción del bloque
			 * principal
			 */
			System.out.print("La condifición es verdadera");
		} // Finaliza if
		else {/* inicia else
				 *  Si la instrucción es falsa entonces realiza el proceso del bloque
				 * secundario (el bloque del else)
				 */
			System.out.print("La condifición es falsa");
		} // Finaliza else
		
		

	}

}
