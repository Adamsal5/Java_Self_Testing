package day05_practice_tasks;

public class FactorialNumber {

    public static void main(String[] args) {

        int sum = 1;
        int num = 5;
        for (int i = num; i >= 1 ; i--) {
            sum *= i;
            
        }
        System.out.println(sum);



    }
}
