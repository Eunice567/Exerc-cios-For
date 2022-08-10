import java.util.Locale;
import java.util.Scanner;

public class VendaMacas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("VENDA DE MA��S");
		System.out.println("----PRE�OS----");
		System.out.println("MA��S (UNIDADE) =  R$ 0,30");
		System.out.println("MA��S A PARTIR DE UMA D�ZIA: R$ 0,25");
		
		System.out.println("Quantidade de ma��s: ");
		int maca = sc.nextInt();
		double total = 1;
		
				
		
		
		if (maca <12) {
			total = maca * 0.30;
		} else {
			total = maca * 0.25;
		} 
		
		System.out.printf("Voc� comprou %d ma�as, e o total foi %.2f%n", maca, total);
		
		
		
		
		
		
		sc.close();
	}

}
