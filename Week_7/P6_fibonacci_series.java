import java.util.Scanner;

public class P6_fibonacci_series
{

    public static void fibonacci_series_with_loop(int num){

        int ft=0,nt=1,nnt;

        for(int i=0;i<num;i++){

            System.out.print(ft+" ");
            nnt =ft+nt;
            ft=nt;
            nt=nnt;
        }
    }

    public static void fibonacci_series_with_recursion(int ft,int nt,int n){

        if(n==0){
            return ; 
        }
        n--;
        System.out.print(ft+" ");

        fibonacci_series_with_recursion(nt,ft+nt,n);

    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of term of series: ");
        int num = sc.nextInt();

        fibonacci_series_with_loop(num);
        System.out.println("\n\n");
        fibonacci_series_with_recursion(0, 1, num);


    }
}