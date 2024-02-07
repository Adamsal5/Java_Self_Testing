package day07_practice_tasks;

public class ItemClients {

    public static void main(String[] args) {

        Item item = new Item();

        item.itemName = "Computer";
        item.unitPrice = 10_000;
        item.quantity= 1;

        System.out.println("Item Name: " + item.itemName);
        System.out.println("Unit Price; " + item.unitPrice);
        System.out.println("Quanity: " + item.quantity);

        item.calcCost();

        System.out.println(item);

    }

}
