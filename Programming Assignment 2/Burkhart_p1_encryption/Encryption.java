package Burkhart_p1_encryption;

import java.util.Scanner;

public class Encryption {
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

		one = (one + 7) % 10;
		two = (two + 7) % 10;
		three = (three + 7) % 10;
		four = (four + 7) % 10;

		one1 = one;
		one = three;
		three = one1;

		two1 = two;
		two = four;
		four = two1;

		System.out.println("Encrypted code: " + one + two + three + four);
	}

}