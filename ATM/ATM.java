package ATM;


class ATM {

    private Account account;

    public ATM(Account account) {
        this.account = account;
    }

    public boolean login(int enteredPin) {
        return account.validatePin(enteredPin);
    }

    public void depositMoney(double amount) {
        account.deposit(amount);
        displayBalance();
    }

    public void withdrawMoney(double amount) {

        if (amount > 0 && account.checkBalance() >= amount) {
            account.withdraw(amount);
            displayBalance();
        }
    }

    public void displayBalance() {
        System.out.println("Account No : " + account.getAccountNo());
        System.out.println("Account Holder Name : " + account.getAccountHolder());
        System.out.println("Current Balance : " + account.checkBalance());
    }

}
