import java.io.*;

public class Demo {
    public static void main (String [] argv) throws IOException {

        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));

        Account a = new Account();

        System.out.print("Please enter your name => ");
        a.setName(b.readLine());

        System.out.print("Please enter your account ID => ");
        a.setAccnum(b.readLine());

        a.setBalance(10000);

        System.out.println("----------------------------------");
        System.out.println("Name: "+ a.getName());
        System.out.println("Balance: "+ a.getBalance());
        
        Transaction t = null;
        boolean isContinue = false;

        do {

            System.out.print("Please choose transaction type: (1) Deposit (2) Withdraw => ");
            int typeId = Integer.parseInt(b.readLine());

            switch(typeId) {

                case 1:
                    t = new Deposit(a);
                    break;

                case 2:
                    t = new Withdraw(a);
                    break;

            }

            System.out.print("Please enter transaction amount => ");
            t.amendBalance(Integer.parseInt(b.readLine()));

            System.out.print("Another transaction (Y/N)? => ");
            String str = b.readLine();
            isContinue = str.equals("Y") || str.equals("y");
        
        } while(isContinue);

        System.out.println("----------------------------------");
        System.out.println("Name: "+ a.getName());
        System.out.println("Balance: "+ a.getBalance());
        System.out.println("Number of transaction objects created: "+ Transaction.counter);

    }
}