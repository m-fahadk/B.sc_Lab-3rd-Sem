class Accounts {

    int id;
    String account_holder_name;
    String address;
    double balance;
    double rate;

    Accounts(int id, String account_holder_name, double balance, double rate) {

        this.id = id;
        this.account_holder_name = account_holder_name;
        this.balance = balance;
        this.rate = rate;
    }

    void deposit(int amount) {

        balance += amount;
    }

    void withdraw(int amount) {

        balance -= amount;
    }

    static void calculateSimpleInterest(Accounts object, int time) {

        double simpleInterest = (object.balance) * (object.rate) * time;
        object.balance += simpleInterest;

        System.out.println("Simple Interest = " + simpleInterest);
        System.out.println("New balance = $" + object.balance);
    }

    static void calculateCompoundInterest(Accounts object, int time, int m) {

        double compoundInterest = (object.balance) * Math.pow((1 + object.rate / m), time * m);
        object.balance += compoundInterest;

        System.out.println("Compound Interest = " + compoundInterest);
        System.out.println("New balance = $" + object.balance);
    }

    void display(){

        System.out.println("\nAccount id->\t\t "+this.id);
        System.out.println("Name of account holder-> "+account_holder_name);
        System.out.println("Balance->\t\t $"+this.balance);
        System.out.println("Interest rate-> \t "+this.rate);
    }
}

public class ExtraP3_Accounts{
    
    public static void main(String[] args) {
        
        Accounts a1 = new Accounts(1,"Fahad",5000,0.15);
        a1.display();

        Accounts.calculateSimpleInterest(a1, 5);
    }
}
