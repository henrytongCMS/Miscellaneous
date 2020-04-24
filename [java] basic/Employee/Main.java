
public class Main{
    public static void main(final String[] args) {

        Employee e1 = new Employee("001");
        Employee e2 = new Employee("002", e1);
        Employee e3 = new Employee("003", e2);
        Employee e4 = new Employee("004", e3);

        e1.addBonus(10000);
        e2.addBonus(20000);
        e3.addBonus(30000);
        e4.addBonus(40000);

        System.out.println(e1.getID() + ": " + e1.getBonus());
        System.out.println(e2.getID() + ": " + e2.getBonus());
        System.out.println(e3.getID() + ": " + e3.getBonus());
        System.out.println(e4.getID() + ": " + e4.getBonus());

    }
}