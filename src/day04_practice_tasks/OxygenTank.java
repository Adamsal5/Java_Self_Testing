package day04_practice_tasks;

public class OxygenTank {

    public static void main(String[] args) {

        double oxygenLevel = 35;

        if (oxygenLevel >= 90 && oxygenLevel <= 100){
            System.out.println("Your tank is full");
        } else if (oxygenLevel >= 80 && oxygenLevel <90){
            System.out.println("Still okay");
        } else if (oxygenLevel >= 70 && oxygenLevel < 80){
            System.out.println("Don't go too far");
        } else if ( oxygenLevel >= 60 && oxygenLevel < 70){
            System.out.println("Start to head back");
        } else if (oxygenLevel >= 50 && oxygenLevel < 60){
            System.out.println("Be careful, you're at 50%");
        } else if (oxygenLevel >= 0 && oxygenLevel < 50){
            System.out.println("CAUTION: LOW OXYGEN");
        } else {
            System.out.println("Invalid");
        }



    }
}
