class BankAccount {

    // مخفی کردن داده
    private int balance;

    // Setter
    public void setBalance(int balance) {

        // اعتبارسنجی
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("موجودی نمی‌تواند منفی باشد!");
        }
    }

    // Getter
    public int getBalance() {
        return balance;
    }
}