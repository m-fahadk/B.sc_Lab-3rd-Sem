import java.util.Scanner;
public class P5_factorial 
{
    public static int factorial(int n)
    {
        if(n == 1)
            return 1;
        
        return factorial(n-1)*n;
    }
    
    
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no. : ");
        int number = input.nextInt();
        
        System.out.println("Factorial ="+factorial(number));

    }
    
}