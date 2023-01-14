package App;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		double price = itemCost();
		double paid = moneyGivin();

//		System.out.println(price);
//		System.out.println(paid);
	}

// #1

	public static double itemCost() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Hello! welcome to the Make Change App!");
		System.out.print("Please enter the item price: ");
		double cost = sc.nextDouble();
		sc.nextLine();
		return cost;

	}

//#2
	public static double moneyGivin() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Now enter the amount the customer paid: ");
		double paid = sc.nextDouble();
		sc.nextLine();
		return paid;

	}

//#3

// #4

}
