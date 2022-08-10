import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantos números você quer digitar? ");
		int num = sc.nextInt();
		int in = 0;
		int out = 0;
		for (int i = 1; i<=num; i = i + 1 ) {
			System.out.print("Digite um valor: ");
			int x = sc.nextInt();
			if (x >= 10 && x <=20) {
				in = in + 1;
			} else {
				out = out + 1;
			}
		}
		
		System.out.println(in + " in");
		System.out.println(out + " out");
		
		
		sc.close();
		

	}

}
