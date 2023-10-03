public class FrrquncyofArray {
    int arr[]={2,3,6,6,2,5,4};
    int vistArr[]=new int[arr.length];
    int visited=-1;
    for(int i=0;i<arr.length;i++)
    {
        int count=0;
        for(int j=i+1;j<arr.length;i++)
        {
            if(arr[i]==arr[j])
            {
                count++;
                vistArr[j]=visited;
            }
        }
        if(vistArr[i]!=visited)
        {
            vistArr[i]=count;
        }
    }
    for(int i=0;i<vistArr.length;i++)
    {
        if(vistArr[i]!=visited)
        {
            System.out.println("Frequency of "+arr[i]+":"+count);
        }
    }
    
}
