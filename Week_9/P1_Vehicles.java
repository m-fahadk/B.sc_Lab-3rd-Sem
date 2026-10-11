class Vehicle {

    int cost;
    String name;

    Vehicle(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    void cost() {

        System.out.print("\nCost = " + cost);
    }
}

class Bus extends Vehicle {

    Bus(String name, int cost) {
        super(name, cost);
    }

    void display() {

        System.out.print("\nThis is a " + name);
    }
}

class Train extends Vehicle {

    Train(String name, int cost) {
        super(name, cost);
    }

    void display() {

        System.out.print("\nThis is a "+name);
    }
}

public class P1_Vehicles {

    public static void main(String[] args) {

        Bus b = new Bus("Bus",500);
        Train t = new Train("Train",100);

        b.display();
        b.cost();

        t.display();
        t.cost();

    }
}
