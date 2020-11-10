
package Assignment2;


public class Program_2 
{
    public static void main(String args[])
    {
     int rows=9,z=1;
     for(int i=1;i<=rows;i++)
     {
         for(int j=rows-1;j>=i;j--)
         {
             System.out.print(" ");
         }
         for(int k=1;k<=z;k++)
         {
             System.out.print(k+" ");
         }
         z++;
         System.out.println();
     }
    }
   }
