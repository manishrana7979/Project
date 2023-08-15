package self.kodnestproject.method.TemperatureConversion;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Temperature Conversion Tool!");
		System.out.println("Select an Option:");
		System.out.println("1. Convert Celsius to Fahrenheit");
		System.out.println("2. Convert Fahrenheit to Celsius");
		System.out.print("Enter your choice: ");
		int select = input.nextInt();
		
		switch(select)
		{
		case 1:
			celsiusToFahrenheit();
			break;
		case 2:
			fahrenheitToCelsius();
			break;
		default:
			System.out.println("Please enter a valid input");	
		}
		
	}
	public static void celsiusToFahrenheit()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Temperature in Celsius :");
		double c = input.nextDouble();
		double result = (c*9/5)+32;
		System.out.println(c+"°C is equivqlent to "+result+"°F");
		
	}
	
	public static void fahrenheitToCelsius()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Temperature in Fahrenheit :");
		double f = input.nextDouble();
		double result = (f-32)*5/9;
		System.out.println(f+"°F is equivqlent to "+result+"°C");
		
	}

}
