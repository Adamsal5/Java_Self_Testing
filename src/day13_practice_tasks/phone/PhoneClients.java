package day13_practice_tasks.phone;

public class PhoneClients {

    public static void main(String[] args) {

        IPhone iPhone1 = new IPhone("Apple", "15 Pro Max", "14.7", 1250, "Black");
        Samsung samsung1 = new Samsung("Samsung", "Galaxy", "Big", 970, "Purple");
        Nokia nokia1 = new Nokia("Nokia", "Old", "Small", 250, "White");


        System.out.println(iPhone1);
        iPhone1.call();
        iPhone1.text();
        iPhone1.facetime();

        System.out.println("----------------------------------");

        System.out.println(samsung1);
        samsung1.call();
        samsung1.text();

        System.out.println("----------------------------------");

        System.out.println(nokia1);
        nokia1.call();


    }

}
