package labbook;
class BankAccountExample {
    public static void main(String[] args) {
        // Create a person object
        Person person = new Person("John", 30);

        // Create a bank account object and associate it with the person
        BankAccount account = new BankAccount(123456789, person);

        // Deposit funds
        account.deposit(1000.0);

        // Withdraw funds
        account.withdraw(500.0);

        // Display person information
        person.displayPersonInfo();
    }
}

class BankAccount{
    private long accountNumber;
    private Person accountHolder;
    private double balance;

	public BankAccount(long accountNumber, Person accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 500;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public Person getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of " + amount + " successful. New balance: " + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of " + amount + " successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds. Withdrawal unsuccessful.");
        }
    }

    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolder.getName());
        System.out.println("Balance: " + balance);
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
    	return name;
    }

    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
