import java.util.Scanner;

public class NumerosPrimos {

	public static void main(String[] args) {
		
		int num01 = 0;
		int cont = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero inteiro positivo: ");
		num01 = sc.nextInt();
		
		if(num01 >= 0) {
			for(int i = 0; i < num01; i++) {
				if(num01 % 2 == 0) {
					cont++;
				} 
			}
			if(cont == 2) {
				System.out.println("O numero " + num01 + " é primo!");
			}
			else {
				System.out.println("O número " + num01 + " não é primo.");
				System.out.println("Ele possui " + cont + " divisores ao todo.");
				
			}
		}
		else {
			System.out.println("O número não é positivo.");
		}
	}

}
