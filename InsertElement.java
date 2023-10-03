import java.util.*;
public class InsertElement {
    public static void main(String args[])
    {
        int arr[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the element in an Array:");
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("The array element is: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println("Enter the Position u want to insert element: ");
        int loc=sc.nextInt();
        System.out.println("Enter the element U want to insert: ");
        int val=sc.nextInt();
        for(int i=arr.length-1;i>loc;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[loc]=val;
        for(int i:arr)
        {
            System.out.println(i);
        }
    }
    
}
