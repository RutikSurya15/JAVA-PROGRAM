import java.util.*;
public class ArrayTowDArray
{
   public static void main(String args[]) 
   {
        Sacnner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nectInt();

        int numbers[][]=new int[row][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                numbers[i][j]=sc.nextInt();
            }
        }
        System.out.println("The output Matrix is");
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }
   }
}
