package estruturas.condicionais;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Digite o código do produto: ");
		int codigo = teclado.nextInt();
		System.out.println("Digite a quantidade desejada: ");
		int qtd = teclado.nextInt();
		
		double resultado;
		
			if (codigo == 1) {
				resultado = qtd * 4.00;
				System.out.printf("Total: R$%.2f%n", resultado);
			} else if (codigo == 2) {
				resultado = qtd * 4.50;
				System.out.printf("Total: R$%.2f%n", resultado);
			} else if (codigo == 3) {
				resultado = qtd * 5.00;
				System.out.printf("Total: R$%.2f%n", resultado);
			} else if (codigo == 4) {
				resultado = qtd * 2.00;
				System.out.printf("Total: R$%.2f%n", resultado);
			}  else if (codigo == 5) {
				resultado = qtd * 1.50;
				System.out.printf("Total: R$%.2f%n", resultado);
			} else
				System.out.println("Digite o código dos produtos de 1~5");
	}

}
