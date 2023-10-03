public class RemoveDuplicate {
    public static void main(String args[])
    {
        String str="Programming";
        char arr[]=str.toCharArray();
        StringBuilder sc=new StringBuilder();
        for(int i=0;i<arr.length;i++)
        {
            boolean repeted=false;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    repeted=true;
                    break;
                }
            }
            if(!repeted)
            {
                 sc.append(arr[i]);
            }
        }
        System.out.println(sc);
        

    }
}
