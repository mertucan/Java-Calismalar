package area_calculator;

import java.util.Scanner;


public class area_calculator {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		
		System.out.println("Yarıçapı giriniz:");
		Scanner input = new Scanner(System.in);
		
		double r = input.nextDouble();
		
		System.out.println("Dairemizin yarıçapı =" + r*r*3.14);
		
		input.close();
	}

}
