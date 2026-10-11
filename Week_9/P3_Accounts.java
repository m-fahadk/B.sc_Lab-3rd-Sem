public class P3_Accounts {

    int id;
    String account_holder_name;
    String address;
    double balance;


    P3_Accounts(int id, String name, String address, double balance) {
        this.id = id;
        this.account_holder_name = name;
        this.address = address;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        balance -= amount;
    }

    static double calculateSimpleInterest(double principal, int time) {

        return (principal * 0.2 * time) ;
    }

    static double calculateCompoundInterest(double principal, int time) {

        return principal * Math.pow(1 + 0.2 , time) - principal;
    }

    public static void main(String[] args) {

        P3_Accounts a1 = new P3_Accounts(101, "Fahad", "India", 10000);

        a1.deposit(2000);
        a1.withdraw(1000);

        System.out.println("Accounts ID: " + a1.id);
        System.out.println("Accounts Holder: " + a1.account_holder_name);
        System.out.println("Address: " + a1.address);
        System.out.println("Balance: " + a1.balance);

        double SI = P3_Accounts.calculateSimpleInterest(a1.balance, 2);
        double CI = P3_Accounts.calculateCompoundInterest(a1.balance, 2);

        System.out.println("Simple Interest: " + SI);
        System.out.println("Compound Interest: " + CI);
    }
}