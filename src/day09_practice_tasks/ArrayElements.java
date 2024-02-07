package day09_practice_tasks;

public class ArrayElements {

    public static void main(String[] args) {

        int[] number = new int[100];

        for (int i = 0; i < number.length+1; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int j = number.length; j >= 0; j--) {
            System.out.print(j + " ");
        }

        System.out.println();

        for (int k = 0; k < number.length; k++) {
            if (k % 5 == 0){
                System.out.print(k + " ");
            }

        }

    }

}
