public class Main {
    public static void main(String [] argv) {

        MaxOverload tom = new MaxOverload();
        
        System.out.println("Max = " + tom.findMax(5, 8));
        System.out.println("Max = " + tom.findMax(5.23, 5.43));
    
    }
}