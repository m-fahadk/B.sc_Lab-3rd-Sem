import java.util.*;

public class Even_Odd
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a no. : ");
        int n1 = input.nextInt();
  
        if(n1%2 == 0)
        {
            System.out.println(n1+" is Even");
        }
        else
            System.out.println(n1+" is Odd");


    }
} 