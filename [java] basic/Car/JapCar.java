public class JapCar extends Car {

    public JapCar(String model, String id, int price) {
        super(model, id, price);    
    }

    public double estimate() {
        this.price *= 0.7;
        return this.price;
    }
    
}