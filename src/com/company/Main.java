package com.company;
import java.util.Scanner;
class Math {
	public double gallons(double mpg, double length){
		double gas_amount = length/mpg;
		return gas_amount;
	}
}
public class Main {

    public static void main(String[] args) {
    Scanner Obj1 = new Scanner(System.in);
    System.out.println("How many combined MPG does your vehicle get?");
    double mpg = Obj1.nextDouble();
    Scanner Obj2 = new Scanner(System.in);
    System.out.println("How long in miles will your trip be?");
    double length = Obj2.nextDouble();
	Scanner Obj = new Scanner(System.in);
	System.out.println("What kind of fuel are you using, 87, 89, or 91");
	int fuel = Obj.nextInt();
	switch (fuel) {
		case 87:
			Math trip1 = new Math();
			double amount = trip1.gallons(mpg, length);
			String[] trip_87 = {"87 Octane", "Your trip amount is"};
			for (String i : trip_87){
				System.out.println(i);
			}
			System.out.println("$" + amount*2.33);break;
		case 89:
			Math trip2 = new Math();
			double amount2 = trip2.gallons(mpg, length);
			System.out.println("It will cost $" + amount2*2.77);break;
		case 91:
			Math trip3 = new Math();
			double amount3 = trip3.gallons(mpg, length);
			System.out.println("It will cost $" + amount3*3.00);break;
	}


    }
}
