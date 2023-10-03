public class RemoveDuplicate1 {
    public static void main(String args[])
    {
        int arr[]={1,2,2,3,4,4,5,6,6,7};
        int l=arr.length;
        int temp[]=new int[arr.length];
        int j=0;
        for(int i=0;i<l-1;i++)
        {
            if(arr[i]!=arr[i+1])
            {
                temp[j++]=arr[i];
            }
        }
        temp[j++]=arr[l-1];
        for(int i=0;i<j;i++)
        {
            System.out.print(temp[i]+" ");
        }

       
    }
    
}
