package self.kodnestproject.methodwithoperator.MethodOverloadingCalculator;

import java.util.Scanner;

public class MethodOverloadingCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		double num1 = scan.nextDouble();
		System.out.println("Enter the second number: ");
		double num2 = scan.nextDouble();
		System.out.println("Enter the operator (+, -, *, /): ");
		char select = scan.next().charAt(0);
		
		double res =calculate(num1,num2,select);
		System.out.println("Result: "+res);
		}
	public static double calculate(double num1, double num2, char select)
	{
		double result = 0.0;
		
		switch(select)
		{
		case'+' :
			result = num1+num2;
			break;
		case'-' :
			result = num1-num2;
			break;
		case'*' :
			result = num1*num2;
			break;
		case'/' :
			result = num1/num2;
			break;
		default :
			System.out.println("Invalid input");	
		}
		return result;
	}

}
