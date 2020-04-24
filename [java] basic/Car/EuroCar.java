public class EuroCar extends Car {

    public EuroCar(String model, String id, int price) {
        super(model, id, price);    
    }

    public double estimate() {
        this.price *= 0.8;
        return this.price;
    }
    
}