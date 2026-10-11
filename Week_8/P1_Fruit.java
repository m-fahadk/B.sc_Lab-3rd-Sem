class Fruit{
    String name;
    String colour;
    String taste;
    int price;

    void display(){
        System.out.println("\nName -> "+name);
        System.out.println("Colour -> "+colour);
        System.out.println("Taste -> "+taste);
        System.out.println("Price -> $"+price);
    }
}

public class P1_Fruit{
    public static void main(String[] args){

        Fruit banana = new Fruit();
        banana.name = "Banana";
        banana.colour = "Yellow";
        banana.taste = "Sweet";
        banana.price = 50;

        Fruit grapes = new Fruit();
        grapes.name = "Grapes";
        grapes.colour = "Green";
        grapes.taste = "Sour";
        grapes.price = 100;

        Fruit apples = new Fruit();
        apples.name = "Apples";
        apples.colour = "Red";
        apples.taste = "Sweet";
        apples.price = 150;

        banana.display(); 
        grapes.display();
        apples.display();
    }
}