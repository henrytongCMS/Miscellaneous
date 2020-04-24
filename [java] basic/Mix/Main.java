public class Main {
    public static void main(String [] argv) {

        Animal dummy = new Animal();
        dummy.eat();
        
        Animal horse = new Horse();
        horse.eat();

        Horse myhorse = new Horse();
        myhorse.eat("carrots");

    }
}