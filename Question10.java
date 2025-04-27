import java.util.ArrayList;

class BankAccount {
    protected int accountNo;
    protected double balance;

    public BankAccount(int accountNo, double balance) {
        this.accountNo = accountNo;
        this.balance = balance;
    }

    public double calculateInterest() {
        return balance * 0.04;
    }

    public void display() {
        System.out.println("Account No: " + accountNo + ", Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(int accountNo, double balance) {
        super(accountNo, balance);
    }

    @Override
    public double calculateInterest() {
        return balance * 0.05;
    }
}

class CurrentAccount extends BankAccount {
    private double overdraftAmount;

    public CurrentAccount(int accountNo, double balance, double overdraftAmount) {
        super(accountNo, balance);
        this.overdraftAmount = overdraftAmount;
    }

    @Override
    public double calculateInterest() {
        return balance * 0.02;
    }

    public void displayOverdraftAmount() {
        System.out.println("Overdraft Amount: " + overdraftAmount);
    }
}

public class Question10 {
    private static ArrayList<BankAccount> accounts = new ArrayList<>();

    public static void addAccount(BankAccount account) {
        accounts.add(account);
    }

    public static void displayAccounts() {
        for (BankAccount account : accounts) {
            account.display();
        }
    }

    public static boolean verifyAccount(int accountNo) {
        for (BankAccount account : accounts) {
            if (account.accountNo == accountNo) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(101, 5000);
        CurrentAccount ca = new CurrentAccount(102, 10000, 2000);

        addAccount(sa);
        addAccount(ca);

        displayAccounts();

        System.out.println("Account 101 exists: " + verifyAccount(101));
        System.out.println("Account 999 exists: " + verifyAccount(999));

        ca.displayOverdraftAmount();
    }
}
