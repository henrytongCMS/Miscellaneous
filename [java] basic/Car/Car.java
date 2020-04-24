public abstract class Car {

    public String model;
    public String id;
    public int price;

    public Car() {
    }

    public Car(String model, String id, int price) {
        this.model = model;
        this.id = id;
        this.price = price;
    }

    public abstract double estimate();

}