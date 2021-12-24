package Dolar2Udemy;
import java.util.Locale;
import java.util.Scanner;
public class principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		CalcDolar X = new CalcDolar();
		System.out.print("Valor do dolar: ");
		X.d = Double.parseDouble(sc.nextLine());
		System.out.print("Quantidade de dolares: ");
		X.qtD = Double.parseDouble(sc.nextLine());

		System.out.printf("Valor convertido: R$ %.2f",X.resFinal());
	}
}