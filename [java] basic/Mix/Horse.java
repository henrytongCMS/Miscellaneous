public class Horse extends Animal {

    // Overriding
    public void eat() {
        System.out.println("Horse eating hay");
    }

    // Overloading
    public void eat(String str) {
        System.out.println("Horse eating " + str);
    }

}