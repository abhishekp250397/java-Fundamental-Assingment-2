
package Assignment2;

import java.lang.*;

public class Program_5 
{
    public static void main(String args[])
    {
     int rows=9,z=1;
     for(int i=rows;i>=1;i--)
     {
         for(int j=1;j<=i-1;j++)
         {
             System.out.print(" ");
         } 
         for(int k=i;k<=rows;k++)
         {
             
             System.out.print(k);
         }
         for(int l=rows-1;l>=i;l--)
         {
             
             System.out.print(l);
            
         }    System.out.println();    
     }
    }
   }
