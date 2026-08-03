import java.util.Scanner;

public class tabuadaDinamica {

	public static void main(String[] args) {
		int num01 = 0;
		int resultado = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira um número de 1 a 10: ");
		num01 = sc.nextInt();
		if(num01 >= 1 && num01 <= 10) {
			for(int i = 1; i < 11; i++) {
				resultado = i * num01;
				System.out.println(num01 + " x " + i + " = " + resultado);
			}
		}
		else {
			System.out.println("Numero Invalido");
		}

	}

}
