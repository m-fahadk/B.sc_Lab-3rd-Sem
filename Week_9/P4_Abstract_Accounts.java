abstract class Account {


    int id;
    String account_holder_name;
    String address;


    Account(int id, String account_holder_name, String address) {
        this.id = id;
        this.account_holder_name = account_holder_name;
        this.address = address;
    }


    abstract void deposit(int amount);

    abstract void withdraw(int amount);
}



class SavingsAccount extends Account {

    int balance;


    SavingsAccount(int id, String account_holder_name, String address,int balance) {
        super(id, account_holder_name, address);
        this.balance =balance;
    }


    void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }


    void withdraw(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Address: " + address);
        System.out.println("Balance: " + balance);
    }
}


// Main class
public class P4_Abstract_Accounts {

    public static void main(String[] args) {

        SavingsAccount account =
            new SavingsAccount(101, "Fahad", "Aligarh",500);

        account.display();

        account.deposit(5000);
        account.withdraw(1500);

        System.out.println("Final Balance: " + account.balance);
    }
}