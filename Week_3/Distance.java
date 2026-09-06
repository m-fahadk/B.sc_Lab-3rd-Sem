import java.util.Scanner;

public class Distance{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1,b,c,d,distance;

        System.out.print("Enter the x-1 Coordinate : ");
        x1 = sc.nextDouble();

        System.out.print("Enter the y-1 Coordinate : ");
        b = sc.nextDouble();
        
        System.out.print("Enter the x-2 Coordinate : ");
        c = sc.nextDouble();

        System.out.print("Enter the y-2 Coordinate : ");
        d = sc.nextDouble();
   
        distance = Math.sqrt(Math.pow(d-b,2)+Math.pow(c-x1,2));
        System.out.println("Distance = "+distance);
    }
}