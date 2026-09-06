public class array
{
    public static void main(String[] args) {
        
        int[] array = new int[10];
        int i;

        for(i=0;i<10;i++)
        {
            array[i]=(i+1)*10;
        }
        for(i=0;i<10;i++)
        {
            System.out.println(array[i]);
        }

    }
}