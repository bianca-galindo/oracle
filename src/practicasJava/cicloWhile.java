package practicasJava;

/*Definición de While
 *El significado de esta sentencia se traduce en español como "Mientras".
 *Interpretado como un bucle de repetición, es decir que, si se ingresa un código valido que se cosidera "True"(Verdadero)
 *entonces la sentencia condicional progresa y corre el código.   
 *
 * 
 *El ciclo while es uno de los códigos que más se emplean 
 *en la programación. Pues permite agrupar el programa
 *según las funciones que se cumplan. De modo que, si en una suma,
 *el cout o contador no toma un valor correcto, entonces, no se 
 *ejecutará nada y marcará el endl.
 * Referencia : https://quees.com/while-programacion/*/


public class cicloWhile {

	public static void main(String[] args) {
		
		int contador = 0; //Inicializacón de variable en cero
		while(contador <= 10 ) { //Condición, si contador es menor o igual a 10 entonces : 
			
			System.out.println(contador); //Entonces imprime el valor de contador
			
			contador++; //A la variable contador sumale un valor mas
			
		}//Regresa a while a evaluar nuevamente a contador. 
	}// Cuando contador vale 11 el proceso finaliza y no regresa a evaluar a variable contador
}


