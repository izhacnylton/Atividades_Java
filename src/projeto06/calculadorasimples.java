package projeto06;

import java.util.Scanner;

public class calculadorasimples {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int opcao;
		double num1, num2, resultado;
		
		do { 
			System.out.println("\n=== CALCULADORA ===" );
			System.out.println(" 1 - Somar ");
			System.out.println(" 2 - Subtrair ");
			System.out.println(" 3 - Multiplicar ");
			System.out.println(" 4 - Dividir ");
			System.out.println(" 5 - Sair ");
			System.out.println(" Escolha uma opção: ");
			opcao = sc.nextInt();
			
			switch (opcao) {
			
			case 1:
				System.out.print(" Digite o prmeiro número ");
				num1 = sc.nextDouble ();
				System.out.print(" Digite o segundo número ");
				num2 = sc.nextDouble();
				resultado = num1 + num2;
				System.out.println("Resultado: " + resultado);
				break;
				
			case 2:
				System.out.print(" Digite o primeiro número ");
				num1 = sc.nextDouble();
				System.out.print(" Digite o segundo número: ");
				num2 = sc.nextDouble();
				resultado = num1 - num2;
				System.out.println("Resultado " + resultado);
				break;
				
			case 3:
				System.out.print("Digite o primeiro número: ");
				num1 = sc.nextDouble();
				System.out.print(" Digite o segundo número: ");
				num2 = sc.nextDouble();
				resultado = num1 * num2;
				System.out.println("Resultado: " + resultado);
				break;
				
			case 4:	
				System.out.println(" Digite o primeiro número: ");
				num1 = sc.nextDouble ();
				System.out.println(" Digite o segundo número: ");
				num2 = sc.nextDouble ();
				
				if (num2 != 0) {
					resultado = num1 / num2;
					System.out.println("Resultados: " + resultado);
				} else {
					System.out.println(" Erro: não é possível dividir por zero. ");
				}
				break;
				
			case 5:
				System.out.println("Programa encerrado. ");
				break;
				
			default:
				System.out.println(" Opção inválida! ");
				
			}
		} while (opcao != 5);
	}
}
