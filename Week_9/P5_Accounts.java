abstract class Account2 {

    int id;
    String account_holder_name;
    String address;
    int balance;


    Account2(int id, String account_holder_name, String address) {
        this.id = id;
        this.account_holder_name = account_holder_name;
        this.address = address;
    }

    abstract void deposit(int amount);

    abstract void withdraw(int amount);
}


class Saving extends Account2 {

    int min_balance;

    Saving(int id, String account_holder_name, String address,
           int min_balance) {

        super(id, account_holder_name, address);
        this.min_balance = min_balance;
        balance = min_balance;
    }

    void display() {
        System.out.println("\n--- Saving Account ---");
        System.out.println("ID: " + id);
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Address: " + address);
        System.out.println("Minimum Balance: " + min_balance);
        System.out.println("Balance: " + balance);
    }

    void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(int amount) {

        if (balance - amount >= min_balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal not allowed.");
            System.out.println("Minimum balance must be maintained.");
        }
    }
}


class Current extends Account2 {

    int max_withdrawal_limit;

    Current(int id, String account_holder_name, String address,
            int max_withdrawal_limit) {

        super(id, account_holder_name, address);
        this.max_withdrawal_limit = max_withdrawal_limit;
        balance = 0;
    }

    void display() {
        System.out.println("\n--- Current Account ---");
        System.out.println("ID: " + id);
        System.out.println("Account Holder: " + account_holder_name);
        System.out.println("Address: " + address);
        System.out.println("Maximum Withdrawal Limit: "
                           + max_withdrawal_limit);
        System.out.println("Balance: " + balance);
    }

    void deposit(int amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(int amount) {

        if (amount <= max_withdrawal_limit && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Withdrawal not allowed.");
        }
    }
}


public class P5_Accounts{

    public static void main(String[] args) {

        Saving s = new Saving(
            101,
            "Fahad",
            "Aligarh",
            1000
        );

        s.deposit(5000);
        s.withdraw(2000);
        s.display();


        Current c = new Current(
            102,
            "Ahmed",
            "Delhi",
            3000
        );

        c.deposit(10000);
        c.withdraw(2500);
        c.display();
    }
}