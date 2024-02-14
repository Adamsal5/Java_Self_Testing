package day14_practice_tasks.car_tasks;

public class CarClients {

    public static void main(String[] args) {


        Car car1 = new Toyota("Toyota", "Venza", 2011, 12_000, "Grey");
        System.out.println(car1);
        car1.start();
        car1.drive();

        System.out.println("----------------------------------");


        Car honda = new Honda("Honda", "Pilot", 2004, 10_000, "Rusted Black");
        System.out.println(honda);
        honda.start();
        honda.drive();

        System.out.println("-----------------------");

        Car bmw = new BMW("BMW", "M3", 2024, 50_000, "Purple" );
        System.out.println(bmw);
        bmw.start();
        bmw.drive();

        System.out.println("------------------------------");

        Audi audi = new Audi("Audi", "A6", 2018, 17_000, "Black");
        System.out.println(audi);

        audi.start();
        audi.autoPark();
        audi.drive();

        System.out.println("-----------------------");

        Mercedes mercedes = new Mercedes("Mercedes","AMG C63", 2015, 30_000, "White");
        System.out.println(mercedes);

        mercedes.start();
        mercedes.autoPark();
        mercedes.drive();

        System.out.println("------------------------------");

        Tesla tesla = new Tesla("Tesla", "X", 2022, 38_000, "Red")
;
        System.out.println(tesla);
        tesla.start();
        tesla.drive();
        tesla.selfDrive();
        tesla.autoPark();

        System.out.println("---------------------------");

        Nio nio = new Nio("Nio", "6", 2017, 20_000, "White");

        System.out.println(nio);

        nio.start();
        nio.drive();
        nio.autoPark();
        nio.selfDrive();


        System.out.println("---------------------------");

        CydeoCar cydeoCar = new CydeoCar("Cydeo", "Car", 1965, 1_000_000_000, "Invisible" );

        System.out.println(cydeoCar);
        cydeoCar.drive();
        cydeoCar.start();
        cydeoCar.autoPark();
        cydeoCar.selfDrive();
        cydeoCar.fly();


    }

}
