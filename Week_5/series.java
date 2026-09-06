import java.util.Scanner;

public class series {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        double n = input.nextDouble();
        double sum = 0;

        for(double i=1;i<=n;i++)
        {
            sum+= (1/i);
        }
        System.out.println("Sum = "+sum);
    }
}
