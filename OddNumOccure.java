public class OddNumOccure 
{
    static void PrintArr(int arr[],int n)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=1;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
            }
            if(count%2!=0)
            {
                System.out.print(arr[i]+" "+count);
            }
        }
    }
    public static void main(String args[])
    {
        int arr[]={1,2,4,6,8,1,3,2,4,5,2,1,3,5,6,4,7,4,2,1,4};
        int n=arr.length;
        PrintArr(arr,n);
    }
    
}
