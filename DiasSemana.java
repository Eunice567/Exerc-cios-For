import java.util.Scanner;

public class DiasSemana {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int x = sc.nextInt();
		String dia;
		
		switch (x) {
			case 1:
			dia = "Domingo";
			break;
			case 2:
			dia = "Seunga-feira";
			break;
			case 3: 
			dia = "Ter�a-feira";
			break;
			case 4:
			dia = "Quarta-feira";
			break;
			case 5:
			dia = "Quinta-feira";
			break;
			case 6:
			dia = "Sexta-feira";
			break;
			case 7:
			dia = "S�bado";
			break;
			default:
			dia = "valor invalido";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);
		
		
		
		sc.close();
		
	}

}
