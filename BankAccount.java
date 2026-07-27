public class BankAccount {
    String owner;
    double balance; 
    void deposit(double amount) {
        balance += amount;
    }
    void withdraw(double amount) {
        if (amount > balance) { 
            System.out.println("Invalid!");
        } else {
            balance -= amount;
        }
    } 
    void getBalance() { 
        System.out.println("Final Balance " + balance);
    }
    void printStatement() {
        System.out.println("Owner: " + owner + ". Balance: " + balance);
    }
}