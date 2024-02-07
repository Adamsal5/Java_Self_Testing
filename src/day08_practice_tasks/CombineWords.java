package day08_practice_tasks;

import java.util.Scanner;

public class CombineWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a first word:");
        String firstWord = input.next();

        System.out.println("Enter a second word:");
        String secondWord = input.next();

        input.close();

        if (firstWord.charAt(firstWord.length()-1) == secondWord.charAt(0)) {
            firstWord = firstWord + secondWord.substring(1);
            System.out.println(firstWord);
        } else {
            firstWord = firstWord.concat(secondWord);
            System.out.println(firstWord);
        }
    }

}
