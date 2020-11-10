
package Assignment2;

public class Program_1 {
    public static void main(String args[])
    {
        int rows=9,z=1;
        for(int i=1;i<=rows;i++)//for rows
        {
            for(int j=rows-1;j>=i;j--)//for white spaces before
            {                
                System.out.print(" ");
            }
            for(int k=1;k<=z;k++)//for printing numbers
            {
                System.out.print(i+" ");
            }
            z++;
            System.out.println();
        }
    }
    
}
    