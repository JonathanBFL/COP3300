package Burkhart_p3;

import java.util.Scanner;
import java.util.Arrays;

public class polling {
	public static void main(String[] args) {

		String[] topics = { "computers", "cars", "politics", "games", "food" };
		int[][] responses = new int[5][11];
		int numPeople, rating;
		double avg = 0;
		double sum = 0;
		double[] zero = new double[] { 0, 0, 0, 0, 0 };
		double sumHigh = 0;
		double sumLow = 100;
		Scanner scnr = new Scanner(System.in);

		for (int i = 0; i <= 4; i++) {
			for (int j = 1; j <= 10; j++) {
				responses[i][j] = 0;
			}
		}
		System.out.println("How many people are going to be rating?");
		numPeople = scnr.nextInt();

		for (int i = 0; i < numPeople; i++) {

			for (int j = 0; j <= 4; j++) {
				int i1 = i + 1;
				System.out.println("Person " + i1 + ": " + topics[j]);
				responses[j][i] = scnr.nextInt();
			}

		}
		System.out.println("Responses");
		for (int o = 0; o < 5; o++) {
			System.out.print("\n" + (o + 1) + "." + topics[o] + "\t");
			if (o == 1 || o == 3 || o == 4) {
				System.out.print("\t");
			}
			for (int j = 0; j < 10; j++) {
				System.out.print(responses[o][j] + "\t");
				zero[o] = zero[o] + responses[o][j];
				sum = sum + responses[o][j];
			}
			if (sumHigh < sum) {
				sumHigh = sum;

			}
			if (sumLow > sum) {
				sumLow = sum;
			}

			double max = zero[0], min = zero[0];
			int maxI = 0, minI = 0;
			for (int i = 0; i < 5; i++) {
				if (max < zero[i]) {
					max = zero[i];
					maxI = i;
				}
			}

			System.out.print("Sum=" + sum + "\t");
			sum = 0;
			avg = zero[o] / 10;
			System.out.print("Average=" + avg);
			if (o == 4) {

				System.out.println(
						"\nThe issue that recieved the most amount of points was " + topics[maxI] + " with " + sumHigh);
				System.out.println(
						"The issue that recieved the least amount of points was " + topics[minI] + " with " + sumLow);

			}

		}

	}

}
