package ro.sci.unitesting.digitalsum;

/*
 * (C) Copyright 2015 Scoala Informala IT
 *
 * All rights reserved
 */


import java.util.Scanner;

public class PrimeDigitsSum {

	public static class InvalidNumberException extends Exception {
		/**
		 * 
		 */
		private static final long serialVersionUID = 5340243721982843095L;

		public InvalidNumberException(String string) {
			super(string + " it is not a valid number!");
		}
	}

	private long calculatePrimeDigitsSum(char[] array) {
		long result = 0;
		for (int i = 0; i < array.length; i++) {
			int digit = Character.getNumericValue(array[i]);
			if (isDigitPrime(digit)) {
				result = result + digit;
			}
		}
		return result;
	}

	private boolean isDigitPrime(int digit) {
		if (digit == 0 || digit == 1 || digit == 9
				|| (digit != 2 && digit % 2 == 0)) {
			return false;
		} else {
			return true;
		}
	}

	public long calculateDigitsCum(String stringNumber)  throws InvalidNumberException {
		if (stringNumber == null) {
			throw new InvalidNumberException("NULL");
		}
		
		if (!stringNumber.matches("\\d+$")) {
			throw new InvalidNumberException(stringNumber);
		}
		
		char[] charArray = stringNumber.toCharArray();
		long result = calculatePrimeDigitsSum(charArray);
		return result;
	}

	public static void main(String args[]) throws Exception {

		boolean correct = false;

		Scanner sc = new Scanner(System.in);
		PrimeDigitsSum pds = new PrimeDigitsSum();

		System.out.print("Please enter a number: ");
		String stringNumber = sc.nextLine().trim();

		if (stringNumber.matches("\\d+$")) {
			correct = true;
		}

		while (!correct) {
			System.out.print("Please enter a corect number: ");
			stringNumber = sc.nextLine().trim();

			if (stringNumber.matches("\\d+$")) {
				correct = true;
			}
		}

		long result = pds.calculateDigitsCum(stringNumber);
		System.out.println("Your sum of prime digits is: " + result);

		sc.close();

	}

}
