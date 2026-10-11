
class Fruit {

    String name;
    String colour;
    String taste;
    int price;


    Fruit(String name, String colour){

        this(name);
        this.colour =colour;
    }

     Fruit(String name, String colour, String taste) 
    {

        this(name,colour);
        this.taste = taste;
    }

    Fruit(String name, String colour, String taste, int price) 
    {

        this(name,colour,taste);   
        this.price = price;
    }

    Fruit(String name){

        this.name = name;
        this.colour = "Unknown";
        this.taste = "Unknown";
        this.price = 0;
    }


    void display() {
        System.out.println("\nName -> " + name);
        System.out.println("Colour -> " + colour);
        System.out.println("Taste -> " + taste);
        System.out.println("Price -> $" + price);
    }
}

public class P5_Constructor_chaining {

    public static void main(String[] args) {

        Fruit banana = new Fruit("Banana","Yellow");
        // Fruit banana = new Fruit("Banana","Yellow", "Sweet", 60);

        Fruit mango = new Fruit("Mango", "Yellow or Green", "Very Sweet");

        Fruit orange = new Fruit("Orange", "Orange", "Sour", 80);

        banana.display();
        mango.display();
        orange.display();
    }
}
