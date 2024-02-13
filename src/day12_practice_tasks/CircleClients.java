package day12_practice_tasks;

public class CircleClients {

    public static void main(String[] args) {

        Circle circle1 = new Circle(7);
        // circle1.setRadius(8);
        System.out.println(circle1);

        System.out.println("-------------------------------");

        Circle circle3 = new Circle(25);
        System.out.println(circle3);

        System.out.println("-------------------------------");


        Circle circle2 = new Circle(-3); // error
        System.out.println(circle2);



    }

}
