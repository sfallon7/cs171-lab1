//Sean Fallon
//COMP 171
//Fall 19
//Lab 1

import java.util.Scanner;

public class tip_calculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double bill;
        double total;
        double tip;
        double percentage;

        System.out.println("Welcome To The Tip Calculator");

        System.out.print("Enter the check total: ");
        bill = input.nextDouble();

        System.out.print("Enter the gratuity rate: ");
        tip = input.nextDouble();

        tip = (tip / 100) * bill;
        total = bill + tip;

        total = (total * 100.00) / 100.00;
        tip = (tip * 100) / 100;

        System.out.print("The gratuity is $");
        System.out.printf("%.2f", tip);
        System.out.print(" and the total is $");
        System.out.printf("%.2f", total);

    }


}
