public class Deposit extends Transaction {

    private Account acc;

    public Deposit(Account acc) {
        super(acc);
        this.acc = acc;
    }

    public void amendBalance(int amount) {
        acc.setBalance(acc.getBalance() + amount);
    }

}