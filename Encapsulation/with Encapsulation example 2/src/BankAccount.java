class BankAccount {

    private int balance;

    // متد واریز
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // متد برداشت
    public void withdraw(int amount) {

        if (amount > balance) {
            System.out.println("موجودی کافی نیست!");
        } else if (amount > 0) {
            balance -= amount;
        }
    }

    // فقط خواندن موجودی
    public int getBalance() {
        return balance;
    }
}