package Week_6;
import java.util.Scanner;

public class _3_swapArray
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the no. of elements you want in array : ");
        int n = input.nextInt();
        int arr[] = new int[n];

        System.out.print("Enter all the elements : ");
        for(int i =0;i<n;i++)
        {
            arr[i] =input.nextInt();
        }
        int temp = arr[0];
        arr[0] = arr[n-1];
        arr[n-1] = temp;

        System.out.print("[ ");
        for(int j =0;j<n;j++)
        {
            System.out.print(arr[j]+" ");
        }
        System.out.print(" ]");
    }
}