package com.test;

import java.io.FileInputStream;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\Pradeep\\Desktop\\sample.properties");
			Scanner scanner= new Scanner(fis);
			
			while(scanner.hasNextLine()){
				System.out.println(scanner.nextLine());
			}
		}catch (Exception e) {
			System.out.println(e);
		}
	}
}
