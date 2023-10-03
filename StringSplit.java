public class StringSplit {
    public static void main(String args[])
    {
        String str="Learn with Rutik";
        WordSplit(str);
    }
    static void WordSplit(String str)
    {
        String word[]=str.split(" ");
        for(int i=0;i<word.length;i++)
        {
            String s=word[i];
            System.out.println(s.charAt(0));
        }
    }
}