package day06_practice_tasks;

public class MaximumAndMinimum {

    public static void main(String[] args) {

        int a = max(100, 200);
            System.out.println(a + " is the bigger number");



    }



    public static int max(int num1 , int num2){
        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }




    }

}
