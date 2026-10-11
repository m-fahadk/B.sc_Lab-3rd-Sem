
class Fruit {

    String name;
    String colour;
    String taste;
    int price;

    void set_details(String name, String colour, String taste, int price) {
        this.name = name;
        this.colour = colour;
        this.taste = taste;
        this.price = price;
    }

    void display() {
        System.out.println("\nName -> " + name);
        System.out.println("Colour -> " + colour);
        System.out.println("Taste -> " + taste);
        System.out.println("Price -> $" + price);
    }
}

public class P2_Fruit {

    public static void main(String[] args) {

        Fruit banana = new Fruit();
        banana.set_details("Banana", "Yellow", "Sweet", 60);

        Fruit mango = new Fruit();
        mango.set_details("Mango", "Yellow or Green", "Very Sweet", 100);

        Fruit orange = new Fruit();
        orange.set_details("Orange", "Orange", "Sour", 80);

        banana.display();
        mango.display();
        orange.display();
    }
}
