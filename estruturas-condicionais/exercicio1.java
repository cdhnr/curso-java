package estruturas.condicionais;

import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		int x = teclado.nextInt();
		
		if (x >= 0) {
			System.out.println("NEGATIVO");
		} else
			System.out.println("NÃO NEGATIVO");
	}
}