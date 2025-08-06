package estruturas.condicionais;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int i = teclado.nextInt();
		int f = teclado.nextInt();
		
		int horasTotais = 0;
		
			if (i > f) {
				horasTotais = (24 - i) + ((24 + f) - 24);
				System.out.printf("O JOGO DUROU %d HORA(S)", horasTotais);
			} else if (i < f) {
				horasTotais = (24 + f) - (24 + i);
				System.out.printf("O JOGO DUROU %d HORA(S)", horasTotais);
			} else
				System.out.print("O JOGO DUROU 24 HORA(S");
	}

}
