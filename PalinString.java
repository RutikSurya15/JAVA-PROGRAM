import java.util.*;
public class PalinString 
{
    public static void main(String args[])
    {
        String str="ABCCBA";
        String rev="";
        int len=str.length();
        for(int i=len-1;i>=0;--i)
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
