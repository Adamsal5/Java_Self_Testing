package day07_practice_tasks;

public class RectangleClient {


    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();

        rectangle.length = 32;
        rectangle.width = 20;

        System.out.println("Length: " + rectangle.length);
        System.out.println("Width: " + rectangle.width);


        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        System.out.println(rectangle);



    }


}
