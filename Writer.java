package com.monday;

import java.io.*;
import java.nio.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Writer {

	public static void main(String[] args) {

		Path ourNewPath = Paths.get("\\Users\\admin\\desktop\\anewtextfile.txt");
		File aNewFileObj = ourNewPath.toFile();

		try (PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(aNewFileObj, true)))) {

			out.println("Claire");

		} catch (IOException e) {
			e.printStackTrace();
		}

		try (BufferedReader in = new BufferedReader(new FileReader(aNewFileObj))) {
			String peopleInClassRoom;
			while ((peopleInClassRoom = in.readLine()) != null) {

				System.out.println(peopleInClassRoom);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}// main
}// class
