public class Main {
    public static void main(String [] argv) {

        Shape shape = new Circle(1,1,10);
        shape.draw();

        System.out.println("--------------------------");

        shape = new Cone(0,1,5,2,2,3,3);
        shape.draw();
    
    }
}