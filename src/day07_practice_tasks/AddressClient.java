package day07_practice_tasks;

public class AddressClient {

    public static void main(String[] args) {

        Address address = new Address();

        address.buildingNumber = 55;
        address.street = "Mansaf Dr";
        address.city = "Chicago";
        address.state = "Illinios";
        address.zipCode = "45456";

        System.out.println(address);




    }

}
