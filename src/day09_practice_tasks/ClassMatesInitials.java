package day09_practice_tasks;

import java.util.Arrays;

public class ClassMatesInitials {

    public static void main(String[] args) {

        String[] classmates = {"Adam Saleh", "Muhtar Junior", "Amel Kadric", "Aisulu Heyl", "Windy Ind", "Mohammed Alnaimi", "Jamal Saleh"};

        String[] initials = findInitials(classmates);
        System.out.println(Arrays.toString(initials));


    }

    public static String[] findInitials (String[] names){

        String[] initials = new String[names.length];

        for (int i = 0; i < names.length ; i++) {

            initials [i] = "\n" + names [i].charAt(0) + "." + names[i].charAt(names[i].indexOf(" ") + 1) ;

        }

        return initials;

    }
}


/*
2. Create a class named ClassMatesInitials and write a program with the following specifications:
   2.1 Create an array of strings named classmates.
   2.2 Store full names of 10 classmates.
   2.3 Print the initials of each student's name in separate lines.

 Create a class named GroceryItems and write a program with the following specifications:
    10.1 Given the following array:
         String[][] items = {
             {"Apple", "Banana", "Grape", "Avocado"},
             {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
             {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
         };



 */