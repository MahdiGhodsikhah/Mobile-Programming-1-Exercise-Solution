public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.balance = 1000;

        // برداشت غیرمجاز!
        account.balance = -5000;

        System.out.println(account.balance);
    }
}