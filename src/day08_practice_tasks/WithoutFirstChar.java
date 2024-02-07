package day08_practice_tasks;

/*
2. Create a class named WithoutFirstChar. Ask the user to enter two words. Print the first word without its
first character, then print the second word without its first character.

        Example:
              Inputs:
                  apple
                  banana

              Output:
                   ppleanana

 */

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class WithoutFirstChar {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first word:");
        String firstWord = input.next();

        System.out.println("Enter your second word:");
        String secondWord = input.next();

        System.out.println(firstWord.substring(1) + secondWord.substring(1));

        input.close();


    }
}
