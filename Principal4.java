import java.util.Scanner;

public class Principal4 {

	public static void main(String[] args) {
		
		System.out.println("Introduzca el critero de ordenación: ");
		System.out.println("'a' para ordenar de manera ascencente y " + "'d' de manera descendente: ");
		Scanner sc = new Scanner(System.in);
		String opcion = sc.nextLine();

		System.out.println("Introduzca el primer número: ");
		int numero1 = sc.nextInt();
		System.out.println("Introduzca el segundo número: ");
		int numero2 = sc.nextInt();
		System.out.println("Introduzca el tercer número: ");
		int numero3 = sc.nextInt();

		int numeroMayor = 0;
		int numeroIntermedio = 0;
		int numeroMenor = 0;

		if (numero1 >= numero2 && numero1 >= numero3 && numero2 >= numero3) {
			numeroMayor = numero1;
			numeroIntermedio = numero2;
			numeroMenor = numero3;
		} else if (numero1 >= numero2 && numero1 >= numero3 && numero3 >= numero2) {
			numeroMayor = numero1;
			numeroIntermedio = numero3;
			numeroMenor = numero2;
		} else if (numero2 >= numero1 && numero2 >= numero3 && numero1 >= numero3) {
			numeroMayor = numero2;
			numeroIntermedio = numero1;
			numeroMenor = numero3;
		} else if (numero2 >= numero1 && numero2 >= numero3 && numero3 >= numero1) {
			numeroMayor = numero2;
			numeroIntermedio = numero3;
			numeroMenor = numero1;
		} else if (numero3 >= numero1 && numero3 >= numero2 && numero2 >= numero1) {
			numeroMayor = numero3;
			numeroIntermedio = numero2;
			numeroMenor = numero1;
		} else if (numero3 >= numero1 && numero3 >= numero2 && numero1 >= numero2) {
			numeroMayor = numero3;
			numeroIntermedio = numero1;
			numeroMenor = numero2;
		}

		if (opcion.equals("a")) {
			System.out.println(numeroMenor + ", " + numeroIntermedio + ", " + numeroMayor);
		} else if (opcion.equals("d")) {
			System.out.println(numeroMayor + ", " + numeroIntermedio + ", " + numeroMenor);
		}
	}

}
