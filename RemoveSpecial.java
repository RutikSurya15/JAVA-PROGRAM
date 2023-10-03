public class RemoveSpecial {
    public static void main(String args[])
    {
        String str="@ru%$t*i!k";
        String planText=str.replaceAll("[^A-Za-z0-9]","");
        System.out.println(planText);
    }
    
}
