public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();

        account.balance = 2000;

        // مقدار غیرمجاز
        account.balance = -10000;

        System.out.println(account.balance);
    }
}