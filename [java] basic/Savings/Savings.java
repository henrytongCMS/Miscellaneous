class Savings {

    static int balance; // 聯名戶頭
    // int balance; // 個人戶頭

    public Savings() {
    }

    void deposit(int money) {
        balance += money;
        System.out.println("Deposite: " + money);
    }


    void withdraw(int money) {

        if( getBalance() >= money ) {
            balance -= money;
            System.out.println("Withdraw: " + money);

        } else {
            System.out.println("Not enough balance!");
        }
        
    }

    int getBalance() {
        return balance;
    }

}