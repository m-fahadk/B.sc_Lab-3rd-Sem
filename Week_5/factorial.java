import java.util.*;

public class factorial {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. to calculate factorial : ");
        int n = sc.nextInt();
        int factorial =1;
        for(int i =1;i<=n;i++)
            factorial *= i;

        System.out.println("Factorial = "+factorial);
    }

}
