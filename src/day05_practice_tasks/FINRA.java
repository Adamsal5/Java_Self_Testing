package day05_practice_tasks;

public class FINRA {

    public static void main(String[] args) {

        int num = 2;
        int n = 100;


        do {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.print("FINRA ");
            } else if (num % 3 == 0) {
                System.out.print("FIN ");
            } else if (num % 5 == 0) {
                System.out.print("RA ");
            } else {
                System.out.print(num + " ");
            }
            num++;
        }while (num <= n );



        }
}

