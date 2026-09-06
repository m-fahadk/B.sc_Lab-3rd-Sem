import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a no. : ");
        int n= input.nextInt();

        for(int i=1; i<=10;i++)
        {
            System.out.println(n+" x "+i+" = "+n*i);
        }
        input.close();
    }
}
