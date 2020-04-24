public class Account {

    private String name;
    private String accnum;
    private int balance;

    public Account() {
    }

    public Account(String name, String accnum, int balance) {
        this.name = name;
        this.accnum = accnum;
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccnum() {
        return this.accnum;
    }

    public void setAccnum(String accnum) {
        this.accnum = accnum;
    }
 
}