class BankAccount {
    double balance = 5000;

    void showBalance() {
        System.out.println("Account balance: $" + balance);
    }
}
class SavingsAccount extends BankAccount {
    double interestRate = 5.0;

    void addInterest() {
        balance += balance * (interestRate / 100);
        System.out.println("Interest added. New balance: $" + balance);
    }
}
class FixedDepositAccount extends SavingsAccount {
    void fixedDeposit(double amount) {
        balance += amount;
        System.out.println("Fixed deposit of $" + amount + " added. Updated balance: $" + balance);
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        FixedDepositAccount myAccount = new FixedDepositAccount();

        myAccount.showBalance();
        myAccount.addInterest();
        myAccount.fixedDeposit(2000);
    }
}
