package com.monday;

public class CountryValidator {

	public static boolean validator(String menuChoice) {
		if (menuChoice.equals("1") || menuChoice.equals("2") || menuChoice.equals("3") || menuChoice.equals("4")) {
			try {
				int number = Integer.parseInt(menuChoice);
				return false;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				return true;
			}
		}
		return false;
	}
}
