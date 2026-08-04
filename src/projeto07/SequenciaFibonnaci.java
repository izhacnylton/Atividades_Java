import java.util.Scanner;

public class SequenciaFibonnaci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numN = 0;
		
		while (numN <= 0) {
            System.out.print("Digite um número inteiro N (maior que 0): ");
            if (sc.hasNextInt()) {
            	numN = sc.nextInt();
                if (numN <= 0) {
                    System.out.println("O número deve ser maior que zero. Tente novamente.");
                }
            } else {
                System.out.println("Entrada inválida! Digite apenas números inteiros.");
                sc.next();
            }
        }

        System.out.println("\nOs " + numN + " primeiros termos da sequência de Fibonacci:");

        long primeiro = 0;
        long segundo = 1;

        for (int i = 1; i <= numN; i++) {
            System.out.print(primeiro + (i < numN ? ", " : "\n"));

            long proximo = primeiro + segundo;
            primeiro = segundo;
            segundo = proximo;
        }
	}

}