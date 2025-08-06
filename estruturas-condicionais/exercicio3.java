package estruturas.condicionais;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		int a = teclado.nextInt();
		int b = teclado.nextInt();
		
		if (a % b == 0 || b % a == 0) {
			System.out.println("Múltiplo");
		} else
			System.out.println("Não são múltiplos");
	}

}
