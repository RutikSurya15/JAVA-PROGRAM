public class PalinNum {
    public static void main(String args[])
    {
        int n=1001;
        int t=n;
        while(n!=0)
        {
            int rem=n%10;
            n=rem+10*n;
            n=n/10;
        }
        if(n==t)
        {
            System.out.println("Palindrone");
        }
        else
        {
            System.out.println("Not Palindrone");
        }
    }
    
}
