import java.util.Scanner;

public class CaixaEletronico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double saldo = 1000.00, valorSaque;
		
		do {
            System.out.printf("%nSaldo atual: R$ %.2f%n", saldo);
            System.out.print("Digite o valor do saque (ou 0 para sair): R$ ");
            valorSaque = sc.nextDouble();

            if (valorSaque < 0) {
                System.out.println("Erro: O valor do saque não pode ser negativo.");
            } else if (valorSaque == 0) {
                System.out.println("Operação encerrada pelo usuário.");
            } else if (valorSaque > saldo) {
                System.out.println("Erro: Saldo insuficiente!");
            } else {
                saldo -= valorSaque;
                System.out.printf("Saque de R$ %.2f realizado com sucesso!%n", valorSaque);

                if (saldo == 0) {
                    System.out.println("Seu saldo zerou. Saindo...");
                }
            }

        } while (saldo > 0 && valorSaque != 0);
	}

}