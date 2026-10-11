
public class P5_primeNo
{
    public static boolean  isPrime(int n)
    {
        if(n < 2)
            return false;

        double n_sqrt = Math.sqrt(n);
        for(int i=2;i<=n_sqrt;i++)
        {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Prime Numbers ");

        for(int i=1;i<=100;i++)
        {
            if(isPrime(i))
            {
                System.out.print(i+" ");
            }
        }
    }
}