
package Assignment2;
import java.util.Scanner;

public class Program_11 {
    public static void main(String[] args)
    {
	
	int n=9;	 
           
	for(int i=n;i>0;i--)
               {
	     if(i==1 || i==n)
                       for(int j=1;j<=i;j++)
                         {
                               System.out.print("*");
                        }
                   else
	    {
                       for(int j=1;j<=i;j++)         
                       {  
                          	if(j==1 || j==i)
                              	System.out.print("*");
                              else
                                            System.out.print(" ");
                        }
                    }
                     System.out.println();   
               }             
    }
}
    

