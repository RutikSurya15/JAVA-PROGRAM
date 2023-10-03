public class DeleteEle {
    static void RemoveElement(int arr[],int Removele)
    {
        int[] arr1=new int[arr.length];
        int idx=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=Removele)
            {
                arr1[idx]=arr[i];
                idx++;
            }
        }
        for(int i=0;i<arr1.length-1;i++)
        {
            System.out.println(arr1[i]);
        }
         System.out.println("Element 3 is Deleted Successfully");


    }
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6};
        int Removele=3;
        RemoveElement(arr,Removele);
    }    
}
