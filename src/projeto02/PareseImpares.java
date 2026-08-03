package projeto02;

import java.util.Scanner;

public class PareseImpares {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		int pares = 0;
		int impares = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.print("Digite o " + i + "° número: ");
			numero =  sc.nextInt ();
			
			if (numero % 2 == 0) {
				pares++;
			} else {
				impares++;
			}
	}
		System.out.print("\nResultado: ");
        System.out.println("Quantidade de numeros pares: " + pares);
        System.out.println("Quantidade de números Ímpares: " + impares);
        

	}
}
