package javacore11;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


public class Aplication {
	
	final static Random random = new Random();
	
	static void menu() {

		System.out.println("Натисніть 1 щоб вивести всі дані з масиву ");
		System.out.println("Натисніть 2 щоб змінити поле кількість кінських сил у Авто");
	}

	public static void main(String[] args) {

		Integer[] mass = new Integer[10];
		for (int i = 0; i < mass.length; i++) {
			mass[i] = random.nextInt(9);
		}

		Arrays.sort(mass);
		
		System.out.println(Arrays.deepToString(mass));
		
		Arrays.sort(mass, Collections.reverseOrder());
		
		System.out.println(Arrays.deepToString(mass));
		
	// Друге завдання
		
		int count = 1 + (int)(Math.random()*5);
		
		Object [] [] avtomobil = new Object [count] [count] ;
		
		int weelsize = 15 + (int)(Math.random()*8);
		
		int enginecylinders = 1 + (int) (Math.random()*15);
		
		int hp = 50 + (int) (Math.random()*950);
		
		int year = 1950 + (int) (Math.random()*70);
		
		String steeringwheelmaterial = "Alkantara";
		
		SteeringWheel s = new SteeringWheel(weelsize, steeringwheelmaterial);
		
		Engine e = new Engine(enginecylinders);
		
		int i, j;
		
		for (i = 0; i < count; i++)
			for (j = 0; j < count; j++) {
				avtomobil[i][j] = new Auto(hp, year, s, e);
			}
		
		
		while (true) {
			menu();
			Scanner sc = new Scanner(System.in);
			switch (sc.next()) {
			case "1": {
				System.out.println(Arrays.deepToString(avtomobil));
				break;
			}
			case "2": {
				System.out.println("Enter power");
				sc = new Scanner(System.in);
				int power = sc.nextInt();
				
				System.out.println("Enter year");
				int years = sc.nextInt();
				
				System.out.println("Enter wheel size");		
				int wsize = sc.nextInt();
		
				SteeringWheel se = new SteeringWheel(wsize, "Alkantara");
				
				System.out.println("Enter amount of cylinders");
				int xcylinders = sc.nextInt();
				
				Engine en = new Engine(xcylinders);
				
				Auto m = new Auto(power, years, se, en);
				
				int i1, j1;
				
				for (i1 = 0; i1 < count; i1++)
					for (j1 = 0; j1 < count; j1++) {
						avtomobil[i1][j1] = m;
					}
				
				break;
			}
			}
		}

	}
}
