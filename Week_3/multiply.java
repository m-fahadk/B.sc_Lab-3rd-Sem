import java.util.Scanner;

public class multiply {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        float a,b,c;

        System.out.print("Enter the 1st no. : ");
        a = sc.nextFloat();

        System.out.print("Enter the 2nd no. : ");
        b = sc.nextFloat();

        c=a*b;

        System.out.println("Product = "+c);

    }
}
