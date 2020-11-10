
package Assignment2;

import java.lang.*;

public class Program_4 
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
         for(int k=(i-1);k>=-(i-1);k--)
         {
             int l= Math.abs(k);
             System.out.print(i-l);
         }
         System.out.println();
     }
    }
   }
