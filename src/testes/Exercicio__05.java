package testes;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio__05 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Escreva Cinco números inteiros:");
		int[] n = new int[5];
		int aux = 0;
		try {
			NumberFormat nf = NumberFormat.getInstance();
			n[0] = scan.nextInt();
			n[1] = scan.nextInt();
			n[2] = scan.nextInt();
			n[3] = scan.nextInt();
			n[4] = scan.nextInt();
			System.out.println();

			System.out.println("Lista dos Números inteiros: ");

			for (int i = 0; i < n.length; i++) {

				for (int j = 0; j < (n.length - 1); j++) {
					if (n[j] > n[j + 1]) {
						aux = n[j];
						n[j] = n[j + 1];
						n[j + 1] = aux;

					}
				}
			}
			for (int i = 0; i < n.length; i++) {
				if (n[i] < 999) {
					nf.setMinimumIntegerDigits(1);
					nf.setMaximumIntegerDigits(3);
					System.out.println(n[i] + " ");
				}
			}

		} catch (InputMismatchException e) {
			System.out.println("Insira Somente Números Inteiros");
		}
		scan.close();
	}

}
