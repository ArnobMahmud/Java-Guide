/* 
   Author : Arnob Mahmud

   Mail : arnob.tech.me @ gmail.com  
*/

package Maths;
import java.util.Scanner;

public class TemperatureConvert {

	private static Scanner input;

	public static void main(String[] args) {

		input = new Scanner(System.in);
		double c, f;

		System.out.print("Enter the value of temperature :");
		c = input.nextDouble();

		f = (float) (1.8 * c + 32);

		System.out.printf("The temperature in fahrenheit scale is :%.4f", f);

	}

}
