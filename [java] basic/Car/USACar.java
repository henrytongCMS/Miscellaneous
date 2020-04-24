public class USACar extends Car {

    public USACar(String model, String id, int price) {
        super(model, id, price);    
    }

    public double estimate() {
        this.price *= 0.6;
        return this.price;
    }
    
}