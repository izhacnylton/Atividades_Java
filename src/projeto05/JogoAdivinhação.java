import java.util.Scanner;

public class JogoAdivinhação {

	public static void main(String[] args) {
		int numeroSecreto = (int) (Math.random() * 50) + 1;
		int palpite;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Tente adivinhar o número: ");
			palpite = sc.nextInt();
			
			if(palpite > numeroSecreto) {
				System.out.println("Muito Alto! Tente Novamente.");
			}
			else if(palpite < numeroSecreto) {
				System.out.println("Muito Baixo! Tente Novamente.");
			}
			else {
				System.out.println("Número correto. Parabens");
			}
			
		}while(palpite != numeroSecreto);

	}
}
