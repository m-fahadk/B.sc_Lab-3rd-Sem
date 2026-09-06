import java.util.Scanner;

public class digit_sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a no. : ");
        int n = input.nextInt();
        int sum =0;

        while (n>0) 
        {
            sum +=n%10;
            n=n/10;    
        }
        System.out.println("Sum = "+sum);
    }
}
