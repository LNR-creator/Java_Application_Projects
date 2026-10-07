package ATM;

class Account {
    protected int accountno;
    protected String accountHolder;
    protected double balance;
    protected int pin;

    Account(int accountno, String accountHolder, double balance, int pin) {
        this.accountno = accountno;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.pin = pin;
    }

    public int getAccountNo() {
        return accountno;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public boolean validatePin(int enteredPin) {
        if (enteredPin == pin)
            return true;
        else
            return false;
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount && amount > 0) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public double checkBalance() {
        return balance;
    }

}