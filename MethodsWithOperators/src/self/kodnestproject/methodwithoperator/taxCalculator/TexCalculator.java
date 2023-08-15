package self.kodnestproject.methodwithoperator.taxCalculator;

import java.util.Scanner;

public class TexCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Tex Calculator");
		System.out.print("Enter the purchase amount : ");
		double purchaseAmount = scan.nextDouble();
		System.out.print("Enter the tax rate(in decimal) : ");
		double texRate = scan.nextDouble();
		double res = calculateTotalWithTax(purchaseAmount,texRate);
		System.out.println("Total cost including tax : "+res);
		

	}
	
	public static double calculateTotalWithTax(double purchaseAmount, double texRate)
	{
		double total = purchaseAmount*texRate;
		return purchaseAmount+total;
	}

}
