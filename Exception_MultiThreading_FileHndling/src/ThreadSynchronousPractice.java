import java.util.Scanner;

class Account{
    private int bal;
    public Account(int bal){
        this.bal = bal;
    }
    public boolean isSufficientBal(int amt){
        if (bal > amt){
            return true;
        }
        else
            return false;
    }
    public void withdraw(int amt){
        bal = bal-amt;
        System.out.println("Withdrawal amount: "+amt);
        System.out.println("Current Account: "+bal);
    }

}
class Customer implements Runnable{
    private Account account;
    private String name;
    public Customer(Account acc , String name){
        this.account=acc;
        this.name=name;
    }
    @Override
    public void run() {
        Scanner ip = new Scanner(System.in);
        synchronized (account) {
            System.out.println(name + ",Enter withdraw amount");
            int amt = ip.nextInt();
            if (account.isSufficientBal(amt)) {
                account.withdraw(amt);
            } else
                System.out.println(name + ",Insufficient Amount");
        }
    }
}


public class ThreadSynchronousPractice {
    public static void main(String[] args) {
        Account a1 = new Account(1000);
        Customer c1 = new Customer(a1,"Hansa");
        Customer c2 = new Customer(a1,"Hannah");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        t2.start();
        t1.start();


            }
        }
