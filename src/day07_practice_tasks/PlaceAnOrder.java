package day07_practice_tasks;

import java.util.Scanner;

public class PlaceAnOrder {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter product name:");
        String productName = input.nextLine();

        System.out.println("Enter the price");
        double price = input.nextDouble();

        System.out.println("Enter the quantity");
        int quantity = input.nextInt();

        input.nextLine();

        System.out.println("Enter your first name:");
        String firstName = input.nextLine();

        double total = price * quantity;

        input.close();

        System.out.println(firstName + " , your order for "+ quantity + " " + productName + " has been placed. " +
                "Your total is " + total + ".");





    }

}
