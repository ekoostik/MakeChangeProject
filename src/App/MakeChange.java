package App;

import java.util.Scanner;

public class MakeChange {

	public static void main(String[] args) {
		double price = itemCost();
		double paid = moneyGivin();
		double change = prompt(price, paid);

// 		System.out.println(price);
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
		sc.close();
		return paid;

	}

//#3

	public static double prompt(double cost, double paid) {

		if (cost > paid) {
			double stillOwe = cost - paid;
			System.out.println("The customer still owes $" + stillOwe);
			return stillOwe;
		} 
		else if (cost < paid) {
			double change = paid - cost;
			System.out.println(" Customer is owed $" + change + " in change.");

			double tens = (int)change / 10;
			change = change % 10;
			double fives = (int)change / 5;
			change = change % 5;
			double single = (int)change / 1;
			change = change % 1;
			double quart = change / .25;
			change = change % .25;
			double dime = change / .1;
			change = change % .1;
			double nick = change / .05;
			change = change % .05;
//			System.out.println(change);
			double penn = (change + .005) * 100;
			change = change % .01;

			if (tens != 0) {
				System.out.print((int) tens + " :Ten dollar bill, ");
			}
			if (fives != 0) {
				System.out.print((int) fives + " :Five dollar bill, ");
			}
			if (single  != 0) {
				System.out.print((int) single + " :One dollar bill, ");
			}
			if (quart != 0 && quart > 1) {
				System.out.print((int) quart + " :Quarter, ");
			}
			if (dime != 0 && dime > 1) {
				System.out.print((int) dime + " :Dime, ");
			}
			if (nick != 0 && nick > 1) {
				System.out.print((int) nick + " :Nickel, ");
			}
			if (penn != 0) {
				System.out.print((int)penn + " :Penny, ");
			}
			return change;
		}
	
			
			else {
			double perfect = 0;
			System.out.println("Perfect! Exact payment, take a 10 min break!");
			return perfect;
		}
	

}
}
