import java.util.Scanner;

public class EstruturaWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero = sc.nextInt();
		int totPar = 0;
		int totImpar = 0;
		while (numero != 0) {
			System.out.println("Digite um número:");
			numero = sc.nextInt();
			if (numero%2 == 0) {
				totPar = totPar + 1;
			} else {
				totImpar = totImpar + 1;
			}
			
		}
		
		System.out.println("O total de números pares foi " + totPar);
		System.out.println("O total de números impares foi " + totImpar);
		
		
		
		sc.close();
	}

}
