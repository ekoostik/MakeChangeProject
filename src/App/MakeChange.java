package App;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		double price = itemCost();
		
		
//		System.out.println(price);

	}

// #1

	public static double itemCost() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Hello! welcome to the Make Change App!");
		System.out.print("Please enter the item price: ");
		double cost = sc.nextDouble();
		sc.close();
		return cost;
		

	}

//#2

//#3

// #4

	
	
}
