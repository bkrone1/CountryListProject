package com.monday;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CountryReaderWriter {
	static String countryInput = null;
	static Scanner sc = new Scanner(System.in);
	static Path ourNewPath = Paths
			.get("\\Users\\admin\\new workspace\\Week3Day1\\src\\com\\monday\\countriesOfTheWorld.txt");
	static File countriesOfTheWorld = ourNewPath.toFile();

	public static void writer() {

		System.out.println("Add a country");
		countryInput = sc.nextLine();
		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(countriesOfTheWorld, true)))) {

			out.println(countryInput);

			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void reader() {

		try (BufferedReader in = new BufferedReader(new FileReader(countriesOfTheWorld))) {
			String countries;
			while ((countries = in.readLine()) != null) {

				System.out.println(countries);
			}
			in.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}


}
