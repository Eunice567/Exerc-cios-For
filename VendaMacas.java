import java.util.Locale;
import java.util.Scanner;

public class VendaMacas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("VENDA DE MAÇÃS");
		System.out.println("----PREÇOS----");
		System.out.println("MAÇÃS (UNIDADE) =  R$ 0,30");
		System.out.println("MAÇÃS A PARTIR DE UMA DÚZIA: R$ 0,25");
		
		System.out.println("Quantidade de maçãs: ");
		int maca = sc.nextInt();
		double total = 1;
		
				
		
		
		if (maca <12) {
			total = maca * 0.30;
		} else {
			total = maca * 0.25;
		} 
		
		System.out.printf("Você comprou %d maças, e o total foi %.2f%n", maca, total);
		
		
		
		
		
		
		sc.close();
	}

}
