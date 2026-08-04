import java.util.Scanner;

public class EstatisticaTurma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade, i, quantidade, cont = 0, AC = 0;
		int maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		double media;
		
		System.out.println("Digite a quantidade de alunos: ");
		quantidade = sc.nextInt();
		
		for(i = 1; i <= quantidade; i++) {
			System.out.println("Digite a idade do Aluno: ");
			idade = sc.nextInt();
			
			if(idade > maior) {
				maior = idade;
			}
			
			if(idade < menor) {
				menor = idade;
			}
			AC += idade;
			cont++;
		}
		
		media = (double) AC / cont;
		
		System.out.println("Maior Idade: " + maior);
		System.out.println("Menor Idade: " + menor);
		System.out.println("Média de idades: " + media);

	}

}
