abstract class BankAccount {
    double balance;
    
    BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    
    void showBalance() {
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    
    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }
    
    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Not enough money");
        }
    }
}

class CheckingAccount extends BankAccount {
    CheckingAccount(double initialBalance) {
        super(initialBalance);
    }
    
    @Override
    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }
    
    @Override
    void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrew: $" + amount);
    }
}

public class SimpleBank {
    public static void main(String[] args) {
        BankAccount savings = new SavingsAccount(100);
        BankAccount checking = new CheckingAccount(200);
        
        savings.deposit(50);
        savings.withdraw(30);
        savings.showBalance();
        
        checking.deposit(100);
        checking.withdraw(250); // Can go negative
        checking.showBalance();
    }
}