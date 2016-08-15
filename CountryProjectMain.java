package com.monday;

import java.util.Scanner;

public class CountryProjectMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String menuChoice = null;
		CountryReaderWriter countryReaderWriter = new CountryReaderWriter();
		CountryValidator countryValidator = new CountryValidator();
		boolean keepGoing = true;

		System.out.println("Welcome to the Country Projct");
		System.out.println("Please choose choose one of the following");
		do {
			System.out.println("1) Display List");
			System.out.println("2) Add to List");
			System.out.println("3) Exit Program");
			menuChoice = sc.nextLine();
			CountryValidator.validator(menuChoice);

			switch (menuChoice) {

			case "1":
				CountryReaderWriter.reader();
				break;
			case "2":
				CountryReaderWriter.writer();
				break;
			case "3":
				System.exit(0);
				break;
			default:
				System.out.println("Invalid entry please choose either 1, 2, or 3");
				break;
			}

		} while (keepGoing);
	}
}
