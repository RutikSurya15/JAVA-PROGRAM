public class Fibbonacci {
    static void fibbSeries(int n,int a,int b)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
    }
    public static void main(String args[])
    {
        int n=10;
        fibbSeries(10,0,1);
    }
    
}
