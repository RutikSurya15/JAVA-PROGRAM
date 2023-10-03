import java.io.CharArrayReader;

public class StringBuld {
    /*public static void main(String args[])
    {
        StringBuilder sc=new StringBuilder("Rutik");
        for(int i=0;i<sc.length()/2;i++)
        {
            int frant=0;
            int back=sc.length()-1-i;

            char fortchr=sc.charAt(frant);
            char backchar=sc.charAt(back);

            sc.setCharAt(frant, backchar);
            sc.setCharAt(back, fortchr);
        }
        System.out.println(sc);
    }*/
    public static void main(String args[])
    {
        String str="Hello";
        char ch[]=str.toCharArray();
        for(int i=ch.length-1;i>=0;i--)
        {
            System.out.print(ch[i]);
        }
    }
}
