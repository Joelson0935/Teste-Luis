package testes;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio__03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Escreva Cinco números inteiros:");
		int[] n = new int[5];
		try {
			n[0] = scan.nextInt();
			n[1] = scan.nextInt();
			n[2] = scan.nextInt();
			n[3] = scan.nextInt();
			n[4] = scan.nextInt();
			System.out.println();

			System.out.println("Lista dos Números inteiros: ");
			
			Arrays.sort(n);
			
			System.out.println(Arrays.toString(n));
			
		} catch (InputMismatchException e) {
			System.out.println("Insira Somente Números Inteiros");
		}
		scan.close();
	}

}
