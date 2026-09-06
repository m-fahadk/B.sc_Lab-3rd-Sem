import java.util.Scanner;

public class Less_than_10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int n = input.nextInt();

        while(n>=10)
        {
            System.out.println(n);
            n /= 2;
        }
    }
}
