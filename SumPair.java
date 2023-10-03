public class SumPair {
    static void PrintPair(int arr[],int n)
    { 
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=0;
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }
        }
        System.out.print(arr[0]+" "+arr[1]);
    }
    public static void main(String args[])
    {
        int arr[]={4,1,3,6,7,2};
        int n=arr.length;
        PrintPair(arr,n);
    }
    
}
