package day07_practice_tasks;

import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your score:");
        double score = input.nextDouble();

        if (score >= 90 && score <= 100) {
            System.out.println("You grade is A");
        } else if (score >= 80 && score < 90) {
            System.out.println("You grade is B");
        } else if (score >= 70 && score < 80) {
            System.out.println("You grade is C");
        } else if (score >= 60 && score < 70) {
            System.out.println("You grade is D");
        } else if (score < 60 && score > 0) {
            System.out.println("You grade is F");
        } else {
            System.out.println("Invalid Score");
        }

        input.close();

    }
}
