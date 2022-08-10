import java.util.Scanner;

public class CondicionalVoto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ano de nascimento: ");
		int anoNasc = sc.nextInt();
		System.out.println("Ano atual: ");
		int anoAtual = sc.nextInt();
		
		int idade = anoAtual - anoNasc;
		
		System.out.println("Sua idade é: " + idade + " anos.");
		
		if (idade <16) {
			System.out.println("Você não está apto ao voto.");
		} else if (idade >= 16 && idade <60) {
			System.out.println("Seu voto é obrigatório.");
		} else if (idade >60) {
			System.out.println("Seu voto não é obrigatório.");
		}
		
		
		
		
		
		sc.close();
	}

}
