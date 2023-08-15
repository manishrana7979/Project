package self.kodnestproject.method.CalculatorDilemma;

import java.util.Scanner;

public class CalculatorDilemma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two number");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		int option = input.nextInt();
		
		switch(option)
		{
		case 1:
			System.out.println("Addtion of two number is "+(num1+num2));
			break;
		case 2:
			System.out.println("Subtraction of two number is "+(num1-num2));
			break;
		case 3:
			System.out.println("Multiplication of two number is "+(num1*num2));
			break;
		case 4:
			System.out.println("Division of two number is "+(num2/num1));
			break;
			default :
				System.out.println("Please Enter vaild Input");
		}
	}

}
