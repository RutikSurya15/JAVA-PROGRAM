public class RecursionFibbo {
    public static void Fibbo(int a,int b,int n)
    {
        if(n==0)
        {
            return;
        }
        int c=a+b;
        System.out.print(c+" ");
        Fibbo(b,c,n-1);
    }
    public static void main(String args[])
    {
        int a=0,b=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        int n=10;
        Fibbo(a,b,n-2);
    }
    
}
