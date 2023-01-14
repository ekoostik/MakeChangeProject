package App;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		double price = itemCost();
		double paid = moneyGivin();
		double change = prompt(price, paid);


		// System.out.println(price);
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

	public static double prompt(double cost, double paid) {

		if (cost > paid) {
			double stillOwe = cost - paid;

			System.out.println("The customer still owes $" + stillOwe);
			return stillOwe;
		} else if (cost < paid) {
			double change = paid - cost;
			System.out.println("You owe the customer $" + change);
			return change;
		} else {
			double perfect = 0;
			System.out.println("Perfect! Exact payment, take a 10 min break!");
			return perfect;
		}
	}

// #4

}
