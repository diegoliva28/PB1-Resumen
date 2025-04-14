package point_nine;

public class ClaseDePrueba {

	public static void main(String[] args) {
//		 a. ¿Qué resultado se obtiene al compilar el mismo?
//			No se puede, porque no se pueden operar datos tipo INT con DOUBLES
//		 b. ¿Qué modificaciones realizaría para corregir los errores observados?
		
//		 c. El resultado obtenido al aplicar los cambios en b. ¿Es correcto? Paciencia, ya
//		    veremos cómo manipular estos casos
//			No se correcto porqque no existe porcion decimal en objetos
		
		int capacidadHdd=1;// Expresada en TERA
//		double capacidadHdd=1;// Expresada en TERA
		
		double capacidadDvd=8.5;// Expresada en GIGA
		double capacidadBlueRay=25.0;// Expresada en GIGA
//		int cantidadDeDvdsParaBackupearHdd;
//		int cantidadBlueRaysParaBackupearHdd;
	
		//Respuesta de la BB
		double cantidadDeDvdsParaBackupearHdd;
		double cantidadBlueRaysParaBackupearHdd;
		
		int conversionDeUnidad=1024;
		
		cantidadDeDvdsParaBackupearHdd=((capacidadHdd*conversionDeUnidad)/capacidadDvd);
		cantidadBlueRaysParaBackupearHdd=((capacidadHdd*conversionDeUnidad)/capacidadBlueRay);
		
		System.out.println("Cantidad de DVD que se necesitan para backupear el disco rigido: "+cantidadDeDvdsParaBackupearHdd);
		System.out.println("Cantidad de Blue Ray que se necesitan para backupear el disco rigido: "+cantidadBlueRaysParaBackupearHdd);
	}
}
