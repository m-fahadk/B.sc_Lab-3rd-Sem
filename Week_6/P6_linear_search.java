
import java.util.Scanner;

public class P6_linear_search {

    public static void main(String[] args) {
        System.out.println("Enter the no. of elements you want to enter: ");
        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int arr[] = new int[size];

        System.out.print("Enter the elements: ");

        for (int i = 0; i < size; i++) {
            arr[i]=input.nextInt();
        }

        System.out.print("Enter the no. to be searched : ");
        int target =input.nextInt();
        boolean targetFound = false;

        int j;
        for(j=0;j<size;j++)
        {
            if(target==arr[j])
            {
                targetFound = true;
                break;
            }
        }

        if(targetFound)
        {
            System.out.println("Target "+target+" found at index -> "+j);
        }
        else{
            System.out.println("Target not found");
        }
        input.close();

    }
}
