package point_three;

public class MaxValue {

	public static void main(String[] args) {
		// 3. Repetí lo realizado en el ejercicio 2 con 
		// byte, char, short, long, tipos primitivos en Java
		
		
		byte a=Byte.MAX_VALUE;
		System.out.println("El valor más alto del dato tipo BYTE es: "+a);
		System.out.println("El valor más bajo del dato tipo BYTE es: "+ ++a);
		
		char b=Character.MAX_VALUE;
		System.out.println("El valor más alto del dato tipo CHAR es: "+b);
		System.out.println("El valor más bajo del dato tipo CHAR es: "+ ++b);

		short c=Short.MAX_VALUE;
		System.out.println("El valor más alto del dato tipo SHORT es: "+c);
		System.out.println("El valor más bajo del dato tipo SHORT es: "+ ++c);

		long d=Long.MAX_VALUE;
		System.out.println("El valor más alto del dato tipo LONG es: "+d);
		System.out.println("El valor más bajo del dato tipo LONG es: "+ ++d);	
	}

}
