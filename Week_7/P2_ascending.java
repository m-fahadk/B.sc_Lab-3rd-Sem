import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class P2_ascending {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no. of elements :");
        
        int size = input.nextInt();
        int arr[] = new int[size];
        
        System.out.print("Enter the elemets of array :");
        for(int i =0;i<size;i++)
        {
            arr[i] = input.nextInt();
        }
        
        
        int temp;
        for(int j =0;j<size;j++)
        {
            for(int k = 0;k<size-j-1;k++)
            {
                if(arr[k]>arr[k+1])
                {
                    temp = arr[k];
                    arr[k] = arr[k+1];
                    arr[k+1] = temp;
                }
            }      
        }
        System.out.print("Sorted array : ");
        for(int e:arr)
        {
            System.out.print(e+" ");
        }
    }
}
