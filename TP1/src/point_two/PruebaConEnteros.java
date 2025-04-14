package point_two;

public class PruebaConEnteros {

	public static void main(String[] args) {
//		a. En una clase llamada PruebaConEnteros, almacena en una variable 
//		 entera el valor máximo que soporta dicho tipo de dato (2147483647).
//		 b. Imprimí el valor por pantalla.
//		 c. Incrementa el valor guardado en la variable a.
//		 d. Volvé a imprimir el nuevo valor por pantalla
//		 e. ¿Qué sucede? ¿Porqué? ¿Qué cambios realizarías?
		int  maxValue=2147483647;
		
		System.out.println(maxValue);
		
		
		// maxValue=++maxValue;
		System.out.println(++maxValue);
		
//		 e. ¿Qué sucede? ¿Porqué? ¿Qué cambios realizarías?
//		 e. Da negativo porque no reconooe otro valor a su limite positivo
//			Por eso da negativa, porque da una especie de vuelta que seria el otro extremo
	}

}
