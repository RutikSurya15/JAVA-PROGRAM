public class RecursionFactorial {
    public static int Fact(int n)
    {
        if(n==1||n==0)
        {
            return 1;
        }
        int Fact_n=Fact(n-1);
        int factorial=n*Fact_n;
        return factorial;
    }
    public static void main(String args[])
    {
        int n=5;
        int result=Fact(n);
        System.out.println(result);
    }
    
}
