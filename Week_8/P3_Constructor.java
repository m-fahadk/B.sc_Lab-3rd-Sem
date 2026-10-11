
class Fruit {

    String name;
    String colour;
    String taste;
    int price;

    Fruit(String name, String colour, String taste, int price) {

        this.name = name;
        this.colour = colour;
        this.taste = taste;
        this.price = price;
    }

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

public class P3_Constructor {

    public static void main(String[] args) {

        Fruit banana = new Fruit("Banana","Yellow", "Sweet", 60);

        Fruit mango = new Fruit("Mango", "Yellow or Green", "Very Sweet", 100);

        Fruit orange = new Fruit("Orange", "Orange", "Sour", 80);

        banana.display();
        mango.display();
        orange.display();
    }
}
