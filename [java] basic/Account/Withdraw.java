public class Withdraw extends Transaction {

    private Account acc;

    public Withdraw(Account acc) {
        super(acc);
        this.acc = acc;
    }

    public void amendBalance(int amount) {
        if( amount <= acc.getBalance() )
            acc.setBalance(acc.getBalance() - amount);
        else
            System.out.println("Your balance is not enough for this transaction.");
    }

}