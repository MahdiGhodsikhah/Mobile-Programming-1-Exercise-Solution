public class Main {

    public static void main(String[] args) {

        BankAccount account = new BankAccount();


        account.setBalance(2000);

        // تلاش برای مقدار غیرمجاز
        account.setBalance(-10000);

        System.out.println(account.getBalance());
    }
}