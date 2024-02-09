package day13_practice_tasks.phone;

public class Phone {

    private String brand;
    private String model;
    private String size;
    private double price;
    private String color;

    private final String phoneNumber = "+1 (123) 456-7890";

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    public final void call(){
        System.out.println("Calling the number " + phoneNumber);
    }

    public final void text(){
        System.out.println("Texting the number " + phoneNumber);
    }

    public final void facetime(){
        System.out.println("Facetiming with the number " + phoneNumber);
    }



    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
