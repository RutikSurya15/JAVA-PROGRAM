import java.util.*;
public class StringPalin {
    public static void main(String args[])
    {
        String str,rev="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        str=sc.next();

        int length=str.length();
        for(int i=length-1;i>=0;i--)
        {
            rev=rev+str.charAt(i);
        }

        if(str.equals(rev))
        {
            System.out.println("String is Palindrone");
        }
        else
        {
            System.out.println("String is not Palindrone");
        }

    }
    
}
