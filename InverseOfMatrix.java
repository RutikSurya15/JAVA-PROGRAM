import java.util.*;
public class InverseOfMatrix {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();

        int number[][]=new int[row][col];

        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                number[i][j]=sc.nextInt();
            }
        }
        System.out.println("The array list is: ");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(number[j][i]);
            }
            System.out.println();
        }

    }
    
}
