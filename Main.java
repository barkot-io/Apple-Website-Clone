public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.owner = "Abebe";
        myAccount.balance = 0.0;
        double depositAmount = 5000.00;
        double withdrawAmount = 500.00;
        
        System.out.println("Account: " + myAccount.owner);
        System.out.println("Balance: " + myAccount.balance);
        
        System.out.println("Depositing " + depositAmount);
        myAccount.deposit(depositAmount);
        System.out.println("Withdrawing: " + withdrawAmount);
        myAccount.withdraw(withdrawAmount);
        myAccount.getBalance();
        myAccount.printStatement();
    }
}