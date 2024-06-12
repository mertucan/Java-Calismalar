package swtich_case_ornek;

import java.util.Scanner;

public class switch_case_ornek {

	public static void main(String[] args) 
	{
		System.out .println("Bir sayı giriniz :");
		Scanner sayi = new Scanner(System.in);
		int ay = sayi.nextInt();
		String ayString = switch(ay){
		case 1 -> "Ocak";
		case 2 -> "Şubat";
		case 3 -> "Mart";
		case 4 -> "Nisan";
		case 5 -> "Mayıs";
		case 6 -> "Haziran";
		case 7 -> "Temmuz"
		case 8 -> "Agustos";
		case 9 -> "Eylul";
		case 10-> "Ekim";
		case 11-> "Kasım";
		case 12-> "Aralık;
		default-> "Hata! 1 ile 12 arası sayı";
		};
		System.out.println(ayString);

	}

}
