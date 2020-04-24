public abstract class Transaction {

    private Account acc;
    public static int counter = 0;

    public Transaction(Account acc) {
        this.acc = acc;
        counter += 1;
    }

    public abstract void amendBalance(int amount);

}