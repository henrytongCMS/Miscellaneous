public class Main {
    public static void main(String [] argv) {

        Savings tom = new Savings();
        Savings amy = new Savings();

        tom.deposit(12000);

        System.out.println("Balance: " + tom.getBalance());

        amy.withdraw(3000);

        System.out.println("Balance: " + amy.getBalance());

        tom.withdraw(10000);

        System.out.println("Balance: " + tom.getBalance());

        
    }

}