public class Question6 {
    private int accountNumber;
    private double balance;
    private static double interestRate; // Same for all accounts

    public Question6(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public static void setInterestRate(double rate) {
        interestRate = rate;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void displayInterestRate() {
        System.out.println("Interest Rate: " + interestRate + "%");
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double calculateInterest() {
        return (balance * interestRate) / 100;
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Calculated Interest: " + calculateInterest());
    }

    public static void main(String[] args) {
        Question6 account = new Question6(12345, 5000);

        setInterestRate(5.5);

        account.displayAccountInfo();
    }
}
