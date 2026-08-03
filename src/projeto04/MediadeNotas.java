package projeto04;

import java.util.Scanner;

public class MediadeNotas {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner( System.in);
		
		double nota;
		double soma = 0;
		int quantidade = 0;
		
		while (true) {
			System.out.print(" Digite uma nota (ou um valor negativo para encerrar); ");
			nota = sc.nextDouble();
			
			if (nota < 0) {
				break;
			}
			
			soma += nota;
			quantidade++;
	}
		if (quantidade > 0 ) {
			double media = soma / quantidade;
			
			System.out.printf("\nMédia: %.2f\n" , media);
			
			if (media >= 7) {
				System.out.println("Aluno Aprovado! ");
			} else {
				System.out.println(" Aluno Reprovado! ");
			}
		}
		else {
			System.out.println(" Nenhuma nota válida foi informada.");
			}
		
		
	}
	
}
