import java.util.Scanner;

public class CondicionalVoto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Ano de nascimento: ");
		int anoNasc = sc.nextInt();
		System.out.println("Ano atual: ");
		int anoAtual = sc.nextInt();
		
		int idade = anoAtual - anoNasc;
		
		System.out.println("Sua idade �: " + idade + " anos.");
		
		if (idade <16) {
			System.out.println("Voc� n�o est� apto ao voto.");
		} else if (idade >= 16 && idade <60) {
			System.out.println("Seu voto � obrigat�rio.");
		} else if (idade >60) {
			System.out.println("Seu voto n�o � obrigat�rio.");
		}
		
		
		
		
		
		sc.close();
	}

}
