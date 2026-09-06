import java.util.Scanner;

public class avg {
    public static void main(String[] args) {
        float a,b,c,avg;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st no. : ");
        a = sc.nextFloat();

        System.out.print("Enter 2nd no. : ");
        b = sc.nextFloat();

        System.out.print("Enter 3rd no. : ");
        c = sc.nextFloat();

        avg = (a+b+c)/3;

        System.out.println("Avg = "+avg);
    }
    
}
