package Burkhart_p1_decryption;

import java.util.Scanner;

public class decryption {
	public static void main(String[] args) {
		int one;
		int two;
		int three;
		int four;
		int code;
		int one1;
		int two1;

		Scanner scnr = new Scanner(System.in);

		System.out.println("Enter number: ");
		code = scnr.nextInt();

		one = code / 1000;
		two = code / 100 % 10;
		three = code / 10 % 10;
		four = code % 10;

		if (one < 7 && one >= 0)
			one = one + 10;
		if (two < 7 && two >= 0)
			two = two + 10;
		if (three < 7 && three >= 0)
			three = three + 10;
		if (four < 7 && four >= 0)
			four = four + 10;

		one = (one - 7);
		two = (two - 7);
		three = (three - 7);
		four = (four - 7);

		one1 = one;
		one = three;
		three = one1;

		two1 = two;
		two = four;
		four = two1;

		System.out.println("Encrypted code: " + one + two + three + four);
	}

}