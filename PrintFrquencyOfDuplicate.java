import java.util.*;
public class PrintFrquencyOfDuplicate {
    static void printDuplicate(int arr[])
    {
        
        for(int i=0;i<arr.length-1;i++)
        {
            int count=1;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                }
                else
                {
                    break;
                }
            }
            if(count>1)
            {
                System.out.println(arr[i]+" -> "+count);
                i+=count-1;
            }
        }
    }
    public static void main(String args[])
    {
        int arr[]={1,2,4,2,3,5,6,1};
        printDuplicate(arr);

    }
}
