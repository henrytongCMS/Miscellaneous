public class Main {
    public static void main(String [] argv) {

        Frame f1 = new Frame("Brand-A", "iron", 2000);
        Frame f2 = new Frame("Brand-B", "alloy", 3000);
        Frame f3 = new Frame("Brand-C", "carbon", 5000);

        Wheel w1 = new Wheel("16-inch", 16, 2000);
        Wheel w2 = new Wheel("20-inch", 20, 3000);

        Bicycle b1 = new Bicycle(f1, w1);
        System.out.println("First bicycle, the price is: " + b1.getCost());

        Bicycle b2 = new Bicycle(f2, w2);
        System.out.println("Second bicycle, the price is: " + b2.getCost());

        b1.changeFrame(f3);
        System.out.println("First bicycle, after changing frame, the new price is: " + b1.getCost());

        System.out.println("How much bicycle? : " + Bicycle.bicycleCounter);

    }
}