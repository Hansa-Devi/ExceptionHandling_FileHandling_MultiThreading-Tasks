import java.util.Scanner;

public class BankingSystem_ExceptionHandling {
    public static void main(String[] args) {
        double balance = 5000;
        Scanner ip = new Scanner(System.in);
        System.out.println("Enter withdraw amount:");
        double withdraw =ip.nextDouble();
        try {
            if (withdraw > balance) throw new ArithmeticException("Balance is insufficient");
            balance = balance-withdraw;
            System.out.println("Transaction Successfully completed.");
            System.out.println("Remaining Balance is:"+balance);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception: "+e.getMessage());
        }
        finally {
            System.out.println("***** Program completed *****");
        }



    }
}
