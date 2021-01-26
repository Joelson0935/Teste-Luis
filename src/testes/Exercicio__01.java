package testes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio__01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Escreva Quatro números inteiros:");
		int[] n = new int[5];
		try {
			n[0] = scan.nextInt();
			n[1] = scan.nextInt();
			n[2] = n[1];
			n[3] = scan.nextInt();
			n[4] = scan.nextInt();
			System.out.println();

			System.out.println("Lista dos Números inteiros: ");

			for (int i = 0; i < n.length; i++) {
				System.out.println(n[i]);
			}
		} catch (InputMismatchException e) {
			System.out.println("Insira Somente Números Inteiros");
		}
		scan.close();
	}
}
