package com.example.Insurance;
import java.util.Scanner;

public class UseInsurance {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Insurance life;
		Insurance health;
		
		life = new Life("Life");
		health = new Health("Health");
		
		boolean x = true;
		
		do {
			System.out.print("Choose type of Inusrance to be displayed\n\n"
					+ "[1]Life Insurance\n[2]Health Insurance"
					+ "\n\ntype here: ");
			String choose = sc.nextLine();
			
			if (choose.equals("1")) {
				clear();
				life.display();
				x = false;
			} else if (choose.equals("2")) {
				clear();
				health.display();
				x = false;
			} else {
				clear();
				System.out.println("Invalid input! input should be 1 for Life, 2 for health\n\n");
				x = true;
			}
		} while(x);
		
	}
	public static void clear() {
		for (int i = 0; i < 70; i++) {
			System.out.println();
		}
	}

}
