import java.util.Scanner;

public class CondicionalIdade {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o ano do seu nascimento: ");
		int anoNasc = sc.nextInt();
		System.out.println("Digite o ano atual: ");
		int anoAtual = sc.nextInt();
		
		int idade;
		
		idade = anoAtual - anoNasc;
		
		System.out.println("Sua idade � " + idade + " anos.");
		
		if (idade >= 18) {
			System.out.println("Voc� est� apto a tirar a carteira de habilita��o");
		} else {
			System.out.println("Voc� n�o est� apto.");
		}
		
		
		
		
		
		
		sc.close();
	}

}
