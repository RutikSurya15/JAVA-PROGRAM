public class PrimeNumber {
    static void isPrime(int n)
    {
        int count=0;
        if(n%2==0)
        {
            System.out.println("Not Prime");
        }
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }

        }
        if(count<3)
        {
            System.out.println("Number is Prime");
        }
        else
        {
            System.out.println("Number is not prime");
        }
    }
    public static void main(String args[])
    {
        int n=21;
        isPrime(n);
    }
    
}
