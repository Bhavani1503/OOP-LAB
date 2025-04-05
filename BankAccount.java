class BankAccount {
    private String name;
    private double balance;
    private String accountType;

    public BankAccount(String name, double deposit) {
        this.name = name;
        this.balance = deposit;
        this.accountType = "Savings";
    }

    public BankAccount(String name, double deposit, String accountType) {
        this.name = name;
        this.balance = deposit;
        this.accountType = accountType;
    }

    public BankAccount() {
        this.name = "Anonymous";
        this.balance = 0.0;
        this.accountType = "Checking";
    }

    public void displayAccountDetails() {
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: $" + balance);
        System.out.println("Account Type: " + accountType);
    }

    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Alice", 1000);
        account1.displayAccountDetails(); 

        BankAccount account2 = new BankAccount("Bob", 5000, "Checking");
        account2.displayAccountDetails(); 

        BankAccount account3 = new BankAccount();
        account3.displayAccountDetails();
    }
}
