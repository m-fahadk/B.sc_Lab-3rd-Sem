package Week_6;
import java.util.Scanner;

public class _2_prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number : ");
        double n = input.nextInt();

        boolean isPrime = true;

        for(int i =2;i<Math.sqrt(n);i++)
        {
            if(n%i == 0)
                isPrime = false;
        }
        if(n==1)
            isPrime = false;

        if(isPrime)
            System.out.println(n+" is a Prime no.");

        else
            System.out.println(n+" is not a Prime no.");

        input.close();
    }
}
