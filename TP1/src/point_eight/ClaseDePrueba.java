package point_eight;

public class ClaseDePrueba {

	public static void main(String[] args) {
//		8. Dado el siguiente código, ¿qué se observa por pantalla? 
//		¿Porqué la diferencia entre el resultado de una y otra impresión?
		int preIncremento=5;
		int postIncremento=5;
		
		System.out.println("Pre Incremento:"+ ++preIncremento);
		System.out.println("Post Incremento:"+ postIncremento++);
		System.out.println("Post Incremento verdadero:"+ postIncremento);
	}

}
