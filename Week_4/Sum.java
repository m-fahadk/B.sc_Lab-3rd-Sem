import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int n = input.nextInt();
        int sum =0;

        for(int i =1 ; i<=n;i++)
        {
            sum += i;
        }
        System.out.println("Sum = "+sum);
    }

}
