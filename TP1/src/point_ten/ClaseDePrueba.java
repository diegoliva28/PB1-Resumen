package point_ten;

import java.util.Scanner;

public class ClaseDePrueba {

	public static void main(String[] args) {
//	10.
//	Desarrollar un programa (una clase de prueba) donde los datos de entrada son las dos 
//	notas de un alumno y la salida es la condición del alumno. 
//	Promociona si ambas notas son mayores o iguales a 7
//	Aprobados si ambas notas son mayores o iguales a 4 (al menos una es menor a 7)
//	Desaprobado si alguna de las notas es menor a 4
//	NO SE PUEDE UTILIZAR NINGUNA ESTRUCTURA LOGICA PARA RESOLVERLO
//		Sin IF, While, For, Switch
//	La salida puede ser  promociono false, aprobo true, desaprobo false
		
	Scanner keyboard=new Scanner(System.in);
	int nota1;
	int nota2;
	
	System.out.println("Ingresa la 1° nota del alumno");
	nota1=keyboard.nextInt();
	System.out.println("Ingresa la 2° nota del alumno");
	nota2=keyboard.nextInt();
		
	
	boolean PROMOCION=nota1>=7 && nota2>=7;
	boolean APROBADO=(nota1>=4 && nota2>=4) && !PROMOCION;
//	boolean APROBADO=(nota1>=4 && nota2>=4) && !(nota1>=7 && nota2>=7);
//	boolean APROBADO=(nota1>=4 && nota2>=4) && (nota1<7 || nota2<7);
//	boolean DESAPROBADO=nota1<4 || nota2<4;
	boolean DESAPROBADO=!APROBADO && !PROMOCION;
	
	System.out.println("Promociono: "+PROMOCION);
	System.out.println("Aprobado: "+APROBADO);
	System.out.println("Desaprobado: "+DESAPROBADO);
	}
}
