import java.util.Scanner;

public class array_sum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no. of digits you want to enter : ");
        int n = input.nextInt();
        int[] array = new int[n];
        int sum = 0;
        System.out.print("Enter a digit : ");

        for (int i = 0; i < n; i++) {
            int a = input.nextInt();
            array[i] = a;
        }
        System.out.print("[ ");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
            sum += array[i];
        }
        System.out.println(" ]");
        System.out.println("\nSum =" + sum);
        input.close();
    }
}
