import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		
		int numero = -1;
		
		while (numero < 0) {
			
			System.out.println("Introduzca un número entero: ");
			Scanner sc = new Scanner(System.in);
			numero = sc.nextInt();
			
			if (numero >= 0) {
				for (int i = numero; i < numero + 21; i++) {
					System.out.println(i);
				}
			}
		}

	}

}
