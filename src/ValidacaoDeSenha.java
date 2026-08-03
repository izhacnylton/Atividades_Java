import java.util.Scanner;

public class ValidacaoDeSenha {

	public static void main(String[] args) {
		String senha = "Java123";
		String tentativa;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("========== VALIDAÇÃO DE SENHA ==========\n");
		
		do {
			System.out.println("Informe sua senha: ");
			tentativa = sc.nextLine();
			
			if(senha.equals(tentativa)) {
				System.out.println("Senha correta.");
			}
			else {
				System.out.println("Senha invalida. Tente novamente. ");
			}
		
		
		}while(!senha.equals(tentativa));

	}

}
