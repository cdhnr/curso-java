package estruturas.condicionais;

import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		int x = teclado.nextInt();
		
		int result = x % 2;
		
		if (result == 0) {
			System.out.println("PAR");
		}
		else
			System.out.print("ÍMPAR");
				
	}

}