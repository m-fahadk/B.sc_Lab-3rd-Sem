
import java.util.Scanner;

public class _4_min_max_array
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the no. of elements you want to enter: ");
        int size = input.nextInt();

        int arr[] = new int[size];
        int max = 0, min = 0;

        System.out.println("Enter the elements of array: ");

        for (int i = 0; i < size; i++) 
        {
            arr[i] = input.nextInt();
        }

        for (int j = 1; j < size; j++) 
        {
            if (arr[max] < arr[j]) {
                max = j;
            }

            if (arr[min] > arr[j]) {
                min = j;
            }
        }
        System.out.println("Max = " + arr[max] + "\nMin = " + arr[min]);
    }
}
