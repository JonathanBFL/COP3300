package Burkhart_p2;

import java.util.Scanner;
import java.lang.Math;

public class BMI {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double lbs;
		double ft;
		double in;
		double trueIn;
		double kg;
		double met;
		int meas = 0;
		String ans;
		double bmi;

		System.out.println("Imperial or Metric?");
		ans = input.next();

		if (ans.contains("imperial") || ans.contains("Imperial")) {
			meas = 0;
		} else if (ans.contains("metric") || ans.contains("Metric")) {
			meas = 1;
		} else {
			System.out.println("invalid entry");
		}

		if (meas == 1) {
			System.out.println("Enter weight in kg: ");
			kg = input.nextDouble();
			System.out.println("Enter height in meters: ");
			met = input.nextInt();
			bmi = (kg / (Math.pow(met, 2)));
			System.out.printf("Your BMI is %.2f\n", bmi);
		}

		else if (meas == 0) {
			System.out.println("Enter weight in lbs: ");
			lbs = input.nextDouble();
			System.out.println("Enter height in feet: ");
			ft = input.nextInt();
			System.out.println("Enter height in inches: ");
			in = input.nextInt();
			trueIn = ((ft * 12) + in);
			bmi = ((703 * lbs) / (Math.pow(trueIn, 2)));
			System.out.printf("Your BMI is %.2f\n", bmi);
		}
		System.out.println(
				"BMI Categories:\nUnderweight = <18.5\nNormal weight = 18.5–24.9\nOverweight = 25–29.9\nObesity = BMI of 30 or greater");

	}
}