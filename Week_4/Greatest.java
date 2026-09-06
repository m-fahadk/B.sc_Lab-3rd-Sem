import java.util.Scanner;

public class Greatest {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input 1st no. : ");
        int n1 = input.nextInt();
        System.out.print("Input 2nd no. : ");
        int n2 = input.nextInt();
        System.out.print("Input 3rd no. : ");
        int n3 = input.nextInt();

        int greatest = n1;

        if(n2 > greatest)
        {
            greatest =n2;
        }
        else if (n3 > greatest)
            greatest = n3;

        System.out.println("Greatest = "+greatest);


    }
}
