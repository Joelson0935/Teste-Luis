package testes;

public class Teste__01 {
	public static void main(String[] args) {
		int listaNumeros[] = { 1, 2, 5, 8, 9, 10, 12 };

		for (int i = 0; i < listaNumeros.length; i++) {
			System.out.print(listaNumeros[i]);
			if (i != 0) {
				if (listaNumeros[i - 1] + 1 == listaNumeros[i]) {
					System.out.println(" sequencial");
				} else {
					System.out.println(" não sequencial");
				}
			} else {
				System.out.println(" primeiro");
			}
		}
	}
}
